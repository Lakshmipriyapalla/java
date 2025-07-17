package Furniture_Project;

import java.util.Scanner;

public class Furniture_Range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        int count_order = 0;
        int total_amount=0;
        int amount=0;
        do{
            System.out.println(" WELCOME TO  FAANG FURNITURE SHOW ROOM");
            System.out.println(" 1.Sofa (3-seater) -> ₹12,000 -20000 ");
            System.out.println(" 2.Bed (Queen size with storage) -> ₹21,000-30000 ");
            System.out.println(" 3.Dining Table (4-seater) -> ₹31000-40000 ");
            System.out.println(" 4.Wardrobe (2-door) -> ₹70,000-85000 ");
            System.out.println(" 5.Executive Office Desk ->  ₹1,20,000-1,50,000");
            System.out.println(" 6.Ergonomic Luxury Chair ->  ₹86,000-1,00,000");
            System.out.println(" 7.Meeting Table (6–10 seater) -> ₹1,05,000-1,19,000 ");
            System.out.println(" 8.Coffee Table -> ₹15,000-25000 ");
            System.out.println(" 9.Bookshelf -> ₹3,000-8000 ");
            System.out.println(" 10.Study Table ->  ₹10,000-20,000");
            System.out.println("enter your choice (1 to 10)::");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Sofa (3-seater) ");
                    if (amount >= 12000 && amount <= 20000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");
                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;

                case 2:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Bed (Queen size with storage)");
                    if (amount >= 21000 && amount <= 30000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");
                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 3:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Dining Table (4-seater) ");
                    if (amount >= 31000 && amount <= 40000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");
                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 4:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Wardrobe (2-door)");
                    if (amount >= 70000 && amount <= 85000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");


                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 5:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Executive Office Desk (2-door)");
                    if (amount >= 120000 && amount <= 150000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");

                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 6:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Ergonomic Luxury Chair");
                    if (amount >= 86000 && amount <= 100000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");

                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 7:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Meeting Table (6–10 seater) ");
                    if (amount >= 105000 && amount <= 119000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");

                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 8:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Coffee Table");
                    if (amount >= 15000 && amount <= 25000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");

                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 9:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Bookshelf");
                    if (amount >= 3000 && amount <= 8000) {
                        total_amount += amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");


                    } else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                case 10:
                    System.out.println("enter amount::");
                    amount = sc.nextInt();
                    System.out.println("your ordered Study Table");
                    if(amount>=10000 && amount<=20000){
                        total_amount+=amount;
                        System.out.println("Thank you for your purchase! \uD83D\uDE4F\uD83D\uDECD\uFE0F\uD83D\uDE0A");
                        System.out.println("We appreciate your order! ❤\uFE0F\uD83D\uDCE6");


                    }
                    else {
                        System.out.println(" \uD83D\uDE14 oh! sorry this is not our range ");
                        System.out.println("No worries! Hope to see you again soon \uD83D\uDE0A\uD83D\uDE4F");
                        System.out.println("Maybe next time! We're here when you're ready \uD83D\uDD52❤\uFE0F");
                    }
                    break;
                default:
                    System.out.println("Invalid choice.please try again");
                    System.out.println("Tq u for visiting");
            }
            System.out.println("Do you want to order more(y/n) ");
            count_order = sc.next().charAt(0);
        }
        while (count_order=='y'  || count_order=='Y');
        System.out.println("total_amount::  " +total_amount);
        System.out.println("Thanks for shopping with us! \uD83D\uDED2\uD83D\uDC96");
    }
}
