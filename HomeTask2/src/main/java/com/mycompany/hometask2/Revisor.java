/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hometask2;

/**
 *
 * @author Dmitry
 */
public class Revisor {
    private int age;
    
    public void closeStore(Shop shop){
        if (shop != null){
            
            String mname = shop.getName();
            if ("IKEA".equals(mname)){ 
                mname = null;
                shop.setName(mname);
            }else{
                mname = mname;
                shop.setName(mname);
            }
        }
    }
    public void rebrand(Shop shop){
        if (shop != null){
            String mname = shop.getName();
            if ("MacDonalds".equals(mname)){
                mname = "Вкусно и точка";
                shop.setName(mname);
            }else{
                mname = mname.substring(1);
                shop.setName(mname);
            }
        }
    }
    
}
