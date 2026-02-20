import java.util.Scanner;

public class TestIntersectingPoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double x4 = in.nextDouble();
        double y4 = in.nextDouble();

        double a = y1 - y2;
        double b = x2 - x1;
        double c = y3 - y4;
        double d = x4 - x3;
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if (linearEquation.isSolveble()){
            System.out.println("The intersecting point is at ("
                    + linearEquation.getX() + ", "
                    + linearEquation.getY() + ")");
        }
        else {
            System.out.println("The two lines are parallel.");
        }

    }
}
