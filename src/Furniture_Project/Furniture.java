package Furniture_Project;

import java.util.Scanner;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        int total_amount=0;
        char  count_order;
        do {
            System.out.println(" WELCOME TO  FAANG FURNITURE SHOW ROOM");
            System.out.println(" 1.Sofa (3-seater) -> ₹12,000  ");
            System.out.println(" 2.Bed (Queen size with storage) -> ₹15,000 ");
            System.out.println(" 3.Dining Table (4-seater) -> ₹8,000 ");
            System.out.println(" 4.Wardrobe (2-door) -> ₹14,000 ");
            System.out.println(" 5.Executive Office Desk ->  ₹1,20,000");
            System.out.println(" 6.Ergonomic Luxury Chair ->  ₹80,000");
            System.out.println(" 7.Meeting Table (6–10 seater) -> ₹60,000 ");
            System.out.println(" 8.Coffee Table -> ₹15,000 ");
            System.out.println(" 9.Bookshelf -> ₹3,000 ");
            System.out.println(" 10.Study Table ->  ₹10,000");
            System.out.println(" 11.Solid Wood Dining Set 4–6 ->  ₹1,20,000");
            System.out.println("enter your choice (1 to 11)::");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("you ordered Sofa (3-seater) ");
                    total_amount += 12000;
                    break;
                case 2:
                    System.out.println("you ordered Bed (Queen size with storage)");
                    total_amount += 15000;
                    break;
                case 3:
                    System.out.println("you ordered Dining Table (4-seater)");
                    total_amount += 8000;
                    break;
                case 4:
                    System.out.println("you ordered Wardrobe (2-door) ");
                    total_amount += 14000;
                    break;
                case 5:
                    System.out.println("you ordered Executive Office Desk");
                    total_amount += 120000;
                    break;
                case 6:
                    System.out.println("you ordered Ergonomic Luxury Chair");
                    total_amount += 80000;
                    break;
                case 7:
                    System.out.println("you ordered Meeting Table (6–10 seater) ");
                    total_amount += 60000;
                    break;
                case 8:
                    System.out.println("you ordered Coffee Table ");
                    total_amount += 15000;
                    break;
                case 9:
                    System.out.println("you ordered Bookshelf ");
                    total_amount += 3000;
                    break;
                case 10:
                    System.out.println("you ordered Study Table ");
                    total_amount += 10000;
                    break;
                case 11:
                    System.out.println("you ordered Solid Wood Dining Set 4–6");
                    total_amount += 120000;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1 to 11.");
            }
            System.out.println("Do you want to order more(y/n)");
            count_order = sc.next().charAt(0);
        }
            while (count_order == 'y' || count_order == 'Y') ;
            System.out.println("your order has been successfully added");
            System.out.println("total_amount::  " +total_amount);
    }
}
