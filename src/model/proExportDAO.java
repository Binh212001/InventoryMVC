/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hi
 */
public class proExportDAO {
    Connection con;
    Statement st;
    ResultSet sr;
       public proExportDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
            System.err.println("Connect");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
     public  ArrayList<exportModel> getExportInvoice (){
    String query ="select * from export join costomer on cosId = costomer.id";
      ArrayList<exportModel> ex = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               

               exportModel model = new exportModel(sr.getString("id"), sr.getString("name"),sr.getDate("createdAt"));
               ex.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  ex;
    }  

    public ArrayList<exportModel> getInvoiceList() {
       ArrayList<exportModel> m = new ArrayList<>();
         String query ="select * from export join costomer on cosId = costomer.id join exportiv on invoiceId = exportid join product exportiv.productId =product.id";
         
         return m;
    }
}
