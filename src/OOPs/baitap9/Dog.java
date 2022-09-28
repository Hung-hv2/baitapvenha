package OOPs.baitap9;

public class Dog extends Mammal implements Nameable {
    private String name;

    public Dog(String type, String name) {
        super(type);
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName() {

    }
}
