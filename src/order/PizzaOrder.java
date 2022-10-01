package order;

import pizza.PizzaSize;

public class PizzaOrder extends Order{

    private String pizzaType;
    private String pizzaCrust;
    private PizzaSize size;
    private String[] toppings;

    PizzaOrder(String name, int id, String type, String crust, String size, String[] toppings, double cost){
        super(name, id, cost);
        this.pizzaType = type;
        this.pizzaCrust = crust;
        switch (size.toLowerCase()){
            case "small":
                this.size = PizzaSize.SMALL;
                break;
            case "medium":
                this.size = PizzaSize.MEDIUM;
                break;
            case "large":
                this.size = PizzaSize.LARGE;
        }
        this.toppings = toppings;
    }

    public String getPizzaType(){
        return this.pizzaType;
    }

    public String getPizzaCrust(){
        return this.pizzaCrust;
    }

    public PizzaSize getSize(){
        return this.size;
    }

    public String[] getToppings(){
        return this.toppings;
    }

}
