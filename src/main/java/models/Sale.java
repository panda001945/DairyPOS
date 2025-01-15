package com.dairypos.models;

import java.util.List;

public class Sale {
    private int id;
    private List<Product> products;
    private double total;

    public Sale(int id, List<Product> products, double total) {
        this.id = id;
        this.products = products;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
