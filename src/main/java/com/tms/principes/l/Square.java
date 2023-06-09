package com.tms.principes.l;

public class Square extends Rectangle{
    @Override
    public void setX(int value) {
        super.setX(value);
        super.setY(value);
    }

    @Override
    public void setY(int value) {
        super.setY(value);
        super.setX(value);
    }
}
