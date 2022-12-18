//задание 1
import java.util.Arrays;
import java.util.Scanner;
public class task2_lr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введи количество элементов в массиве: ");
        int n = sc.nextInt();

        float x[] = new float[n];

        System.out.println("Введи элементы массива:");
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextFloat();
        }

        float[] newX = new float[n];
        float s = 0;

        for (int i = 0; i < n; i++) {
                s += x[i];
                newX[i] = s / (i + 1);
        }
        System.out.println("Исходный массив:" + Arrays.toString(x));
        System.out.println("Массив после обработки:" + Arrays.toString(newX));
    }
}