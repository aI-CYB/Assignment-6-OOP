package builder;

public class OracleOfHouse implements HouseBuilder{
    private House house;

    public OracleOfHouse() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        System.out.println("The foundation is build");
        house.setFoundationType("Strip foundation");
    }

    @Override
    public void buildStatue() {
        System.out.println("No need in statue");
        house.setStatue(false);
    }

    @Override
    public void buildRooms() {
        System.out.println("Let's be modest");
        house.setRoomNumber(9);
    }

    @Override
    public void setAddress() {
        System.out.println("From 1960");
        house.setAddress("BI group Inc. 3555 Baker Street");
    }

    @Override
    public void buildGarden() {
        System.out.println("Just a little one");
        house.setGarden(true);
    }

    @Override
    public void buildPool() {
        System.out.println("Pool is like a useless");
        house.setPool(false);
    }

    @Override
    public void setArea() {
        System.out.println("No need in big mansion");
        house.setArea(320);
    }

    @Override
    public void buildFloor() {
        System.out.println("3 floors in enough");
        house.setFloors(3);
    }

    @Override
    public House getHouse(){
        System.out.println("Pretty enough for billionaire");
        return house;
    }
}
