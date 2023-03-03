/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hometask2;

/**
 *
 * @author Dmitry
 */
import java.util.Scanner;
import java.lang.String;
        
public class HomeTask2 {

    public static void main(String[] args) {
        System.out.println("Practical Task 2. Variant 5. Student Burylin D.S. Group RIBO-03-21");
        Scanner scan = new Scanner(System.in);
        System.out.println("Grocery or shop ? ");
        String shopType = scan.nextLine();

        System.out.println("What are the work days? ");
        String work_days = scan.nextLine();

        System.out.println("When does it open ? ");
        String hours = scan.nextLine();

        System.out.println("When does it close? ");
        String close_hours = scan.nextLine();

         if (shopType.equals("Shop")){
        Shop shp = new Shop(close_hours,work_days,hours);
        System.out.println(shp.toString());
        }
    else if (shopType.equals("Grocery")){
        System.out.println("How many types of vegetables ? ");
        int types_of_vegetables = Integer.parseInt(scan.nextLine());

        System.out.println("How many departments ? ");
        int departments = Integer.parseInt(scan.nextLine());

        System.out.println("How many workers ? ");
        int workers = Integer.parseInt(scan.nextLine());
        
        System.out.println("What is the grocery name ? ");
        String grocery_name = scan.nextLine();
        
        Grocery grocery = new Grocery(types_of_vegetables,departments,workers,grocery_name,close_hours,work_days,hours);
        System.out.println(grocery.toString());
        }
    }
}
