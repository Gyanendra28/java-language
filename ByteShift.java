// Left shifting a byte value.

public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b; // a = 0100 0000
        int i;

        i = a << 2; // i = 0001 0000 0000
        b = (byte) (a << 2); // b = 0000 0000

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
