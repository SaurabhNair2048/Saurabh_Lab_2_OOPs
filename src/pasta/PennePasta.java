package pasta;

public class PennePasta extends Pasta{

//    PennePasta(double baseCost){
//        super(baseCost);
//    }

    @Override
    public void cookPasta(){
        System.out.println("Soaking Pasta in water...");
        System.out.println("Cooking Penne Pasta...");
        System.out.println("Adding Sauce " + getSauce());
        System.out.println("Penne Pasta is ready to be served...");
    }
}
