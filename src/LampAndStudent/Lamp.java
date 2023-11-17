package LampAndStudent;

public class Lamp {

    boolean is_on;

    void turnOn() {
        System.out.println("light's on!");
    }

    void turnOff() {
        System.out.println("light's off!");

    }
}
class main{
    
public static void main (String [] args){
    Lamp led = new Lamp();
    Lamp Halogen = new Lamp();
    led.turnOff();
    Halogen.turnOn();
    
}


}
