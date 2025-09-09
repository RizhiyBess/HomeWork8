import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 + Задание 2");
        int[] simple = new int[3];
        simple[0] = 1;
        simple[1] = 2;
        simple[2] = 3;
        System.out.println(Arrays.toString(simple));

        double[] fractional = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(fractional));

        int[] arbitrary = new int[]{2, 4, 8, 16, 32, 64, 128, 256, 512};
        System.out.println(Arrays.toString(arbitrary));

        System.out.println("Задание 3");
        for (int b = simple.length - 1; b >= 0; b--) {
            System.out.print(simple[b]);
            if (b > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int c = fractional.length - 1; c >= 0; c--) {
            System.out.print(fractional[c]);
            if (c > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int d = arbitrary.length - 1; d >= 0; d--) {
            System.out.print(arbitrary[d]);
            if (d > 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задание 4");
        int[] simpleTwo = {1, 2, 3};
        for (int a = 0; a < simpleTwo.length; a++) {
            if (simpleTwo[a] % 2 != 0) {
                simpleTwo[a] += 1;
            }
            System.out.println(simpleTwo[a]);
        }
    }
}