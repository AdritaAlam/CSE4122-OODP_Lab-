//Here the building is designed with a common room,a prayer room and two washrooms
public class Main {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");

        int firstFloor = building.addStructure(floor1);

        Room prayerrm = new Room("1F prayer room");
        Room washroom1m = new Room("1F Men's washroom");
        Room washroom1w = new Room("1F Women's washroom");
        Room common1 = new Room("1F common area");

        int firstPrayer = floor1.addStructure(prayerrm);
        int firstMens = floor1.addStructure(washroom1m);
        int firstWomans = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        building.enter();
        Housing currentFloor = (Housing) building.getStructure(firstFloor);

        currentFloor.enter();
        //floor1.enter();
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom = (Room) currentFloor.getStructure(firstWomans);
        currentRoom.enter();

        currentRoom.location();

        currentRoom = (Room) currentFloor.getStructure(firstPrayer);
        currentRoom.enter();
        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter();
        building.exit();


    }
}
