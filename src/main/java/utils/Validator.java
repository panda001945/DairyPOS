package com.dairypos.utils;

public class Validator {

    /**
     * Validates if the input is a non-empty string.
     * 
     * @param input The input string to validate.
     * @return true if valid, false otherwise.
     */
    public static boolean isNonEmptyString(String input) {
        return input != null && !input.trim().isEmpty();
    }

    /**
     * Validates if the input is a positive number.
     * 
     * @param number The number to validate.
     * @return true if valid, false otherwise.
     */
    public static boolean isPositiveNumber(double number) {
        return number > 0;
    }

    /**
     * Validates if the stock quantity is a non-negative integer.
     * 
     * @param stock The stock quantity to validate.
     * @return true if valid, false otherwise.
     */
    public static boolean isNonNegativeInteger(int stock) {
        return stock >= 0;
    }

    /**
     * Validates if a given role is valid.
     * 
     * @param role The role to validate.
     * @return true if the role is valid, false otherwise.
     */
    public static boolean isValidRole(String role) {
        return "admin".equalsIgnoreCase(role) || "cashier".equalsIgnoreCase(role)
