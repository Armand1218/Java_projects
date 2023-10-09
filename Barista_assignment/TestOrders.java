public class TestOrders {
    public static void main(String[] args) {
        Item item1 = new Item("Drip Coffee", 3.50);
        Item item2 = new Item("Capuccino", 3.00);
        Item item3 = new Item("Iced Coffee", 2.50);
        Item item4 = new Item("Mocha", 3.25);

        Orders order1 = new Orders();
        Orders order2 = new Orders();
        Orders order3 = new Orders("Luffy");
        Orders order4 = new Orders("Ace");
        Orders order5 = new Orders("Sabo");

        order1.addItem(item4);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item1);

        order3.addItem(item2);
        order3.addItem(item2); 

        order4.addItem(item1);
        order4.addItem(item1);

        order5.addItem(item1);
        order5.addItem(item1);
        order5.addItem(item4);

        //print test status
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());

        //get order total
        System.out.println(order3.getTotal());
        order3.display();
    }
}
