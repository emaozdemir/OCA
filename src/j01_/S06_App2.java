package j01_;

public class S06_App2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j += i) / 5;
        System.out.println(i + ":" + j + ":" + k);
    }
}
