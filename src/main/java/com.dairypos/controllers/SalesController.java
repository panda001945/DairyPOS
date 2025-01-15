package com.dairypos.controllers;

import com.dairypos.models.Product;
import com.dairypos.views.SalesView;

import java.util.ArrayList;
import java.util.List;

public class SalesController {
    private SalesView view;
    private List<Product> cart;

    public SalesController() {
        this.view = new SalesView();
        this.cart = new ArrayList<>();
    }

    public void startSale() {
        view.displaySaleStart();

        while (true) {
            Product product = view.scanProduct();
            if (product == null) break;

            cart.add(product);
            view.displayProductAdded(product);
        }

        double total = calculateTotal();
        view.displayTotal(total);
    }

    private double calculateTotal() {
        return cart.stream().mapToDouble(Product::getPrice).sum();
    }
}
