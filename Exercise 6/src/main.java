import java.util.Arrays;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        Random random = new Random();
        int arr [ ]= new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }
        StopWach stopWach = new StopWach();
        stopWach.start();;
        Arrays.sort(arr);
        stopWach.stop();
        System.out.println(stopWach.getElapsedTime() +"ms");
        /// ////second way////////////
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length-i;
        }
        stopWach.start();;
        Arrays.sort(arr);
        stopWach.stop();
        System.out.println(stopWach.getElapsedTime() +"ms");
    }
}
