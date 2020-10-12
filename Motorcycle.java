package Cars;
import java.lang.*;

public class Motorcycle  extends Vehicle{

    public Motorcycle() {
    }

    public Motorcycle(String seater, String make) {
        super(seater, make);
    }

    @Override
    public int getSeater() {
        return 5;
    }

    @Override
    public void gas() {
        System.out.print("A motor vehicle does not use gas in Kenya");
    }

    @Override
    public void stop() {
        System.out.print("The vehicle has stopped");
    }

    @Override
    public void accelarate() {
        System.out.print("The motor vehicle has accelerated");
    }

    @Override
    public void setSeater(int seater) {
        super.setSeater(seater);
    }
}
