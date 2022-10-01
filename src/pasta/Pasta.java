package pasta;

import pastaSauce.PastaSauce;

public abstract class Pasta {

//    private double baseCost;
    private PastaSauce sauce;

//    Pasta(double baseCost){
//        this.baseCost = baseCost;
//    }

    public void setSauce(PastaSauce sauce){
        this.sauce = sauce;
    }

    public String getSauce(){
        return this.sauce.getName();
    }

    public abstract void cookPasta();

//    @Override
//    public double calculateTotalCost(){
//        double totalCost = this.sauce.getCost();
//        return totalCost;
//    }

}
