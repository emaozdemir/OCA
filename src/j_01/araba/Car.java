package j_01.araba;

public class Car extends Vehicle {
    String trans;
    public Car(String trans) {
        this.trans = trans;//line n1
    }
    public Car(String type, int maxSpend, String trans) {
        super(type, maxSpend);//line n2
        this.trans = trans;
    }


}
