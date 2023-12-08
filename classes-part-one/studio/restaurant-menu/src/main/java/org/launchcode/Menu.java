package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    //fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //getter and setter
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizers")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main courses")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("desserts")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\nTONY'S PIZZA MENU" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourses.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }
    void addItem(MenuItem newItem){
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
        }
        void removeItem(MenuItem item){
            menuItems.remove(item);
            lastUpdated = LocalDate.now();
        }



}
