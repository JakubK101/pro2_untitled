import Models.PizzaMenu;
import Models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello there");
        System.out.println("General Kenobi");
        System.out.println("---------------");


        PizzaMenuItem item1 = new PizzaMenuItem(180, "Margarita", "Cheese");
        PizzaMenuItem item2 = new PizzaMenuItem(170, "Hawai", "Pineaple");






        List<PizzaMenuItem> pizzaItems =new ArrayList<>();

        pizzaItems.add(item1);
        pizzaItems.add(item2);


        for (PizzaMenuItem p: pizzaItems) {
            System.out.println(p);
        }
        PizzaMenuItem itemsFromList =pizzaItems.get(1);
        System.out.println(itemsFromList);

        PizzaMenu menu1 = new PizzaMenu();
        menu1.addItem(new PizzaMenuItem(200,"1","Best"));
        menu1.addItem(new PizzaMenuItem(220,"2","Good"));
        menu1.addItem(new PizzaMenuItem(240,"2","So good"));







    }





}
