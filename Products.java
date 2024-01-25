abstract class Products {
    private String productName;
    private double price;

    public Products(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
    }

    public Products(String productName, double price, int quantity, int duration) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Goods extends Products {
    private int quantity;

    public Goods(String productName, double price, int quantity) {
        super(productName, price, quantity);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

class Services extends Products {
    private int duration;

    public Services(String productName, double price, int duration) {
        super(productName, price, duration);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

class Main {
    public static void main(String[] args) {
        Goods goods = new Goods("Phone", 500, 10);
        Services services = new Services("Repair", 50, 5);

        System.out.println("Product: " + goods.getProductName());
        System.out.println("Price: $" + goods.getPrice());
        System.out.println("Quantity: " + goods.getQuantity());
        System.out.println("Total: $" + goods.getPrice() * goods.getQuantity());

        System.out.println("Product: " + services.getProductName());
        System.out.println("Price: $" + services.getPrice());
        System.out.println("Duration: " + services.getDuration() + " hours");
        System.out.println("Total: $" + services.getPrice() * services.getDuration());
    }
}