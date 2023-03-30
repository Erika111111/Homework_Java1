// Вводится число n, затем n чисел целых, по одному на каждой строке. 
// Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите количество элементов массива: ");
    int a = iScanner.nextInt();
    int[] arr = new int[a];
    for (int i = 0; i < arr.length; i++){
        arr[i] = iScanner.nextInt();
        }
    System.out.println("Введите число, на которое надо умножить: ");
        int b = iScanner.nextInt();

    for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * b;
    }
    for (int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
    
        }
        
    }
}
    
