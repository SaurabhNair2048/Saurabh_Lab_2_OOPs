package pizza;

import pizzaTopping.*;

public class PizzaGenerator {

    public static final Pizza buildPizza(String pizza){
        switch(pizza){
            case "Veg":
                return new VegetarianPizza();
            case "Non-Veg":
                return new NonVegPizza();
            case "Vegan":
                return new VeganPizza();
            default:
                return null;
        }
    }
}
