package pizzaTopping;

public class Mushroom extends Topping {

    private static double cost=1.0;

    Mushroom(){
        super("Mushroom Topping");
    }

    public static void setCost(double cost){
        Mushroom.cost = cost;
    }

    public static double cost(){
        return Mushroom.cost;
    }

    @Override
    public double getCost(){
        return Mushroom.cost();
    }

}
