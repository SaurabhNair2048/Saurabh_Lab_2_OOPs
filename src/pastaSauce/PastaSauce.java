package pastaSauce;

public abstract class PastaSauce {

    private String name;

    PastaSauce(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract double getCost();

}
