import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        double result;
        int key;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome users");
            System.out.println("Enter two value for calculation");
            System.out.println("Enter value frist");
            double first = sc.nextDouble();
            System.out.println("Enter value second");
            double second = sc.nextDouble();

            System.out.println("Chose one operation");
            System.out.println("Enter for 1 for Sum, 2 for Substraction, 3 for Multiply , 4 for Divide");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    result = first + second;
                    System.out.println(+first + " and " + second + " Sum of number:= " + result);
                    break;


                case 2:
                    result = first - second;
                    System.out.println(+first + " and " + second + " Substract of number:= " + result);
                    break;
                case 3:
                    result = first * second;
                    System.out.println(+first+" and "+ second+" Multiply of number:= " + result);
                    break;
                case 4:
                    result = first / second;
                    System.out.println(+first+" and "+ second+" Divide of number:= " + result);
                    break;

            }
            System.out.println("Enter 0  go to back the calculator  ");
            System.out.println("Enter any value for exist");
            key = sc.nextInt();

        }
        while (key == 0) ;
        System.out.println("Exit succusful");

    }

}



