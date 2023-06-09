package com.tms.patterns.Singleton;

public class Belaz {
    public int cost;
    public double weight;
    private static Belaz belaz; //null

    private Belaz(int cost, double weight) {
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static Belaz createBelaz(int cost, double weight){
        if (belaz == null ){  // если объект раньше создавался, то верни его. Если нет - создай
            belaz = new Belaz(cost, weight);
        }
        return belaz;
    }
}
