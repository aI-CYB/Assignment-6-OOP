package builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder luxuryHouse = new LuxuriousHouse();
        Director directorLUX = new Director(luxuryHouse); // Director class

        House LuxHouse = directorLUX.constructHouse(); //Calling builder method
        System.out.println("LUXURY House: ");
        System.out.println(LuxHouse);

        HouseBuilder billionaireHouse = new OracleOfHouse();
        Director directorBillionaire = new Director(billionaireHouse);

        System.out.println();

        House houseBillionaire = directorBillionaire.constructHouse();
        System.out.println("Billionaire House:");
        System.out.println(houseBillionaire);
    }
}
