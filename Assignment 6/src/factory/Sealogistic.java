package factory;

public class Sealogistic extends Logistic{

    @Override
    public Transport createTransport(){
        return new Ship();
    }
}

