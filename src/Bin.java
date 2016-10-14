public class Bin {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            if (i < 10) {
                System.out.printf("dec: " + i + "  => " + "hex: " + "%x \n", i);
            } else
                System.out.printf("dec: " + i + " => " + "hex: " + "%x \n", i);
        }

        for (int i = 0; i <= 40; i++) {
            String a, b, c;
            if (i < 10) {
                a = "dec: " + i + "  => ";
                b = "bin: " + Integer.toString(i, 2) + " => ";
                c = "hex: " + Integer.toString(i, 16);
                System.out.println(a + b + c);
            } else {
                a = "dec: " + i + " => ";
                b = "bin: " + Integer.toString(i, 2) + " => ";
                c = "hex: " + Integer.toString(i, 16);
                System.out.println(a + b + c);
            }
        }
    }
}
