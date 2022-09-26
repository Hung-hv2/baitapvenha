package OOPs.Baitap5;

public class Customer {
    private int id;
    private int discount;
    private String name;

    public Customer(int id, int discount, String name) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)(%d%%)", name, id, discount);
    }
}

