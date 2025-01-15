package com.dairypos.views;

import com.dairypos.models.Product;

import java.util.List;

public class InventoryView {
    public void displayEmptyInventory() {
        System.out.println("Inventory is empty.");
    }

    public void displayInventory(List<Product> inventory) {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " - Stock: " + product.getStock());
        }
    }
}
