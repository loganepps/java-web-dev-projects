package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    // FIELDS
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // Allow for default constructor-
    // -Because we don't need any parameters passed in when creating a menu

    // GETTERS & SETTERS
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


    // SPECIAL METHODS

    // TODO: Define custom toString() method
    // List menu items, grouped by category
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nPANDA HUT MENU\n" + "\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }

    // INSTANCE METHODS

    // TODO: Define addItem()
    // Make sure to update lastUpdated anytime something is successfully added
    // BONUS MISSION: prevent addition of duplicates
    void addItem(MenuItem newItem) {
        String message = "That item is already on the menu!";
        if (menuItems.contains(newItem)) {
            System.out.println(message);
            return;
        }
        for (MenuItem item : menuItems) {
            if (item.equals(newItem)) {
                System.out.println(message);
                return;
            }
        }

        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    // TODO: Define removeItem()
    // Make sure to update lastUpdated anytime something is removed
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }


}
