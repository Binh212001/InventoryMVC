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
public class categoryDAO {
    
    
     Connection con;
    Statement st;
    ResultSet sr;

    public categoryDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
            System.err.println("Connect");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public  ArrayList<categoryModel> getCategoryList (){
    String query ="select * from category";
      ArrayList<categoryModel> cat = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               categoryModel model = new categoryModel(sr.getString("id"), sr.getString("categoryName"));
               cat.add(model);        
           }
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return  cat;
    }    
    
}
