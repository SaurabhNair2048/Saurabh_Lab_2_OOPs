package pizzaTopping;

public abstract class Topping {

    private String name;

    Topping(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract double getCost();

}
