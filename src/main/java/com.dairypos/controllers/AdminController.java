package com.dairypos.controllers;

import com.dairypos.views.AdminView;

public class AdminController {
    private AdminView view;

    public AdminController() {
        this.view = new AdminView();
    }

    public void showMenu() {
        view.displayAdminMenu();
        int choice = view.getUserChoice();

        switch (choice) {
            case 1:
                System.out.println("Managing Users...");
                // Add user management logic here
                break;
            case 2:
                System.out.println("Generating Reports...");
                // Add report generation logic
                break;
            case 3:
                System.out.println("Returning to Main Menu...");
                break;
            default:
                System.out.println("Invalid Option. Try again.");
        }
    }
}
