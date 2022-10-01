package pizzaTopping;

public class Cheese extends Topping {

    private static double cost=1.0;

    Cheese(){
        super("Cheese Topping");
    }

    public static void setCost(double cost){
        Cheese.cost = cost;
    }

    public static double cost(){
        return Cheese.cost;
    }

    @Override
    public double getCost(){
        return Cheese.cost();
    }

}
