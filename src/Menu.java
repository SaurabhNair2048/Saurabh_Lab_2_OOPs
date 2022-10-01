import pastaSauce.RedSauce;
import pastaSauce.WhiteSauce;
import pizza.NonVegPizza;
import pizza.VeganPizza;
import pizza.VegetarianPizza;
import pizzaTopping.*;

public class Menu {

    public static void displayPizzaOrPasta(){
        System.out.println("Please enter 1 for Pizza or 2 for Pasta or a for first option or q for quit: ");
    }

    public static void displayPizzaOptions(){
        System.out.println("Please enter 1, 2 or 3 : ");
        System.out.println("1 : Vegetarian Pizza with base cost = " + VegetarianPizza.cost()+"USD");
        System.out.println("2 : Non-Vegetarian Pizza with base cost = " + NonVegPizza.cost()+"USD");
        System.out.println("3 : Vegan Pizza with base cost = " + VeganPizza.cost()+"USD");
        System.out.println("a: to go back to first option");
        System.out.println("q: to quit ordering");
    }

    public static void displayPastaOptions(){
        System.out.println("Please enter 1 or 2 : ");
        System.out.println("1 : Penne Pasta - No separate cost");
        System.out.println("2 : Ditalini Pasta - No separate cost");
        System.out.println("a: to go back to first option");
        System.out.println("q: to quit ordering");
    }

    public static void displayPizzaCrustOptions(){
        System.out.println("Please enter 1 or 2 : ");
        System.out.println("1 : Thin Crust - No separate cost");
        System.out.println("2 : Thick Crust - No separate cost");
        System.out.println("a: to go back to first option");
        System.out.println("q: to quit ordering");
    }

    public static void displayPastaSauceOptions(){
        System.out.println("Please enter 1 or 2 : ");
        System.out.println("1 : White Sauce costs = " + WhiteSauce.cost()+"USD");
        System.out.println("2 : Red Sauce costs = " + RedSauce.cost()+"USD");
        System.out.println("a: to go back to first option");
        System.out.println("q: to quit ordering");
    }

    public static void displayPizzaSizeOptions(){
        System.out.println("Please enter 1, 2 or 3 : ");
        System.out.println("1 : Small Size and costs 1x(base cost)");
        System.out.println("2 : Medium Size and costs 2x(base cost)");
        System.out.println("3 : Large Size and costs 3x(base cost)");
        System.out.println("a: to go back to first option");
        System.out.println("q: to quit ordering");
    }

    public static void displayToppingOptions(){
        System.out.println("Please enter value from 1 to 5: default to no more toppings to be added ");
        System.out.println("1 : Cheese Topping and costs additional = " + Cheese.cost()+"USD");
        System.out.println("2 : Jalapeno Topping and costs additional = " + Jalapeno.cost()+"USD");
        System.out.println("3 : Mushroom Topping and costs additional = " + Mushroom.cost()+"USD");
        System.out.println("4 : Spinach Topping and costs additional = " + Spinach.cost()+"USD");
        System.out.println("5 : Tomato Topping and costs additional = " + Tomato.cost()+"USD");
        System.out.println("a: to go back to first option");
        System.out.println("q: to quit ordering");
    }

}
