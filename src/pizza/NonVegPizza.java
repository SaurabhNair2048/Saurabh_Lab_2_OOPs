package pizza;

import pizzaTopping.Topping;

public class NonVegPizza extends Pizza{

    public static double cost = 25.0;

    @Override
    public void bakePizza() {
        System.out.println("Make Dough...");
        System.out.println("Spread it to size " + getSize());
        System.out.println("Set crust to be " + getCrustType());
        System.out.println("Adding Onion, Pepperoni and Cheese for the Non-Veg Pizza");
        System.out.println("Add Toppings: ");
        for(Topping t : getToppings()){
            System.out.print(t.getName() + ", ");
        }
        System.out.println();
        System.out.println("Baking in Oven....");
        System.out.println("Pizza Baked.... Ready to Serve...");
    }

    public static double cost(){
        return NonVegPizza.cost;
    }

    @Override
    public double getBaseCost(){
        return NonVegPizza.cost();
    }
}
