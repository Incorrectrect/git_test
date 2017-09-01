import javafx.fxml.FXMLLoader;

/**
 * Created by Администратор on 28.08.2017.
 */
public class arrMinMax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 10) - 5);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int maxElement = arr[0];
        int minElement = arr[0];
        int valueMax = 0;
        int valueMin = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < minElement){
                minElement = arr[i];
                valueMin = i;
            }
            if (arr[i] > maxElement){
                maxElement = arr[i];
                valueMax = i;
            }
        }
        System.out.println("\nMin index is " + valueMin + "\nMax index is " + valueMax);

        for (int i = 0; i < arr.length; i++) {
            if (i == valueMin) {
                arr[i] = maxElement;
            }
            else if (i == valueMax){
                arr[i] = minElement;
            }
        }
        System.out.println("Min value is " + minElement);
        System.out.println("Max value is " + maxElement);

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("Second commit");
        System.out.println("third commit");
        System.out.println("Hello Git hub!!!");

    }
}
