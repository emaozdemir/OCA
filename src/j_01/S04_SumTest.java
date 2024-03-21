package j_01;

public class S04_SumTest {
    public static void doSum(Integer x,Integer y){
        System.out.println("ınteger sum is "+(x+y));
    }
    public static void doSum(Double x,Double y){
        System.out.println("Double sum is "+(x+y));
    }
    public static void doSum(Float x,Float y){
        System.out.println("Float sum is "+(x+y));
    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
    }
}
