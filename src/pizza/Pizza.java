package pizza;

import pizzaTopping.Topping;
import pizzaTopping.ToppingGenerator;

public abstract class Pizza {

    private Topping[] toppings;
    private PizzaSize size;
    private String crustType;


    public String getCrustType(){
        return this.crustType;
    }

    public String getSize(){
        return this.size.toString();
    }

    public void setSize(PizzaSize size){
        this.size = size;
    }

    public void setCrustType(String crustType){
        this.crustType = crustType;
    }

    public Topping[] getToppings(){
        return this.toppings;
    }

    public void setToppings(Topping[] toppings){
        this.toppings = toppings;
    }

    public abstract void bakePizza();

    public abstract double getBaseCost();

    public void addToppings(String[] toppings){
        Topping[] t = new Topping[toppings.length];
        for(int i=0; i<toppings.length; i++){
            t[i] = ToppingGenerator.buildTopping(toppings[i]);
        }
        setToppings(t);
    }

//    @Override
//    public double calculateTotalCost() {
//        double totalCost = getBaseCost();
//        totalCost*=(this.size.ordinal()+1);
//        for(Topping t : getToppings()){
//            totalCost += t.getCost();
//        }
//        return totalCost;
//    }
}
