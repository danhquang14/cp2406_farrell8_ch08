import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
    int count = 0, total = 0;
    double[] intArray = new double[20];
        System.out.println("Enter any number of double value up to 20");
        System.out.println("Enter 99999 when you want to quit");
    Scanner scanner = new Scanner(System.in);
    double so = scanner.nextDouble();
//        while (so == 99999) {
//            System.out.print("You can not quit without enter any number!! Please enter a number: ");
//            so = scanner.nextDouble();
//        }
        while (so != 99999) {
        intArray[count] = so;
        total += so;
        count++;
        if (count == 20) {
            so = 99999;
        } else {
            System.out.print("Enter next number of double value or 99999 to quit:  ");
            so = scanner.nextInt();
        }
    }
        if (so == 99999) {
        System.out.println("No number entered!!!");
    }
        if (count != 0) {
        System.out.println("The average of entered number is: " + (total / (count)));
        double average = total / (count);
        System.out.println("\nThe scores entered were: ");
        for (int x = 0; x < count; ++x) {
            double distance;
            if (intArray[x] < average) {
                distance = average - intArray[x];
            } else {
                distance = intArray[x] - average;
            }
            System.out.println(intArray[x] + " has distance to the average is: " + distance);
        }
    }
}
}
