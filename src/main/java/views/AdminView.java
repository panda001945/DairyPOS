package com.dairypos.views;

import java.util.Scanner;

public class AdminView {
    private Scanner scanner;

    public AdminView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayAdminMenu() {
        System.out.println("Admin Menu:");
        System.out.println("1. Manage Users");
        System.out.println("2. View Reports");
        System.out.println("3. Back to Main Menu");
    }

    public int getUserChoice() {
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }
}
