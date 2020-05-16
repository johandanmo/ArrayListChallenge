/*==========================================
Title:  Udemy Array List Challenge
Author: Johan Danmo
Date:   12 Mar 2020
==========================================*/

package academy.learnprogramming;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    private Scanner scanner = new Scanner(System.in);

   private String scannerName(){
       try{
           return scanner.nextLine();
       }
       catch (InputMismatchException e) {
           System.out.print(e.getMessage()); //try to find out specific reason.
       }
       return null;
   }

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

    public void printListOfContacts(){
        //this method prints the list of contacts
        for (int i = 0; i<contacts.size();i++){
            System.out.println("#" + (i+1) + ": " + contacts.get(i).getName() + " (" + contacts.get(i).getPhoneNumber() + ")");
        }
        if (contacts.size() == 0){
            System.out.println("There are no contacts in the list.");
        }
    }

    public void addNewContact(){
        System.out.print("Name of new contact: ");
        String name = scannerName();
        System.out.print("Phone number of " + name + ": ");
        String phoneNumber = scannerName();

        Contacts contact = new Contacts(name,phoneNumber);
        contacts.add(contact);
        System.out.println(name + " (" + phoneNumber + ")" + " added to contact list.");
    }

    public void updateContact(){
        //this method updates a contact
        Contacts contact = searchContact();
        if (contact != null){
            System.out.print("New name: ");
            contact.setName(scannerName());
            System.out.print("New phone number: ");
            contact.setPhoneNumber(scannerName());
            System.out.println("Contact updated.");
        }
    }

    public void removeContact(){
        //this method removes a contact from the list
        Contacts contact = searchContact();
        if (contact != null){
            contacts.remove(contact);
            System.out.println("The contact has been removed.");
        }
    }

    public Contacts searchContact(){
        //this method searched the contact from the list
        System.out.print("Name: ");
        String name = scannerName();
        for (Contacts contact : contacts){
            if(contact.getName().equals(name.toLowerCase())){
                System.out.println("Contact " + contact.getName() + " found with phone number " + contact.getPhoneNumber());
                return contact;
            }
        }
        System.out.println("Contact " + name + " was not found in the contact list");
        return null;
    }
}
