package com.tms.principes.l;

public class Rectangle {
    private  int x;
    private  int y;

    void perimeter() {
        System.out.println((2 * x) + (2 * y));
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
