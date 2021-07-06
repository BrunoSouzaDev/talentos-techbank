package br.com.techbank.semana_1.aula_6;

public class Exercicios {

    public static void exercicio1(){
        // Dado um array com 20 n[umeros, imprima
        // seus valores e trás para frente

        double[] array = {1,2,3,4,5,6,7,8,9,10,11,12};

        for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }

    public static void exercicio2T1(){
        int[] array = {98,0,56,23,45,7,89,0,32,12,-89,45,32,-21,18,0,0,76,45,45};
        //int[] array = {11,25,12,22,64,22};
        int[] sortedArray = new int[array.length];

        int index = 0;
        for(int number : array){

            int aux = 0;
            for(int number2 : array){
                if(number > number2){
                    aux +=1;
                }
            }

            if(sortedArray[aux] != number){
                sortedArray[aux] = number;
            } else{
                for(int i = aux; i< array.length; i++){
                    if(sortedArray[i] != number && number!= 0){
                        sortedArray[i] = number;
                        break;
                    }
                }
            }

            index++;
        }

        for(int number : sortedArray){
            System.out.print(number+", ");
        }
    }

    public static void exercicio2T2(){
        //swap
        //int[] array = {98,56,23,7,89,0,32,12,-89,45,32,-21,18};
        //int[] array = {11,25,12,22,64,22};
        int[] array = {78,89,45,32,12,-98,-32,-15,5,39,67,786,45,45};
        int[] sortedArray = new int[array.length];

        for(int i=0; i < array.length; i++){
            int min = array[i];
            for(int f=i; f < array.length; f++){
                if(array[f] < min){
                    int aux = min;
                    min = array[f];
                    array[f] = aux;
                }
            }
            sortedArray[i] = min;
        }

        for(int number : sortedArray){
            System.out.print(String.format("%d ", number));
        }
    }

    public static void main(String[] args) {
        //exercicio1();
        //exercicio2T1();
        exercicio2T2();
    }
}
