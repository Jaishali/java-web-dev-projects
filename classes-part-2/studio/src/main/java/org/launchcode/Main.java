package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MenuItem item1 = new MenuItem(7.39, "the classic slice, hot and delicious!","main course","Pepperoni Pizza");
        MenuItem item2 = new MenuItem(6.89,"a st.louis favorite, served with a side of pizza sauce","appetizer","toasted ravioli");
        MenuItem item3 = new MenuItem(4.99,"the ooziest , gooiest dessert this side of the mississippi","dessert","gooey butter cake");
        MenuItem item4 = new MenuItem(6.39,"peppers,onions, mushrooms,olives, and tomatoes make a delicious combo","main course","veggie pizza");
        MenuItem item5 = new MenuItem(4.59,"hot garlicky carbs FIW","appetizer","garlic breads ticks");
        System.out.println(item1.isNew());

        System.out.println(item1);

        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

       /* System.out.println(menu);
        menu.removeItem(item4);
        System.out.println(menu);*/


        System.out.println(item1.equals(item2));
        MenuItem item6 = new MenuItem(4.59,"hot garlicky carbs FTW","appetizer","garlic breads ticks");
        System.out.println(item5.equals(item6));



        menu.addItem(item6);
        System.out.println(menu);
    }



}
