class Sales {
    private String productName;
    private double price;
    private int quantity;

    public Sales(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public void displayInvoice() {
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + calculateTotal());
    }

    public String getProductName() {
        return productName;
    }
}

class Service extends Sales {
    private int duration;
    private double price;
    private int quantity;

    public Service(String productName, double price, int quantity, int duration) {
        super(productName, price, quantity);
        this.duration = duration;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return price * quantity * duration;
    }

    public void displayInvoice() {
        System.out.println("Product: " + getProductName());
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Total: $" + calculateTotal());
    }
}

class Goods extends Sales {
    public Goods(String productName, double price, int quantity) {
        super(productName, price, quantity);
    }
}

class Main {
    public static void main(String[] args) {
        Service service = new Service("Repair", 50.0, 1, 5);
        service.displayInvoice();

        Goods goods = new Goods("Phone", 500.0, 10);
        goods.displayInvoice();
    }
}