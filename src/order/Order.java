package order;

public abstract class Order {

    private String name;
    private int id;
    private double cost;

    Order(String name, int id, double cost){
        this.name = name;
        this.id = id;
        this.cost = cost;
    }

    public double getCost(){
        return this.cost;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
}
