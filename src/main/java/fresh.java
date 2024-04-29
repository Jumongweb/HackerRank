import java.util.Scanner;

public class fresh {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();
            int total = 0;

            System.out.print("Enter numbers: ");
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();

                while (true){
                    total += number;
                    if (total > firstNumber){
                        break;
                    }
                    System.out.print("Enter numbers: ");
                    number = scanner.nextInt();
                }

                System.out.println("Total is " + total);

            }

            System.out.print("Enter numbers: ");
            if(scanner.hasNextDouble()){
                double number = scanner.nextDouble();

                while (true){
                    total += number;
                    if (total > firstNumber){
                        break;
                    }
                    System.out.print("Enter numbers: ");
                    number = scanner.nextDouble();
                }

                System.out.println("Total is " + total);
            }
    }
}
