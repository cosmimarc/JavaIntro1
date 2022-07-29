package Assignment_2;



public class Main {
    public static void main(String[] args) {

        printMyName();

        System.out.println("The total sum is " + sum(77, 24));

        System.out.println("The subtraction result is " + subtraction(77, 24));

        System.out.println("The result of the multiplication is " + multiplication(9, 8));

        System.out.println("The result of division is " + division(12, 4));

        printHead();

        System.out.println("The average is " + average(10,7,9));

        System.out.println("The remainder is " + modulo(15, 6));

        System.out.println("The temperature is " + conversionFromFdegreesToCdegrees(84.5));

        System.out.println("The distance in meters is " + conversionFromInchesToMeters(250));

        //System.out.println("The speed in meters/sec is " + speed(3000,2,20,5 ));

        printSpeed(20000,0.5,20, 10);

        printCircle(60);
    }

    public static void printMyName() {
        System.out.println("Hello \nCosmina");
    }

    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;

    }

    public static int subtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;

    }

    public static int multiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static int division(int num1, int num2) {
        int result =  num1 / num2;
        return result;
    }

    public static void printHead() {
        System.out.println("\n +\"\"\"\"\"+\n\r[| o o |]\n |  ^  |\n | '_' |\n +-----+");
    }

    public static int average(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        return average;
    }

    public static int modulo(int num1, int num2) {
        int modulo = num1 % num2;
        return modulo;
    }

    public static double conversionFromFdegreesToCdegrees(double fDegrees) {
        double cDegrees = (double)5/9 * (fDegrees - 32);
        return cDegrees;
    }

    public static double conversionFromInchesToMeters(double inches) {
        double meters = inches / 39.37;
        return meters;
    }

    public static void printSpeed(double meters, double hours, double min, double sec) {
        double time = hours * 3600 + min * 60 + sec;
        double speed = meters / time;
        System.out.println("The speed in m/s is " + speed);
        System.out.println("The speed in km/h is " + speed*3.6);
        System.out.println("The speed in miles/h is " + speed*(3600/1609));
    }
    public static void printCircle(double radius){
        double pi = 3.141592653589;
        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;
        System.out.println("The circle perimeter is " + perimeter);
        System.out.println("The circle area is " + area);
    }
}


