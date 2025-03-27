package test2;


public class test2 {
    public static void main(String[] args) {
        int sumWhile = 0;
        int i = 1;
        
        // Using while loop
        while (i <= 100) {
            if (i % 3 == 0 || i % 7 == 0) {
                sumWhile += i;
            }
            i++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        int sumDoWhile = 0;
        i = 1;
        
        // Using do-while loop
        do {
            if (i % 3 == 0 || i % 7 == 0) {
                sumDoWhile += i;
            }
            i++;
        } while (i <= 100);
        System.out.println("Sum using do-while loop: " + sumDoWhile);

        int sumFor = 0;
        
        // Using for loop
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 7 == 0) {
                sumFor += i;
            }
        }
        System.out.println("Sum using for loop: " + sumFor);
    }
}
