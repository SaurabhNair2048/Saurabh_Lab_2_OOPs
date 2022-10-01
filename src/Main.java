import order.OrderManager;
import pastaSauce.RedSauce;
import pastaSauce.WhiteSauce;
import pizza.NonVegPizza;
import pizza.VeganPizza;
import pizza.VegetarianPizza;
import pizzaTopping.*;

import java.util.Scanner;

public class Main {

    static int id = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        OrderManager om = new OrderManager();
        begin: while(true){
            System.out.println("Enter Customer name: ");
            String name = s.nextLine();
            double bill = 0.0;


            Menu.displayPizzaOrPasta();
            String str = s.next();
            if(str.equals("1")){
                String pizzaType="";
                type: while(true){
                    Menu.displayPizzaOptions();
                    String type = s.next();
                    switch(type){
                        case "1":
                            pizzaType = "Veg";
                            bill += VegetarianPizza.cost();
                            break type;
                        case "2":
                            pizzaType = "Non-Veg";
                            bill += NonVegPizza.cost();
                            break type;
                        case "3":
                            pizzaType = "Vegan";
                            bill += VeganPizza.cost();
                            break type;
                        case "a":
                            System.out.println("Let's begin again!");
                            s.nextLine();
                            continue begin;
                        case "q":
                            System.out.println("Thank You for your time and hope to serve you again :)");
                            break begin;
                        default:
                            continue type;
                    }
                }
                String size = "";
                size: while(true){
                    Menu.displayPizzaSizeOptions();
                    String si = s.next();
                    switch(si){
                        case "1":
                            size = "small";
                            break size;
                        case "2":
                            size = "medium";
                            bill += bill;
                            break size;
                        case "3":
                            size = "large";
                            bill += (bill+bill);
                            break size;
                        case "a":
                            System.out.println("Let's begin again!");
                            s.nextLine();
                            continue begin;
                        case "q":
                            System.out.println("Thank You for your time and hope to serve you again :)");
                            break begin;
                        default:
                            continue size;
                    }
                }
                String crust="";
                crust: while(true){
                    Menu.displayPizzaCrustOptions();
                    String cr = s.next();
                    switch(cr){
                        case "1":
                            crust = "thin";
                            break crust;
                        case "2":
                            crust = "thick";
                            break crust;
                        case "a":
                            System.out.println("Let's begin again!");
                            s.nextLine();
                            continue begin;
                        case "q":
                            System.out.println("Thank You for your time and hope to serve you again :)");
                            break begin;
                        default:
                            continue crust;
                    }
                }
                StringBuilder strb = new StringBuilder();
                tops: while(true){
                    Menu.displayToppingOptions();
                    String tops = s.next();
                    switch(tops){
                        case "1":
                            strb.append("Cheese ");
                            bill += Cheese.cost();
                            continue tops;
                        case "2":
                            strb.append("Jalapeno ");
                            bill += Jalapeno.cost();
                            continue tops;
                        case "3":
                            strb.append("Mushroom ");
                            bill += Mushroom.cost();
                            continue tops;
                        case "4":
                            strb.append("Spinach ");
                            bill += Spinach.cost();
                            continue tops;
                        case "5":
                            strb.append("Tomato ");
                            bill += Tomato.cost();
                            continue tops;
                        case "a":
                            System.out.println("Let's begin again!");
                            s.nextLine();
                            continue begin;
                        case "q":
                            System.out.println("Thank You for your time and hope to serve you again :)");
                            break begin;
                        default:
                            break tops;
                    }
                }
                String[] toppings = strb.toString().trim().split(" ");
                s.nextLine();
                System.out.println("Please pay " + bill + "USD to confirm your order. Pay by typing in your name again. The amount will be automatically deducted from your bank account :)");
                String confirm = s.nextLine();
                if(confirm.trim().equalsIgnoreCase(name.trim())){
                    om.createPizzaOrder(name, ++id, pizzaType, crust, size, toppings, bill);
                } else {
                    System.out.println("Sorry " + name.trim() + "! Your order could not be confirmed due to non payment");
                }

            } else if(str.equals("2")){

                String pastaType = "";
                type: while(true){
                    Menu.displayPastaOptions();
                    String type = s.next();
                    switch(type){
                        case "1":
                            pastaType="Penne";
                            break type;
                        case "2":
                            pastaType="Ditalini";
                            break type;
                        case "a":
                            System.out.println("Let's begin again!");
                            s.nextLine();
                            continue begin;
                        case "q":
                            System.out.println("Thank You for your time and hope to serve you again :)");
                            break begin;
                        default:
                            continue type;
                    }
                }
                String sauce="";
                sauce: while(true){
                    Menu.displayPastaSauceOptions();
                    String sau = s.next();
                    switch(sau){
                        case "1":
                            sauce = "White";
                            bill = WhiteSauce.cost();
                            break sauce;
                        case "2":
                            sauce = "red";
                            bill = RedSauce.cost();
                            break sauce;
                        case "a":
                            System.out.println("Let's begin again!");
                            s.nextLine();
                            continue begin;
                        case "q":
                            System.out.println("Thank You for your time and hope to serve you again :)");
                            break begin;
                        default:
                            continue sauce;
                    }
                }
                s.nextLine();
                System.out.println("Please pay " + bill + "USD to confirm your order. Pay by typing in your name again. The amount will be automatically deducted from your bank account :)");
                String confirm = s.nextLine();
                if(confirm.trim().equalsIgnoreCase(name.trim())){
                    om.createPastaOrder(name, ++id, pastaType, sauce, bill);
                } else {
                    System.out.println("Sorry " + name.trim() + "! Your order could not be confirmed due to non payment");
                }


            } else if(str.equals("a")){
                System.out.println("Let's begin again!");
                s.nextLine();
                continue begin;
            } else if(str.equals("q")){
                System.out.println("Thank You for your time and hope to serve you again :)");
                break begin;
            } else {
                continue;
            }


            System.out.println("Do you wish to order again? Yes/No; Default to no : ");
            String orderAgain = s.next();
            s.nextLine();
            if(!orderAgain.equalsIgnoreCase("yes")){
                System.out.println("Thank you for the purchase and the hope you enjoy the meal! :)");
                break;
            }

        }
    }
}
