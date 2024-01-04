package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getTopping();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        Comparator comparator = new FlavorComparator();

        flavors.sort(new FlavorComparator());
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        Comparator comparator1 = new ConeComparator();
        cones.sort(new ConeComparator());
        Comparator comparator2 = new ToppingComparator();
        toppings.sort(new ToppingComparator());
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println(flavors);
        System.out.println(cones);
        System.out.println(toppings);
    }
}
