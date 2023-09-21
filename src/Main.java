/*
CS 11.02 - Quiz 2.1
Author: Katie Fu
Date: 21/09/23
 */

public class Main {

    public static void main(String[] args) {
        // 1. Store and print add result
        int resultOne = add(3,4);
        System.out.println(resultOne);

        // 2. Store and print greeting result
        String resultTwo = greeting("katie");
        System.out.println(resultTwo);

        // 3. Store and print add result
        int resultThree = add(1,2,3,4);
        System.out.println(resultThree);

        // 4. Call printMe method
        printMe(3);
    }

    // 1. add method
    public static int add(int numOne,int numTwo){
        return numOne + numTwo;
    }

    // 2. greeting method
    public static String greeting(String name){
        return "Bonjour, "+name+"!";
    }

    // 3. add method
    public static int add(int numOne,int numTwo,int numThree,int numFour){
        return add(numOne,add(numTwo,add(numThree,numFour)));
    }

    // 4. printMe method
    public static void printMe(int toBePrinted){
        System.out.println(toBePrinted);
    }
}
