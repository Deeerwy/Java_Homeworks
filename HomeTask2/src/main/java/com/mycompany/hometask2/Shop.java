/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hometask2;

/**
 *
 * @author Dmitry
 */
public class Shop {
    private String close_hours;
    private String work_days;
    private String hours;
    private String name;

    public Shop(String close_hours, String work_days, String hours, String name) {
        this.close_hours = close_hours;
        this.work_days = work_days;
        this.hours = hours;
        this.name = name;
    }

    public String getClose_hours() {
        return close_hours;
    }

    public void setClose_hours(String close_hours) {
        this.close_hours = close_hours;
    }

    public String getWork_days() {
        return work_days;
    }

    public void setWork_days(String work_days) {
        this.work_days = work_days;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void SalePrice (int sale){
        System.out.println("Shop gives " + sale + " sale");
    }
    public void OpenHours (int hours) {
        System.out.println("Shop works for " + hours + " hours");
    }
    public void department(int depart){
        System.out.println("Shop has " + depart + " departments");
    }
    
    @Override
    public String toString() {
        return "hours = " + hours + ", close hours = " + close_hours + ", work days = " + work_days + ", name = " + name;
    }
}
