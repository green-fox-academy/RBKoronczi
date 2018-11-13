package petrolstation;

public class Station {
    int gasAmount;

    void refillCar(Car car) {
        int refillAmount = car.capacity - car.gasAmount;
        car.gasAmount += refillAmount;
        this.gasAmount -= refillAmount;
    }
}
