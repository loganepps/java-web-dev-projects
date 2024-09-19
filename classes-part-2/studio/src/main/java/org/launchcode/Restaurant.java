package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {

        // TODO: Create 6 menu items in different categories
        MenuItem item1 = new MenuItem("Dumplings", "Hot, steamy pork morsels", 8.29, "appetizer");
        MenuItem item2 = new MenuItem("Egg Rolls", "Tasty, crispy cylinders of goodness", 7.89, "appetizer");
        MenuItem item3 = new MenuItem("General Tso's Chicken", "Sweet, zesty, juicy chicken dish", 12.69, "main course");
        MenuItem item4 = new MenuItem("Drunken Noodles", "Authentic, spicy, savoury noodle dish", 13.49, "main course");
        MenuItem item5 = new MenuItem("Chinese Donuts", "Sweet, fluffy, yummy little treats", 6.39, "dessert");
        MenuItem item6 = new MenuItem("Peanut Butter Rice Cakes", "Really darn good and packed with flavor", 5.89, "dessert");

//        System.out.println(item1.isNew());

        // TODO: Print first item
//        System.out.println(item1);

        // TODO: Create menu
        Menu menu = new Menu();


        // TODO: Add items to menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);

        System.out.println(menu);

        // TODO: Remove an item and print menu

//        menu.removeItem(item3);

//        System.out.println(menu);

        // TODO: Test equals method

        System.out.println(item1.equals(item2));

        MenuItem item7 = new MenuItem("Peanut Butter Rice Cakes", "Really darn good and packed with flavor", 5.89, "dessert");

        System.out.println(item6.equals(item7));



        // BONUS MISSION

        // TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added
        menu.addItem(item6);
//        System.out.println(menu);

    }
}
