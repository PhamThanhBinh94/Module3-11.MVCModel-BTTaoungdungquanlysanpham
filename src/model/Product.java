package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String descript;

    public Product() {
    }

    public Product(int id, String name, double price, String descript) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descript = descript;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }
}
