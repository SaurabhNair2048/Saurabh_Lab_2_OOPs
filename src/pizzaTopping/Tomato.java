package pizzaTopping;

public class Tomato extends Topping {

    private static double cost=1.0;

    Tomato(){
        super("Tomato Topping");
    }

    public static void setCost(double cost){
        Tomato.cost = cost;
    }

    public static double cost(){
        return Tomato.cost;
    }

    @Override
    public double getCost(){
        return Tomato.cost();
    }

}
