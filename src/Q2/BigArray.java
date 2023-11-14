package Q2;

import java.sql.SQLOutput;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int) (Math.random() * (91 - 20) + 20);
        }
        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();

        for (int temp: array) {
            System.out.print(temp + " ");
        }
        System.out.println();

        System.out.println("The middle number is " + array[array.length / 2]);

        double ave = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.println("Average of the first, middle, and last numbers is " + (ave/3));


        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;

        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);


        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest)
                array[lcv] = largest;
            else if (array[lcv] == largest)
                array[lcv] = smallest;
        }

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();

        int randNum = (int)(Math.random() * 10 + 1);
        array[array.length / 2] = randNum;


        for (int x : array)
            System.out.print(x + " ");
        System.out.println();




        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] += 10;

        }

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();


        int mythird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + mythird);


        for (int num : array) {
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        }
        System.out.println();


        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] % 4 == 0) {
                System.out.print(array[lcv] + " ");
            }
        }
        System.out.println();



        boolean sixty = false;
        for (int temp : array) {
            if (temp == 60) sixty = true;
        }
        System.out.println("is 60 in the list? " + sixty);



        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv ++) {
            if (array[lcv] != array[array.length - 1 - lcv]) {
                same = false;
            }
        }
        System.out.println("is the array palidromic? " + same);


        double avg = 0;
        for (int x : array)
            avg += x;
        avg /= array.length;



        int count = 0;
        for (int x : array)
            if (x > avg) count++;
        System.out.printf("There are %d numbers greater than the average\n", count);


        int evens = 0;
        for (int num : array)
            if(num % 2 == 0) evens++;
        System.out.printf("There are %d even numbers\n", evens);


        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array2[lcv] = array[array.length - 1 - lcv];

        }
        for (int n : array)
            System.out.print(n + " ");
        System.out.println();

        int[] shiftarr = circularShiftRight(array);
        for (int n : shiftarr)
            System.out.print(n + " ");
        System.out.println();



        int sum = 0;
        for(int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements = " + sum);





    }

    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv-1];
        shifted[0] = temp;
        return shifted;
    }
}
/*
38 49 40 29 84 31 20 32 69 66 31 57 79 40 39 75 73 44 65
38 49 40 29 84 31 20 32 69 66 31 57 79 40 39 75 73 44 65
The middle number is 66
Average of the first, middle, and last numbers is 56.333333333333336
The smallest number is 20
The largest number is 84
38 49 40 29 20 31 84 32 69 66 31 57 79 40 39 75 73 44 65
38 49 40 29 20 31 84 32 69 1 31 57 79 40 39 75 73 44 65
48 59 50 39 30 41 94 42 79 11 41 67 89 50 49 85 83 54 75
The number that was ousted is 50
59 50 54
48
is 60 in the list? false
is the array palidromic? false
There are 8 numbers greater than the average
There are 6 even numbers
48 59 5 39 30 41 94 42 79 11 41 67 89 50 49 85 83 54 75
75 48 59 5 39 30 41 94 42 79 11 41 67 89 50 49 85 83 54
Sum of all digits of all elements = 186

Process finished with exit code 0

 */
