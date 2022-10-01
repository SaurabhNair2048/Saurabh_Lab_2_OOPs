package pizza;

import pizzaTopping.Topping;

public class VegetarianPizza extends Pizza {

    private static double baseCost = 20.0;

    @Override
    public void bakePizza() {
        System.out.println("Make Dough...");
        System.out.println("Spread it to size " + getSize());
        System.out.println("Set crust to be " + getCrustType());
        System.out.println("Adding Onion, Corn and Cheese for the Vegetarian Pizza");
        System.out.println("Add Toppings: ");
        for(Topping t : getToppings()){
            System.out.print(t.getName() + ", ");
        }
        System.out.println();
        System.out.println("Baking in Oven....");
        System.out.println("Pizza Baked.... Ready to Serve...");
    }

    public static double cost(){
        return VegetarianPizza.baseCost;
    }

    @Override
    public double getBaseCost(){
        return VegetarianPizza.cost();
    }
}
