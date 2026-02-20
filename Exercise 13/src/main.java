import java.util.Scanner;

public class main {
    public static Location locateLargest(double[][] a){
    int row =-1;
    int col = -1;
    double max = Double.MIN_VALUE;
        for (int i = 0; i <a.length  ; i++) {
            for (int j = 0; j <a[i].length  ; j++) {
                if (a[i][j] > max){
                    max=a[i][j];
                    row=i;
                    col=j;
                }
            }
        }

    return new Location(col,row,max);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row and colums : ");

        int rows = in.nextInt();;
        int col = in.nextInt();
        double arr[][] = new double[rows][col];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <col ; j++) {
                arr[i][j]= in.nextDouble();
            }
        }
        Location loc = locateLargest(arr);


        System.out.println("The location of the largest element is "
                + loc.maxValue + " at ("
                + loc.Maxrow + ", " + loc.Maxcolumn + ")");
    }
}
