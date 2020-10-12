package Cars;

public class SportsCars extends Vehicle implements Automobile {

    public SportsCars() {
    }
    public SportsCars(String color, String make) {
        super(color, make);
    }


    @Override
    public void setSeater(int seat) {
        super.setSeater(seat);
    }

    @Override
    public int getSeater() {
        return super.getSeater();
    }

    @Override
    public void setEngine(String engine_name) {
        super.setEngine(engine_name);
    }

    @Override
    public String getEngine() {
        return super.getEngine();
    }

    @Override
    public void gas() {
        System.out.print("The car uses gas");

    }

    @Override
    public void accelarate() {
        System.out.print("The car can accelerate more than that");

    }

    @Override
    public void stop() {
        System.out.print("The car has abruptly stopped");

    }

    @Override
    public void speed(int car_speed) {
        car_speed = 2500;
        System.out.print("the speed is "+ car_speed + "km/h");

    }

    @Override
    public int mileage(int car_mileage) {
        car_mileage =4000;
        return car_mileage;

    }

    @Override
    public void enginePower() {
        System.out.print("The engine power is 2000 hp");//hp : horse-power

    }


}
