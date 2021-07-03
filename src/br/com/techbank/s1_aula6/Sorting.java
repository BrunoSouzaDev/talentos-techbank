package br.com.techbank.s1_aula6;

import java.util.Arrays;

public class Sorting {

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //encontra o menor elemento
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
                //swap o minimo com a posicao
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }


    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for(int i = 0; i<n;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {78,89,45,32,12,-98,-32,-15,5,39,67,786,45,45};

        //selectionSort(array);
        //bubbleSort(array);
        Arrays.sort(array);

        for(int number : array){
            System.out.print(String.format("%d ", number));
        }

        System.out.println("\n");
        System.out.println(Arrays.toString(array));
    }
}
