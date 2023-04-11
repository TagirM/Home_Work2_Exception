// Задача 2. Если необходимо, исправьте данный код

public class Zadacha_2 {
    public static void main(String[] args) {
        int [] intArray = {1, 1, 3, 4, 5, 3, 4, 5, 1};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }         
         catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
         }   
    }
}
