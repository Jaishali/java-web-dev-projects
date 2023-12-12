package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class MenuItem {
    private double price;
    private String description;
    private String category;
   private boolean iN;


    public MenuItem(double p, String d, String c, String iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.iN = isNew();

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Override
    public  String toString(){
        String newText = isNew() ? " - NEW!" : "";
        return price + newText + "\n" + description +" | $" + price;
    }

    @Override
    public boolean equals(Object toBeCompared){
        if(this == toBeCompared){
            return true;
        }
        if(toBeCompared == null){
            return false;
        }
        if(getClass() == toBeCompared.getClass()){
            return false;
        }
      //  MenuItem otherItem = (MenuItem) toBeCompared;
        //return this.price.equals(otherItem.getPrice());
        return false;
    }

    private Object getPrice() {
        return null;
    }

    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }

    private Temporal getDateAdded() {
        return null;
    }

    public Object getCategory() {
        return null;
    }
}

