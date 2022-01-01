package four2;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private String name;
    private int pages;
    private int publicationYear;

    public Book(String name, int pages, int publicationYear) {

        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }

    public String toString() {

        return name + ", " + pages + " pages, " + publicationYear;

    }

    public String justName() {

        return name;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {

            System.out.println("Title: ");
            String title = sc.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int length = sc.nextInt();

            System.out.println("Publication year: ");
            int year = sc.nextInt();
            sc.nextLine();

            Book book = new Book(title, length, year);

            bookList.add(book);

        }

        System.out.println("What will be printed?");
        String input = sc.nextLine();

        if(input.equalsIgnoreCase("everything")) {

            everything(bookList);


        } else if (input.equalsIgnoreCase("name")) {

            nameOnly(bookList);

        }


    }

    public static void everything(ArrayList<Book> tempBookList) {

        for (int i = 0; i < tempBookList.size(); i++) {

            System.out.println(tempBookList.get(i).toString());

        }

    }

    public static void nameOnly(ArrayList<Book> tempBookList) {

        for (int i = 0; i < tempBookList.size(); i++) {

            System.out.println(tempBookList.get(i).justName());

        }

    }


}
