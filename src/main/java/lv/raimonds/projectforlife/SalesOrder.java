package lv.raimonds.projectforlife;

public class SalesOrder {
    private String name;
    private final String id;
    private float price;

    public SalesOrder(String name, String id, float price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
