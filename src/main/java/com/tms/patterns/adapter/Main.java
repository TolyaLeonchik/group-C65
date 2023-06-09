package com.tms.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        InterfaceSender interfaceSender = new InterfaceAdapter();
        interfaceSender.send();
    }
}
