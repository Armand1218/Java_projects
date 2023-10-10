import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting, your order will be ready soon.";
    }

    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public double getTotal(){
        double total = 0;
        for(Item item : items ){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println("Customer Name:" + this.name);
        for(Item item : items ){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.printf("Total: $%.2f" + getTotal());
    }
}