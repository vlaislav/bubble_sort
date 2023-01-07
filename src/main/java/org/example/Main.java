package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 9, 17, 85, 14, 64, 85, 21, 48, 56, 41, 48, 21, 86, 34, 58, 41584, 5456, 88, 21, 548, 246, 228, 348, 468};
        for (int i = 0; i < array.length ; i++){
            for (int j = 0;j < array.length - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                }
            }
        }
    System.out.print(Arrays.toString(array));
    }
}