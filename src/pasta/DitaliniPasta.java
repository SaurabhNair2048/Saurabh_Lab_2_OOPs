package pasta;

public class DitaliniPasta  extends Pasta{

//    DitaliniPasta(double baseCost){
//        super(baseCost);
//    }

    @Override
    public void cookPasta(){
        System.out.println("Soaking Pasta in water...");
        System.out.println("Cooking Ditalini Pasta...");
        System.out.println("Adding Sauce " + getSauce());
        System.out.println("Ditalini Pasta is ready to be served...");
    }
}
