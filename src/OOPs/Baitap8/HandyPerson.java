package OOPs.Baitap8;

public class HandyPerson extends Human implements Plumber, Electrician {

    public HandyPerson(String name) {
        super(name);
    }
    @Override
    public String changeBulb() {
        return null;
    }
    @Override
    public String unplugDrain() {
        return null;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
