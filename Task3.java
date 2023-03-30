// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
import java.util.Scanner;
public class Task3 {
public static void main(String[] args) throws java.io.IOException{
    
double sum = 0;
    
    Scanner iScanner = new Scanner(System.in);
    System.out.println("введите первое число: ");
    double num1 = iScanner.nextDouble();
    System.out.println("введите второе число: ");
    double num2 = iScanner.nextDouble();
    System.out.println(" введите желаемую операцию('+','-','*','/'): ");
    char c = (char) System.in.read (); 
    switch (c) {
        case '+': sum = num1 + num2;
            break;
        case '-': sum = num1 - num2;
            break;
        case '*': sum = num1 * num2;
            break;
        case '/': sum = num1 / num2;
            break;
    
        default:
        System.out.println("Произошла ошибка. Повторите ввод");
            break;   
                
    }
      System.out.println(sum);   
}

}