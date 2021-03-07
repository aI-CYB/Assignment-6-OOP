package builder;

public class LuxuriousHouse implements HouseBuilder{
    private House house;

    public LuxuriousHouse() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        System.out.println("The foundation is build");
        house.setFoundationType("Pile foundation");
    }

    @Override
    public void buildStatue() {
        System.out.println("Great statue is setting");
        house.setStatue(true);
    }

    @Override
    public void buildRooms() {
        System.out.println("Luxury house must have a lot of rooms!");
        house.setRoomNumber(15);
    }

    @Override
    public void setAddress() {
        System.out.println("So as it's luxury, address is a private");
        house.setAddress("Somewhere far away (Baker Street 221B)");
    }

    @Override
    public void buildGarden() {
        System.out.println("It has a very big garden!");
        house.setGarden(true);
    }

    @Override
    public void buildPool() {
        System.out.println("The president approves it!");
        house.setPool(true);
    }

    @Override
    public void setArea() {
        System.out.println("OMG! Very big!");
        house.setArea(130000);
    }

    @Override
    public void buildFloor() {
        System.out.println("At least 3 floors(basement)");
        house.setFloors(4);
    }

    @Override
    public House getHouse(){
        System.out.println("Luxury house built.");
        return house;
    }
}

