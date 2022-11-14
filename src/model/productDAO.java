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
public class productDAO {

  
 
    
    Connection con;
    Statement st;
    ResultSet sr;

    public productDAO() {
        String url = new urlDb().getUrl();
        try {
            con = DriverManager.getConnection(url);
            System.err.println("Connect");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public  ArrayList<productModel> getProductList (){
    String query ="select * from product";
      ArrayList<productModel> pr = new ArrayList<>();
        try {
            st = con.createStatement();
           sr= st.executeQuery(query); 
           while( sr.next()){
               productModel model = new productModel(sr.getString("id"), sr.getString("name"), sr.getInt("quantity"), sr.getString("categoryName"),sr.getInt("price"));
               pr.add(model);        
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return  pr;
    }    
    
    public  void addNewProduct(String id, String name, int quantity, String cat , int price) {
        
        String query = "Insert into product (id , name , categoryName , quantity , price) values ('"+id+"','"+name+"','"+cat+"','"+quantity+"',"+price+")";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        
    }

    public void deleteProduct(String id) {
        String query = "delete from product where id = '"+id+"'";
        try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProduct(String id, String name, int qty, String cat , int price) {
          String query = "update product set name='" +name + "' , categoryName ='" + cat + "',quantity =" +qty + " ,price =" +price + " where id='" + id + "'";
   
     try {
             st.executeUpdate(query);
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
