package four1.OOPs7;

public class Product {

    private String name;
    private double price;
    private int stock;

    public Product(String productName, double productPrice, int productStock) {

        this.name = productName;
        this.price = productPrice;
        this.stock = productStock;

    }

    public void printProduct() {

        System.out.println(name + ", price: " + price + ", " + stock + " pcs");

    }

}
