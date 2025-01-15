package com.dairypos.views;

import com.dairypos.models.Product;

import java.util.Scanner;

public class SalesView {
    private Scanner scanner;

    public SalesView() {
        this.scanner = new Scanner(System.in);
    }

    public void displaySaleStart() {
        System.out.println("Starting a new sale...");
    }

    public Product scanProduct() {
        System.out.print("Enter product name (or 'exit' to finish): ");
        String name = scanner.nextLine();

        if ("exit".equalsIgnoreCase(name)) return null;

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        return new Product(0, name, price, 1); // Mocked Product
    }

    public void displayProductAdded(Product product) {
        System.out.println(product.getName() + " added to cart.");
    }

    public void displayTotal(double total) {
        System.out.println("Total: $" + total);
    }
}
