package OOPs.Baitap5;

public class Invoice {
    private int id;
    private double amount;
    private Customer customer;

    public Invoice(int id, double amount, Customer customer) {
        this.id = id;
        this.amount = amount;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer == null ? 0 : customer.getId();
    }

    public String getCustomerName() {
        return customer == null ? "" : customer.getName();
    }

    public int getCustomerDiscount() {
        return customer == null ? 0 : customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        if (customer == null) {
            return 0;
        }

        if (getCustomerDiscount() == 0) {
            return amount;
        }

        return amount == 0 ? 0 : (amount * getCustomerDiscount()) / 100;
    }

    @Override
    public String toString() {
        return String.format("Invoice[id=%d, customer=%s, amount=%f]", id, customer, amount);
    }

}
