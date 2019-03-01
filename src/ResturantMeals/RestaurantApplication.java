package ResturantMeals;

import java.util.List;

public class RestaurantApplication {

    public static void main(String[] args) {
        Waiter waiter = new Waiter(new Menu());
        List<Meal> meals = waiter.getMeals();
        double meal1=0;
        for (Meal meal : meals) {
            System.out.print("Meal: " + meal.getName());
            System.out.println(" " + meal.getPrice() + " Euros");

            meal1= meal1+meal.getPrice();

        }

        waiter.showPrice("Hummus");
        waiter.showPrice("Falafel");
        waiter.showPrice("Falafel"+"Hummus");

        System.out.println(meals);
                System.out.println("Total Price for all meals: "+ meal1);

    }


}
