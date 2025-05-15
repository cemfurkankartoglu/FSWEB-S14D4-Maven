package org.example.model;

public class Bread extends ProductForSale{
    private double weight;
    public Bread(String type, double price, String description, double weight) {
        super(type, price, description);
        this.weight = weight;
    }

    @Override
    void showDetails() {

    }
}
