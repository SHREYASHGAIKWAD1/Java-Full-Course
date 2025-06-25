package com.oops;

public class BookRunner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book artOfComputerProgramming = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfComputerProgramming.open();
        artOfComputerProgramming.read();
        artOfComputerProgramming.close();

        artOfComputerProgramming.setCopies(50);
        effectiveJava.setCopies(80);
        cleanCode.setCopies(70);

        System.out.println(artOfComputerProgramming.getCopies());
        System.out.println(effectiveJava.getCopies());
        System.out.println(cleanCode.getCopies());

        artOfComputerProgramming.increaseCopies(50);
        System.out.println(artOfComputerProgramming.getCopies());
    }

}