/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab008;

/**
 *
 * @author user
 */
public class Ex003 {
    public static void main(String[] args) {
        String[] strArray = new String[]{"Now", "is", "the", "time", "for", "all", 
            "good", "men", "to", "come", "to", "the", "aid", "of", "their", 
            "country"};
        qSort(strArray, 0, strArray.length-1);
        for (String s : strArray){
            System.out.println(s);
        }
    }
    public static void qSort(String[] arr, int start, int end){
       if (start < end){
           int q = partition(arr, start, end);
           qSort(arr, start, q-1);
           qSort(arr, q+1, end);
       }
    }
    
    public static int partition(String[] arr, int start, int end){
        String x = arr[end];
        int i = start - 1;
        int j = start;
        while (j < end){
            if (arr[j].compareTo(x) <= 0){
                    i++;
                    swap(arr, i, j);
                }
            j++;
        }
        swap(arr, end, i+1);
        return i+1;
    }
    
    public static void swap(String[] arr, int a, int b){
        if (a != b){
            String s = arr[a];
            arr[a] = arr[b];
            arr[b] = s;
        }
    }
}
