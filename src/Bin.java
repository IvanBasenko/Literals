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
        for (int i = 0; i <= 40; i++) {
            if (i % 2 == 0) {
                System.out.println("Четное: " + i);
            } else
                System.out.println("Не четное: " + i);
        }

        int i, b;
        for (i = 1; i <= 40; i++) {
            b = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) b++;
            }
            if (b <= 2)
                System.out.println(i);
        }
    }
}


