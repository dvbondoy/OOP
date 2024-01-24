abstract class Product {
    private String productName;
    private double price;
    private int quantity;
    private int duration;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String productName, double price, int quantity, int duration) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.duration = duration;
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

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDuration() {
        return duration;
    }
}

class Service extends Product {
    // private int duration;
    
    public Service(String productName, double price, int quantity, int duration) {
        super(productName, price, quantity, duration);
    }

    public double calculateTotal() {
        return getPrice() * getQuantity() * getDuration();
    }

    public void displayInvoice() {
        System.out.println("Product: " + getProductName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Duration: " + getDuration() + " hours");
        System.out.println("Total: $" + calculateTotal());
    }
}

class Goods extends Product {
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