package pizza;

import pizzaTopping.Topping;

public class VeganPizza extends Pizza{

    public static double cost = 15.0;

    @Override
    public void bakePizza() {
        System.out.println("Make Dough...");
        System.out.println("Spread it to size " + getSize());
        System.out.println("Set crust to be " + getCrustType());
        System.out.println("Adding Onion and Pepper for the Vegan Pizza");
        System.out.println("Add Toppings: ");
        for(Topping t : getToppings()){
            System.out.print(t.getName() + ", ");
        }
        System.out.println();
        System.out.println("Baking in Oven....");
        System.out.println("Pizza Baked.... Ready to Serve...");
    }

    public static double cost(){
        return VeganPizza.cost;
    }

    @Override
    public double getBaseCost(){
        return VeganPizza.cost();
    }
}
