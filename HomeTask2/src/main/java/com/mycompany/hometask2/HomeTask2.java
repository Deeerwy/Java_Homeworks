/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hometask2;

/**
 *
 * @author Dmitry
 */
import java.util.Scanner;
        
public class HomeTask2 {

    public static void main(String[] args) {
        System.out.println("Practical Task 2. Variant 5. Student Burylin D.S. Group RIBO-03-21");
        Scanner scan = new Scanner(System.in);
        System.out.println("what shop ? ");
        String shopType = scan.nextLine();

        System.out.println("What are the work days? ");
        String work_days = scan.nextLine();

        System.out.println("When does it open ? ");
        String hours = scan.nextLine();

        System.out.println("When does it close? ");
        String close_hours = scan.nextLine();
        
        System.out.println("Name of shop? ");
        String name = scan.nextLine();
        
    
        if (shopType.equals("Fast food")){
            System.out.println("How many types of vegetables ? ");
            int types_of_vegetables = Integer.parseInt(scan.nextLine());

            System.out.println("How many departments ? ");
            int departments = Integer.parseInt(scan.nextLine());

            System.out.println("How many workers ? ");
            int workers = Integer.parseInt(scan.nextLine());
        
            Grocery macdonald = new Grocery(types_of_vegetables,departments,workers,close_hours,work_days,hours,name);
            Revisor revisor = new Revisor();
            revisor.closeStore(macdonald);
            revisor.rebrand(macdonald);
            System.out.println(macdonald.toString());
        }
        if (shopType.equals("Grocery")){
            System.out.println("How many types of vegetables ? ");
            int types_of_vegetables = Integer.parseInt(scan.nextLine());

            System.out.println("How many departments ? ");
            int departments = Integer.parseInt(scan.nextLine());

            System.out.println("How many workers ? ");
            int workers = Integer.parseInt(scan.nextLine());
        
            Grocery grocery = new Grocery(types_of_vegetables,departments,workers,close_hours,work_days,hours,name);
            Revisor revisor = new Revisor();
            revisor.closeStore(grocery);
            revisor.rebrand(grocery);
            System.out.println(grocery.toString());
        }
    }    
}
