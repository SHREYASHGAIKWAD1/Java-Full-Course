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
        if(Character.toUpperCase(ch) == 'A' || Character.toUpperCase(ch) == 'E'|| Character.toUpperCase(ch) == 'I'
                || Character.toUpperCase(ch) == 'O'|| Character.toUpperCase(ch) == 'U') {
            return true;
        }
        return false;
    }

    public boolean isConsonant() {
        if(!isVowel() && isAlphabet()) {
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        if(ch>=48 && ch<=57) {
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if(ch>=97 && ch<=122 || ch>=65 && ch<=90) {
            return true;
        }
        return false;
    }
}
