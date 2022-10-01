package pastaSauce;

public class WhiteSauce extends PastaSauce{

    private static double cost = 10.0;

    public WhiteSauce(){
        super("White Pasta Sauce");
    }

    public static void setCost(double cost){
        WhiteSauce.cost = cost;
    }

    public static double cost(){
        return WhiteSauce.cost;
    }

    @Override
    public double getCost(){
        return WhiteSauce.cost();
    }
}
