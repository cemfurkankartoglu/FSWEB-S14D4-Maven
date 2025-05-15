package org.example.model;

public class Coke extends ProductForSale {
    private int volume;
    public Coke(String type, double price, String description, int volume) {
        super(type, price, description);
        this.volume = volume;
    }

    @Override
    void showDetails() {

    }
}
