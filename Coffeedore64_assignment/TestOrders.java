public class TestOrders {
    public static void main(String[] args){
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("Banana", 3.00);
        coffeeKiosk.addMenuItem("coffee", 2.00);
        coffeeKiosk.addMenuItem("Latte", 3.50);
        coffeeKiosk.addMenuItem("Muffin", 4.75);
        coffeeKiosk.addMenuItem("Cappucino", 2.75);

        //coffeeKiosk.displayMenu();
        coffeeKiosk.newOrder();
    }
}
