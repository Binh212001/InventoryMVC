/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.exportModel;
import model.proExportDAO;

/**
 *
 * @author hi
 */
public class proExportController {
    
    proExportDAO   dao;

    public proExportController() {
        this.dao = new proExportDAO();
    }
    
    
    public  ArrayList<exportModel> getInvoice(){
        
       return dao.getExportInvoice();                
    }
    
    public  ArrayList<exportModel> showInvoice(){
    return dao.getInvoiceList();
    }
    
}
