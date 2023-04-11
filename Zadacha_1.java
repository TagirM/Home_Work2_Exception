import java.util.InputMismatchException;
import java.util.Scanner;

// Задача 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
// приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Zadacha_1 {
    public static void main(String[] args) {       
        System.out.println(num());        
    }

    static double num(){
        Scanner scanner = new Scanner(System.in);
        double number;        
        try{
            number = scanner.nextDouble();
            scanner.close();
            return number;
        }
        catch(InputMismatchException ex) {            
            System.out.println("Try again: ");            
        } 
        return num();        
    }
}
