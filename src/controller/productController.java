/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.productDAO;
import model.productModel;
import view.product;


/**
 *
 * @author hi
 */
public class productController {
    
    productDAO dao;

    public productController() {
        this.dao = new productDAO();
    }
    
    public  ArrayList<productModel> showProduct(){
        return dao.getProductList();
       
    } 

    public void addproduct(String id , String name , int quantity , String cat , int price) {
        dao.addNewProduct(id, name, quantity, cat , price);
    }

    public void delProduct(String id) {
       dao.deleteProduct(id);
    }

    public void updateProduct(String id, String name, int qty, String cat , int price ) {
       dao.updateProduct(id ,name , qty , cat , price);
    }

}
