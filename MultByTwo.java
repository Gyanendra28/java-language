// Left shifting as a quick way to multiply by 2.

public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for(i=0; i<4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}

// When a 1 bit is shifted into bit 31, the number is interpreted as negative.
