package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {
    //Fields
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    //constructors
    public MenuItem(String name, String description,double price,String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded= LocalDate.now();
    }

    //getter and setter
    public String getName(){
        return name;
    }
   public void setName(String name){
    this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded(){
        return dateAdded;
    }

    @Override
    public  String toString(){
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" + description +" | $" + price;
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
        MenuItem otherItem = (MenuItem) toBeCompared;
        return this.name.equals(otherItem.getName());
}


    boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }

}
