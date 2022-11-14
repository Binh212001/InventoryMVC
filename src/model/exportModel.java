/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author hi
 */
public class exportModel extends  proExportModel{
    private  String id;
    private  String cosId;
    private Date date;
    

    public exportModel(String id, String cosId, Date date) {
        this.id = id;
        this.cosId = cosId;
        this.date = date;
    }
    
    public exportModel(String id, String cosId, String key , String exId , String prId , int qty) {
        super(key, exId, prId, qty);
        this.id = id;
        this.cosId = cosId;
        this.date = new Date();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCosId() {
        return cosId;
    }

    public void setCosId(String cosId) {
        this.cosId = cosId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
