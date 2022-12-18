//задание 3
import java.util.Scanner;
import java.util.Arrays;
public class task1_lr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи количество элементов в массиве: ");
        int n = sc.nextInt();

        float x[] = new float[n];

        System.out.println("Введи элементы массива:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextFloat();
        }

        System.out.println("Исходный массив: " + Arrays.toString(x));

        float[] xnew = new float[n];
        xnew[0] = x[0];
        int k = 0;

        for (int i = 1; i < n; i++){
            if(xnew[k] < x[i]){
                k++;
                xnew[k] = x[i];
            }
        }
        System.out.println();

        System.out.print("Массив после обработки: ");

        for (int i = 0; i <= k; i++){
            System.out.print(xnew[i] + " ");
        }
    }
}