import java.util.Scanner;

// Задача 4. Разработайте программу, которая выбросит Exception, когда пользователь 
// вводит пустую строку. Пользователю должно показаться сообщение, что пустые 
// строки вводить нельзя.

public class Zadacha_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        if (line.length() == 0) {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
    }
}
