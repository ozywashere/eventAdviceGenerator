import java.util.Scanner;

public class eventAdviceGenerator {
    public static void main(String[] args) {
        //Event Advice Generator
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature outside?");
        int temperature = input.nextInt();

        //if-else statement
        if (temperature > 30) {
            System.out.println("It's pleasent. Wear shorts and t-shirt.");
        } else if (temperature > 20) {
            System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
        }else if (temperature > 15) {
            System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
        }
        else {
            System.out.println("It's cold. Bring a sweater.");
        }
    }
}
