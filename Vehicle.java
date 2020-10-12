package Cars;


import java.lang.*;
public  abstract class Vehicle {
     private String color;
     private String make;
     private String engine;
     private int seater;


    public Vehicle() {
    }

    public Vehicle(String color, String make) {
        this.color = color;
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeater() {
        return seater;
    }

    public void setSeater(int seater) {
        this.seater = seater;
    }



    public abstract void accelarate();

    public abstract void stop();

    public abstract void gas();


}
