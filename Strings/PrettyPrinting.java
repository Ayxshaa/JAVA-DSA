public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 234.567f;
       // System.out.printf("THe formatted string is : %.2f",a);
        // it round offs too!

        System.out.printf("Formatted string is : %.2f",Math.PI);

        System.out.printf("Hello im %s and im %s years old", "Ayesha", "20");
    }
}
/**
 * There are many format specifiers we can use. Here are some common ones:
 *
 * %c - Character
 * %d - Decimal number (base 10)
 * %e - Exponential floating-point number
 * %f - Floating-point number
 * %i - Integer (base 10)
 * %o - Octal number (base 8)
 * %s - String
 * %u - Unsigned decimal (integer) number
 * %x - Hexadecimal number (base 16)
 * %t - Date/time
 * %n - Newline
 *
 */
