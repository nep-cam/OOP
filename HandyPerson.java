public class HandyPerson extends Human implements Plumber, Electrician {
    public HandyPerson(String name) {
        super(name);
    }

    public String changeBulb() {
        return "sua dien";
    }

    public String unplugDrain() {
        return "sua ong nuoc";
    }

    public String toString() {
        return super.toString();
    }
}
