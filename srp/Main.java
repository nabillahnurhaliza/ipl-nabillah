class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Order order = new Order();
        order.addItem(item);
        OrderHistory history = new OrderHistory();
        history.getDailyHistory();
        OrderViewer viewer = new OrderViewer();
        viewer.printOrder(order);
    }
}