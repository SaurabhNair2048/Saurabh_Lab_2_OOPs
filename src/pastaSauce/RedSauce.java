package pastaSauce;

public class RedSauce extends PastaSauce{

    private static double cost = 20.0;

    public RedSauce(){
        super("Red Pasta Sauce");
    }

    public static void setCost(double cost){
        RedSauce.cost = cost;
    }

    public static double cost(){
        return RedSauce.cost;
    }

    @Override
    public double getCost(){
        return RedSauce.cost();
    }
}
