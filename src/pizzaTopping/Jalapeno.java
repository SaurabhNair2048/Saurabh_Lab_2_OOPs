package pizzaTopping;

public class Jalapeno extends Topping {

    private static double cost=1.0;

    Jalapeno(){
        super("Jalapeno Topping");
    }

    public static void setCost(double cost){
        Jalapeno.cost = cost;
    }

    public static double cost(){
        return Jalapeno.cost;
    }

    @Override
    public double getCost(){
        return Jalapeno.cost();
    }

}
