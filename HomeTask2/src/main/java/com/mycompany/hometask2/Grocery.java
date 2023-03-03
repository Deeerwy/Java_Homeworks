/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hometask2;

/**
 *
 * @author Dmitry
 */
public class Grocery extends Shop {
    private int types_of_vegetables;
    private int departments;
    private int workers;
    private String grocery_name;

    public Grocery(int types_of_vegetables, int departments, int workers, String grocery_name, String close_hours, String work_days, String hours) {
        super(close_hours, work_days, hours);
        this.types_of_vegetables = types_of_vegetables;
        this.departments = departments;
        this.workers = workers;
        this.grocery_name = grocery_name;
    }

    public int getTypes_of_vegetables() {
        return types_of_vegetables;
    }

    public void setTypes_of_vegetables(int types_of_vegetables) {
        this.types_of_vegetables = types_of_vegetables;
    }

    public int getDepartments() {
        return departments;
    }

    public void setDepartments(int departments) {
        this.departments = departments;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public String getGrocery_name() {
        return grocery_name;
    }

    public void setGrocery_name(String grocery_name) {
        this.grocery_name = grocery_name;
    }
    
    public void seasonVegetable (String vegetable){
        System.out.println("Shop gives season " + vegetable);
    }
    public void refreshProducts (int days) {
        System.out.println("Shop refresh products every " + days + " days");
    }
    public void seniorSale(int senior_sale ){
        System.out.println("Shop has " + senior_sale + " sale");
    }

    @Override
    public String toString() {
        return "types of vegetables = " + types_of_vegetables + ", amount of departments = " + departments + ", amount of workers = " + workers + ", grocery name = " + grocery_name + ", close hours = " + getClose_hours() + ", work days = "+ getWork_days() + ", open hours = " + getHours();
    }
}
