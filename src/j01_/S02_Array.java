package j01_;

import java.util.Arrays;

public class S02_Array {
    //which option represent the state of the num array after sıccessfull completion of the outer loop
    public static void main(String[] args) {
        int num [][]=new int [1][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                num [i][j]=10;
            }
        }
        System.out.println(Arrays.deepToString(num));
    }

}
