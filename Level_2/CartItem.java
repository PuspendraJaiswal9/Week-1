class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    public void addItem(int quantity) {
        this.quantity += quantity;
        System.out.println(quantity + " more items added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            System.out.println(quantity + " items removed from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in the cart!");
        }
    }

    // Method to display the total cost
    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + totalCost);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 800.00, 1);
        item.addItem(2);
        item.displayTotalCost();
        item.removeItem(1);
        item.displayTotalCost();
    }
}