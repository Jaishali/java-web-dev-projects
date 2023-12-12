package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public Menu() {
        
    }


    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        MenuItem[] menuItems = new MenuItem[0];
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
  /*  void addItem(MenuItem newItem){
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }
    void removeItem(MenuItem item){
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }*/


    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item1) {
    }
}


