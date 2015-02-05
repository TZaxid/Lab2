package task1;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0 && id < Integer.MAX_VALUE) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null)
            this.name = name;
        else
            System.out.println("name error!");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 && price < Integer.MAX_VALUE) {
            this.price = price;
        }
    }

    public void show() {
        System.out.println("#" + id + " " + name + " " + price);
    }
}
