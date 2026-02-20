import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the values : \n");
        System.out.println("Enter value number 1 :");
        double value1= in.nextDouble();
        System.out.println("Enter value number 2 :");
        double value2= in.nextDouble();
        System.out.println("Enter value number 3 :");
        double value3= in.nextDouble();
        System.out.println("Enter value number 4 :");
        double value4= in.nextDouble();
        System.out.println("Enter value number 5 :");
        double value5= in.nextDouble();
        System.out.println("Enter value number 6 :");
        double value6= in.nextDouble();
        LinearEquation linearEquation = new LinearEquation(value1,value2,value3,value4,value5,value6);
        if (linearEquation.isSolveble()){
            System.out.println("value of x =" +linearEquation.getX());
            System.out.println("value of y =" +linearEquation.getY());
        }
        else {
            System.out.println("The equation has no solution.");
        }
    }
}
