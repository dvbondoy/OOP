abstract class Product {
    private String productName;
    private double price;
    private int quantity;
    private int duration;
    private String productType = "goods";

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
        this.productType = "service";
    }

    public double calculateTotal() {
        if(productType.equals("service"))
            return price * quantity * duration;
        else if(productType.equals("goods"))
            return price * quantity;
        else
            return 0;
       
        // return price * quantity;
    }

    public void displayInvoice() {
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        
        if(productType.equals("service"))
            System.out.println("Duration: " + duration + " hours");
        else
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

    public void setProductType(String productType) {
        this.productType = productType;
    }
}

class Service extends Product {
    
    public Service(String productName, double price, int quantity, int duration) {
        super(productName, price, quantity, duration);
        // setProductType("service");
    }

    // public double calculateTotal() {
    //     return getPrice() * getQuantity() * getDuration();
    // }

    // public void displayInvoice() {
    //     System.out.println("Product: " + getProductName());
    //     System.out.println("Price: $" + getPrice());
    //     System.out.println("Quantity: " + getQuantity());
    //     System.out.println("Duration: " + getDuration() + " hours");
    //     System.out.println("Total: $" + calculateTotal());
    // }
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