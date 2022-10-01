package order;

import kitchen.Kitchen;
import order.Order;

public class OrderManager {


    public void createPizzaOrder(String name, int id, String pizza, String crust, String size, String[] toppings, double bill){
        Order order = new PizzaOrder(name, id, pizza, crust, size, toppings, bill);
        Kitchen.addOrder(order);
    }

    public void createPastaOrder(String name, int id, String pasta, String sauce, double bill){
        Order order = new PastaOrder(name, id, pasta, sauce, bill);
        Kitchen.addOrder(order);
    }

    public static void notifyCustomer(Order order){
        System.out.println("Customer: " + order.getName() + ", with order Id: " + order.getId() + ". Your order is ready. The bill was " + order.getCost()+"USD. It is already PAID");
    }

}
