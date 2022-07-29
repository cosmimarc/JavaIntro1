package main;

public class Main {
    public static void main(String[] args){
        //ex.1
        System.out.println("Hello" + "\nCosmina");

        //ex.2
        int x = 77;
        int y = 24;
        int sum = x+y;
        System.out.println("The total sum is " + sum);

        //ex.3
        //int divide = x/y;
        //System.out.println(divide);
        int a = 32;
        int b = 7;
        double r;
        r = (double) a/b;
        System.out.println("The answer is " + r);

        //ex.4
        //a. -5 + 8 * 6
        int i = -5;
        int n = 8;
        int m = 6;
        int result = i + n * m;
        System.out.println("The result is " + result);

        // b. (55+9) % 9
        int o = 55; int p = 9;
        int result1 = (o + p) % p;
        System.out.println("The result is " + result1);

        // c. 20 + -3*5 / 8
        int g = 20; int h = -3; int j = 5; int k = 8;
        int result2 = g + h  * j / k;
        System.out.println("The result is " + result2);

        //d. 5 + 15 / 3 * 2 - 8 % 3
        int result3 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("The result is " + result3);
    }


}


