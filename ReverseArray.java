package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {12, 23, 22, 34, 42,2};
        System.out.println(Arrays.toString(reverseArray(a)));
    }
    static int[] reverseArray(int[] a){
        int start = 0, end = a.length-1;
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
       return a;
    }
}

