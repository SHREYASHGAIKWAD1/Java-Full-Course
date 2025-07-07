package com.javaprimitivedatatypeindepth;

public class MyChar {
    //State
    private char ch;

    //behavior
    public MyChar(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if(ch == 'a'|| ch == 'e'|| ch == 'i'
                || ch == 'o'|| ch == 'u' || ch == 'A' || ch == 'E'
                || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public boolean isNumber() {
        if(ch == )
            return null;
    }
}