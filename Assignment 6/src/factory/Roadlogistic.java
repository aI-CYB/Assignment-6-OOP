package factory;

public class Roadlogistic extends Logistic{

    @Override
    public Transport createTransport(){
        return new Truck();
    }
}
