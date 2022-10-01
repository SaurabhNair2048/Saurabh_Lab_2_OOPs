package pizzaTopping;

import sun.security.provider.ConfigFile;

public class Spinach extends Topping {

    private static double cost=1.0;

    Spinach(){
        super("Spinach Topping");
    }

    public static void setCost(double cost){
        Spinach.cost = cost;
    }

    public static double cost(){
        return Spinach.cost;
    }

    @Override
    public double getCost(){
        return Spinach.cost();
    }

}
