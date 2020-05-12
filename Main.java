/*==========================================
Title:  Udemy Array List Challenge
Author: Johan Danmo
Date:   12 Mar 2020
==========================================*/

package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static MobilePhone mobile = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        boolean on = true;
        mobile.menu();
        while (on){
            System.out.print("Choice: ");
            int userInput = scanner.nextInt();

            switch (userInput){
                case 1:
                    mobile.menu();
                    break;
                case 2:
                    mobile.printListOfContacts();
                    break;
                case 3:
                    mobile.addNewContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    searchContact();
                case 7:
                    System.out.println("Phone turned off.");
                    on = false;
                    break;
                default:
                    break;
            }
        }
    }

    public static void updateContact(){

    }

    public static void removeContact(){

    }

    public static void searchContact(){

    }

}
