package fleet.of.things;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        Thing milk = new Thing("Get milk");
        fleet.add(milk);
        Thing obstacles = new Thing("Remove the obstacles");
        fleet.add(obstacles);
        Thing stand = new Thing("Stand up");
        stand.complete();
        fleet.add(stand);
        Thing lunch = new Thing("Eat lunch");
        lunch.complete();
        fleet.add(lunch);

        System.out.println(fleet);
    }
}