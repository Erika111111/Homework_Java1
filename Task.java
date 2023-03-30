// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

import java.util.Scanner;
public class Task {
    public static void main(String[] args){
    int[] arr = new int[1000];
    for (int i = 0; i < arr.length; i++){
        arr[i] = i*i*i;
}
    Scanner iScanner = new Scanner(System.in);
System.out.printf("Первое число: ");
int a = iScanner.nextInt();
System.out.printf("Второе число: ");
int b = iScanner.nextInt();

System.out.println(arr[a]);
System.out.println(arr[b]);


}

}

 

