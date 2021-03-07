package builder;

public class Director {
    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse(){
        this.houseBuilder.buildFloor();
        this.houseBuilder.buildGarden();
        this.houseBuilder.buildPool();
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildRooms();
        this.houseBuilder.buildStatue();
        this.houseBuilder.setAddress();
        this.houseBuilder.setArea();
        return this.houseBuilder.getHouse();
    }
}
