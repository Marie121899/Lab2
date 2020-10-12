package Cars;


public class Bus  extends Vehicle{

    public Bus() {
    }

    @Override
    public void accelarate() {
        System.out.print("The acceleration is too slow");
    }

    @Override
    public void stop() {
        System.out.print("The bus can Stop now");
    }

    @Override
    public void gas() {
       System.out.print("The bus uses the gas");
    }
