package factory;

abstract class Logistic { //Abstract class that
    abstract Transport createTransport();

    public void planDelivery(){
        Transport t = createTransport();
    }

}
