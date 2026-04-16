package mypack;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    public void display() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}