package model;

public class CodingPractice {
    public static void printHelloWorld(int[] arrNums) {
        for (int num : arrNums) {
            System.out.print("Num: " + num + " -> ");

            if((num % 5 == 0) && (num % 7 == 0))
                System.out.println("HelloWorld");
            else if(num % 5 == 0)
                System.out.println("Hello");
            else if(num % 7 == 0)
                System.out.println("World");
        }
    }

    public static int findSecondBiggest(int[] arrNums) {
        int biggest = Integer.MIN_VALUE;
        int secondBiggest = Integer.MIN_VALUE;

        for (int num : arrNums) {
            if (num > biggest) {
                secondBiggest = biggest;
                biggest = num;
            } else if (num > secondBiggest && num != biggest) {
                secondBiggest = num;
            }
        }

        return secondBiggest;
    }
}
