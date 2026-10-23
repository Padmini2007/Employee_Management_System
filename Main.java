import Padmini.College.Salary;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Salary s = new Salary();

        // Person details
        s.input();

        // Employee details
        s.getinput();

        // Salary details
        System.out.println("Enter Basic Salary:");
        float basic = sc.nextFloat();

        System.out.println("Enter Bonus:");
        float bonus = sc.nextFloat();

        System.out.println("Enter Tax:");
        float tax = sc.nextFloat();

        // Calculate salary
        s.calculatesal(basic, bonus, tax);

        // Display employee details
        s.display();
    }
}