
/**
 * Write a description of class nestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nestedif
{
    public static void main(String args[]) {
    
        System.out.println("\n Divided by 3: ");
        for (int i = 1; i < 60; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }

        // Print numbers divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 60; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }

        // Print numbers divided by both 3 and 5
        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
