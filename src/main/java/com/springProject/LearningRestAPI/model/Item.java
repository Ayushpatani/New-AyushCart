package model;

public class Item {

    private int price;
    private int quantity;
    private int amount;
    private String name;
    private String desc;

    public Item(int price, int quantity, String name, String desc) {

        this.price = price;
        this.quantity = quantity;
        this.amount = price * quantity;
        this.name = name;
        this.desc = desc;
    }

    public void setPrice(int price) {
        this.price = price;
        this.amount = this.price * this.quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.amount = this.price * this.quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}