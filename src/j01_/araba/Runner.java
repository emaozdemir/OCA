package j01_.araba;

public class Runner {
    public static void main(String[] args) {
        Car c1=new Car("Auto");
        Car c2=new Car("4W",150,"Manual");
        System.out.println(c1.type+ " "+c1.maxSpend+" "+c1.trans);
        System.out.println(c2.type+ " "+c2.maxSpend+" "+c2.trans);
    }
}
