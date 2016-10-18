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

        {
            int i, b;
            for (i = 1; i <= 40; i++) {
                b = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) b++;
                }
                if (b <= 2)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
        /*int count = 11;
        int smh = 0;
        for (int i = 0; i < count; i++) {
            if (i < count / 2) {
                smh = count / 2 + i;
            } else {
                smh = i - count / 2;
            }
            for (int k = 0; k < count; k++) {
                if (k == smh || k == count - smh - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <=i; j++) {
            if (j<7){
                System.out.print("*");
            }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i>=0; i--) {
            for (int j = 5; j >=0; j--) {
            if (j<=i){
                System.out.print("+");
            }else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i>=0; i--) {
            for (int j = 5; j >=0; j--) {
            if (j<=5-i){
                System.out.print("+");
            }else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}



