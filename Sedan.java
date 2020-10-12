package Cars;
public class Sedan extends Vehicle implements Automobile {
    private String type;
    public Sedan() {
    }

    @Override
    public void accelarate() {

        System.out.print("The car cannot accelarate beyond 200 km/h");
    }
    public void accelerate(int acceleration){
        System.out.println("The  accelration overloaded  is "+acceleration);
    }

    @Override
    public void stop() {

        System.out.print("The car has stopped");
    }

    @Override
    public void gas() {
        System.out.print("The car uses gas");
    }

    @Override
    public void speed(int car_speed) {
        car_speed = 200;
       System.out.print(car_speed + " Km/h");
    }

    @Override
    public int mileage(int car_mileage) {
        car_mileage = 1000;
        return car_mileage;
    }

    @Override
    public void enginePower() {
        System.out.print("The power engine is 40 hp");//hp : horse-power
    }
}
