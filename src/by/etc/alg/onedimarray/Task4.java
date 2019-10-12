package by.etc.alg.onedimarray;


import java.util.Arrays;

/**
 * Поменять местами наибольший и наименьший элемент.
 */

public class Task4 {

    public static void function(int [] array) {
        int maxInd = 0;
        int maxNum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > maxNum) {
                maxNum = array[i];
                maxInd = i;
            }
        }
        int minInd = 0;
        int minNum = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minNum) {
                minNum = array[i];
                minInd = i;
            }
        }

        int temp;
        temp = array[minInd];
        array[minInd] = array[maxInd];
        array[maxInd] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int [] array = {1000,9,3,-4,15,200};
        function(array);
    }
}
