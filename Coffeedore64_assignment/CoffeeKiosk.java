import java.util.ArrayList;

public class CoffeeKiosk {
    
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price){
        Item newItem  = new Item(name, price);
        menu.add(newItem);
        newItem.setIndex(menu.indexOf(newItem));
    }

    public void displayMenu(){
        for(Item item : menu){
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public void newOrder(){

        System.out.println("Please enter a customer name for a new order:");
        String name = System.console().readLine();

        //add a new Order...
        Order order = new Order(name);
        displayMenu();


        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        while(!itemNumber.equals("q")){
            //get item object fro menu...
            try{
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            }catch(IndexOutOfBoundsException i ){
                System.out.println("Invalid selection");
            }catch(NumberFormatException n){
                System.out.println("Invalid selection");
            }
            //Enter a new item indexor q to quit...
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }

        order.display();
    }
}
