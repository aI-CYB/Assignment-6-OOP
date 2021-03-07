package factory;

public class Main {
    public static void main(String[] args) {
        Sealogistic seaLogistic = new Sealogistic();
        Roadlogistic roadLogistic = new Roadlogistic();
        Transport ship = seaLogistic.createTransport();  //Creating ship with createTransport method
        Transport truck = roadLogistic.createTransport();
        ship.deliver();
        truck.deliver();
    }
}
