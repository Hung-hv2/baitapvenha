package OOPs.baitap9;

public class Head extends Dog {
    private String size;
    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public Head(String type, String name) {
        super(type, name);
    }
}
