package ListMapeSetOptional;

import java.util.ArrayList;
import java.util.List;

public class ListBasicShoppingApplication {

    public static void main(String[] args) {
        List<String> grocery = new ArrayList<>();
        System.out.println(grocery);
        String string="Eggs";
        String string2="Coffee";
        String string3="Milk";

        //Add some items
        grocery.add(string);
        grocery.add("Coffee");
        grocery.add("Milk");
        System.out.println("\n"+"Groceries"+  grocery);
        grocery.remove("Eggs");

        //Print out the list
        System.out.println("\n" +"Groceries"+ grocery);

        grocery.add("Coffee");
        grocery.add("Coffee");
        System.out.println("\n" +"Groceries"+ grocery);
        grocery.remove(3);
        System.out.println("\n" +"Groceries"+ grocery);
        //Print number of items in list
       // System.out.println("Number of items: " +grocery.numberOfItems());
        System.out.println(grocery.size());


    }
}