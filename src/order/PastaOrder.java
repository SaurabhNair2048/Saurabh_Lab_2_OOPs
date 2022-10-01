package order;

import pasta.Pasta;
import pastaSauce.PastaSauce;
import pastaSauce.RedSauce;
import pastaSauce.WhiteSauce;
import pizza.PizzaSize;

public class PastaOrder extends Order{

    private String pastaType;
    private PastaSauce pastaSauce;

    PastaOrder(String name, int id, String type, String sauce, double cost){
        super(name, id, cost);
        this.pastaType = type;
        switch(sauce.toLowerCase()){
            case "white":
                this.pastaSauce = new WhiteSauce();
                break;
            case "red":
                this.pastaSauce = new RedSauce();
        }
    }

    public String getPastaType(){
        return this.pastaType;
    }

    public PastaSauce getPastaSauce(){
        return this.pastaSauce;
    }

}
