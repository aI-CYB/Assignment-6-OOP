package singleton;

public class Main {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM data");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM data");
    }
}
