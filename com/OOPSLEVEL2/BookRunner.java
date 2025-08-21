package com.OOPSLEVEL2;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book(20, "Java OOPS", "Shreyash Gaikwad");
        book.addReview(new Review(10, "Great Book", 5));
        book.addReview(new Review(101, "Awesome", 5));
        book.addReview(new Review(89, "Good", 4));

        System.out.println(book);
    }

}
