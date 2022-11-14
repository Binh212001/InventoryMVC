/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.categoryDAO;
import model.categoryModel;


/**
 *
 * @author hi
 */
public class categoryController {
      categoryDAO dao;

    public categoryController() {
        this.dao = new categoryDAO();
    }
    
    public  ArrayList<categoryModel> showCategory(){
        return dao.getCategoryList();
       
    } 
}
