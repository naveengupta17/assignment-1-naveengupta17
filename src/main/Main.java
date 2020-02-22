package main;

import method.SearchMethod;
import personDefination.Person;
import singlyLinkedList.SinglyLinkedListDefination;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        SinglyLinkedListDefination<Person> linkesList = new SinglyLinkedListDefination<>();
        SearchMethod searchMethod = new SearchMethod();
        do {
            System.out.println("Welcome to Naveen's Contact App");
            System.out.println("Press 1 to add a new Contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit the programe");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("You choose to add a new contact:");
                    System.out.println("Entre  name of the person:");
                    System.out.println("First name:");
                    String fName = scanner.nextLine().trim();
                    System.out.println("Last Name:");
                    String lName = scanner.nextLine().trim();
                    ArrayList<Long> arrayList = new ArrayList<>();
                    String choiceContact;
                    do {
                        System.out.println("Contact Number:");
                        long no = scanner.nextLong();
                        arrayList.add(no);
                        System.out.println("Would you like to add another Contact Number(y/n)");
                        scanner.nextLine();
                        choiceContact = scanner.nextLine();

                    }
                    while (choiceContact.equals("y"));
                    String email = null;
                    System.out.println("Would you like to add Email(y/n)");

                    char choice2 = scanner.nextLine().charAt(0);
                    if (choice2 == 'y') {
                        System.out.println("Email: ");
                        email = scanner.nextLine().trim();
                    }

                    Person person = new Person(fName, lName, email, arrayList);

                    linkesList.add(person);
                    break;

                }
            }


        } while (flag == 1);


    }
}