package org.example.model;

public class Chocolate extends ProductForSale {
    private boolean hasSugar;
    public Chocolate(String type, double price, String description, boolean hasSugar) {
        super(type, price, description);
        this.hasSugar = hasSugar;
    }

    @Override
    void showDetails() {

    }
}
