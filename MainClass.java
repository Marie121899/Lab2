package Cars;

public class MainClass {
    public static void main(String[] args) {
        Sedan sedan1 =new Sedan();
        Vehicle sedan2 = new Sedan();
        Automobile sedan3 = new Sedan();
        System.out.println();
        sedan1.accelarate();
        System.out.println();
        sedan1.accelerate(100);// overloading
        sedan2.accelarate();//overrriden
        System.out.println();
        sedan3.enginePower();

    }
    
}
