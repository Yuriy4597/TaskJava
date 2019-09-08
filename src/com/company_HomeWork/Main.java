package com.company_HomeWork;



public class Main {


    public static void main(String[] args) {
        int[] array = new int[]{10, 15, -1, 4, 9, 2, 8, 11, 101};
        String[] array1 = new String [] { "Oleh", "Tolik", "Anna", "Olena", "Marta", "Volodymyr"};

        int i;
        System.out.println(findMax(array));
        System.out.println(findMin(array));
        System.out.println(avg(array));
        System.out.println("\nВивести на екран всі елементи масиву “array” використовуючи цикл\n");
        //for( i=0; i<=array.length;i++){ System.out.println(array[i]); }  //Task 1
        //while (i < array.length){  i = array.length;   System.out.println(i);}


        System.out.println("Значення менше за “0” : ");
        // проглядаємо кожен елемент масиву
        for (i = 0; i < array.length; i++) // якщо елемент від'ємний, показуємо його      //Task 2
        {
            if (array[i] < 0) System.out.println("\n array[" + i + "]=" + array[i]);
        }


        System.out.println("значення більше за “0” але менше 10 : ");
        for (i = 0; i < array.length; i++) // проглядаємо кожен елемент масиву            //Task 3
        {
            if (array[i] > 0 && array[i] < 10) System.out.println("\n array [" + i + "]=" + array[i]);
        }


        System.out.println("Вивести на екран всі елементи масиву “array” та, поряд чи число більше чи менше за “0”.  : ");
        for (i = 0; i < array.length; i++) {
            if (array[i] > 0)
                System.out.println("\n array [" + i + "]=" + array[i] + " IS BIGGER THAN ZERO");   //Task 4
            else System.out.println("\n array [" + i + "]=" + array[i] + " IS LESS THEN ZERO");
        }



        System.out.println("\nВивести на екран лише парні  елементи масиву “array”: ");    //Task7
        for (i=0; i<array.length; i++){
            if (array[i]%2 == 0){
                System.out.print(array[i] + " ");
            } }

        System.out.println("\nВивести на екран лише непарні елементи масиву “array” у зворотньому порядку : ");//Task8
        for (i=0; i<array.length; i++){ int n = array.length;

            if (array[i]%2 != 0){
                System.out.print(array[i] + " ");
            } }

        System.out.println("\nВивести на екран всі елементи масиву “array”, що містять букву “а” або  не містять букву “о”"); //Task 9
        for(i = 0;i < array1.length ; i++){ String a1 = "a";  String  o1 = "o";



        }




    }

    public static int findMax(int[] array) {
        System.out.println("Вивести найбільший елемент масиву");
        int findMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > findMax) {
                findMax = array[i];
            }
        }
        return findMax;

    }                                                                                      //Task 5
    public static int findMin(int[] array) {
        System.out.println("Вивести найменший елемент масиву");
        int findMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < findMin) {
                findMin = array[i];
            }
        }
        return findMin;

    }
    public static int avg(int[] array) {
        int length  = array.length;
        int avg = (array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]); //Task 6
        avg = (avg /length );
        System.out.println("Среднее арифметическое  чисел: " + avg);

        return avg;
    }







}















