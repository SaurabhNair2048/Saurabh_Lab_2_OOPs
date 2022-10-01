package kitchen;

import order.Order;
import order.OrderManager;
import order.PastaOrder;
import order.PizzaOrder;
import pasta.DitaliniPasta;
import pasta.Pasta;
import pasta.PennePasta;
import pizza.NonVegPizza;
import pizza.Pizza;
import pizza.VeganPizza;
import pizza.VegetarianPizza;

public class Kitchen {

    private static Order[] orders = new Order[100];
    private static int orderProcessing = -1;
    private static int lastOrder = -1;

    public static void addOrder(Order order){
        int loc = (lastOrder + 1)%100;
        if(orderProcessing != -1 && (loc!=orderProcessing)){
            orders[loc] = order;
            ++lastOrder;
            processOrder();
        } else if(orderProcessing != -1 && (loc==orderProcessing)){
            System.out.println("Order cannot be accepted. Overloaded!!");
        } else {
            if (orders[loc + 1] != null) {
                System.out.println("Order cannot be accepted. Overloaded!!");
            } else {
                orders[loc] = order;
                ++lastOrder;
                processOrder();
            }
        }
    }

    private static void processOrder(){
        if(lastOrder!=-1){
            if(orderProcessing==99){
                orderProcessing=0;
            } else {
                orderProcessing++;
            }
            if(orders[orderProcessing] instanceof PizzaOrder){
                PizzaOrder pizzaOrder = (PizzaOrder) orders[orderProcessing];
                Pizza pizza = null;
                switch(pizzaOrder.getPizzaType().toLowerCase()){
                    case "veg":
                        pizza = new VegetarianPizza();
                        break;
                    case "non-veg":
                        pizza = new NonVegPizza();
                        break;
                    case "vegan":
                        pizza = new VeganPizza();
                }
                pizza.setSize(pizzaOrder.getSize());
                pizza.setCrustType(pizzaOrder.getPizzaCrust());
                pizza.addToppings(pizzaOrder.getToppings());
                pizza.bakePizza();
            } else {
                PastaOrder pastaOrder = (PastaOrder) orders[orderProcessing];
                Pasta pasta = null;
                switch(pastaOrder.getPastaType().toLowerCase()){
                    case "penne":
                        pasta = new PennePasta();
                        break;
                    case "ditalini":
                        pasta = new DitaliniPasta();
                }
                pasta.setSauce(pastaOrder.getPastaSauce());
                pasta.cookPasta();
            }
            OrderManager.notifyCustomer(orders[orderProcessing]);
            orders[orderProcessing] = null;
        }
    }
}
