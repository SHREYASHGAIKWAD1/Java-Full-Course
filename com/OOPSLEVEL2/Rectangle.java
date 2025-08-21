package com.OOPSLEVEL2;

public class Rectangle {

    //State
    private short length;
    private short width;

    //behavior
    public Rectangle() {

    }

    public Rectangle(short length, short width) {
        this.length = length;
        this.width = width;
    }

    public short findPerimeter() {
        short peri = (short) (2 * (this.length + this.width));
        return peri;
    }

    public short findArea() {
        return (short) (length * width);
    }

    public short getLength() {
        return length;
    }

    public void setLength(short length) {
        this.length = length;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public String toString() {
        return String.format("| Length - %d | Width - %d | Perimeter - %d | Area - %d |", length, width, findPerimeter(), findArea());
    }

    //Implementation
    public static void main(String[] args) {
        Rectangle rec = new Rectangle((short)80, (short)100);
        System.out.println(rec);
        System.out.println(rec.getLength());
        System.out.println(rec.getWidth());

        System.out.println(rec.findPerimeter());
        System.out.println(rec.findArea());
        rec.setLength((short)100);
        rec.setWidth((short)120);
        System.out.println(rec);
    }
}
