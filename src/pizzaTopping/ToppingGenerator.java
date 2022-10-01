package pizzaTopping;

public final class ToppingGenerator {

    public static final Topping buildTopping(String topping){
        switch(topping){
            case "Cheese":
                return new Cheese();
            case "Jalapeno":
                return new Jalapeno();
            case "Mushroom":
                return new Mushroom();
            case "Spinach":
                return new Spinach();
            case "Tomato":
                return new Tomato();
            default:
                return null;
        }
    }
}
