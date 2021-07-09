public class Product {
    int id;
    String name;
    Float price;
    int quantity;

    public Product() {
    }

    public Product(String pName, Float price, int quantity) {
        this.id = id;
        this.name = pName;
        this.price = price;
        this.quantity = quantity;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
