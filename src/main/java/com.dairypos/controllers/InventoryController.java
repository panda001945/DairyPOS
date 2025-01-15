package com.dairypos.controllers;

import com.dairypos.models.Product;
import com.dairypos.views.InventoryView;

import java.util.ArrayList;
import java.util.List;

public class InventoryController {
    private InventoryView view;
    private List<Product> inventory;

    public InventoryController() {
        this.view = new InventoryView();
        this.inventory = new ArrayList<>();
    }

    public void viewInventory() {
        if (inventory.isEmpty()) {
            view.displayEmptyInventory();
        } else {
            view.displayInventory(inventory);
        }
    }
}
