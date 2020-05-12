/*==========================================
Title:  Udemy Array List Challenge
Author: Johan Danmo
Date:   12 Mar 2020
==========================================*/

package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    private Scanner scanner = new Scanner(System.in);

    public void menu(){
        //this method presents the options available on the mobile phone
        System.out.println("1. Menu." + "\n" +
                            "2. List contacts." + "\n" +
                            "3. Add new contact." + "\n" +
                            "4. Update contact." + "\n" +
                            "5. Remove contact." + "\n" +
                            "6. Search contact." + "\n" +
                            "7. Turn off mobile.");
    }

    public void quit(){
        //this method terminates the program
        System.out.println("Method call to quit");
    }

    public void printListOfContacts(){
        //this method prints the list of contacts
        System.out.println("Method call to printListOfContacts");
    }

    public void addNewContact(){
        System.out.print("Name of new contact: ");
        String name = scanner.nextLine();
        System.out.print("Phone number of " + name + ": ");
        String phoneNumber = scanner.nextLine();

        Contacts contact = new Contacts(name,phoneNumber);
        contacts.add(contact);
        System.out.println("Contact " + name + " with phone number " + phoneNumber + " added to contact list.");
    }

    public void updateContact(String name){
        //this method updates a contact
        System.out.println("Method call to updateContact");
    }

    public void removeContact(String name){
        //this method removes a contact from the list
        System.out.println("Method call to removeContact");
    }

    public Contacts searchContact(String Name){
        //this method searched the contact from the list
        System.out.println("Method call to searchContact");
        return null;
    }



}
