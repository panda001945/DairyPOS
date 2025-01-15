// Main.java - Entry point for Dairy POS system
package com.dairypos;

import com.dairypos.controllers.*;
import com.dairypos.utils.DatabaseUtils;

public class Main {
    public static void main(String[] args) {
        DatabaseUtils.initializeDatabase();
        AdminController adminController = new AdminController();
        SalesController salesController = new SalesController();
        InventoryController inventoryController = new InventoryController();

        // Simple menu-driven interface
        System.out.println("Welcome to Dairy POS");
        System.out.println("1. Admin Section\n2. Sales Section\n3. Inventory Section\nEnter your choice:");

        // Replace this with dynamic input handling
        int choice = 1; // Example input

        switch (choice) {
            case 1:
                adminController.showMenu();
                break;
            case 2:
                salesController.startSale();
                break;
            case 3:
                inventoryController.viewInventory();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
        }
    }
}
