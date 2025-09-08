//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 + Задание 2");
        int[] simple = new int[3];
        simple[0] = 1;
        simple[1] = 2;
        simple[2] = 3;
        System.out.println(simple[0] + ", " + simple[1] + ", " + simple[2]);

        double[] fractional = {1.57, 7.654, 9.986};
        System.out.println(fractional[0] + ", " + fractional[1] + ", " + fractional[2]);

        int[] arbitrary = new int[]{64, 128, 256, 512};
        System.out.println(arbitrary[0] + ", " + arbitrary[1] + ", " + arbitrary[2] + ", " + arbitrary[3]);

        System.out.println("Задание 3");
        System.out.println(simple[2] + ", " + simple[1] + ", " + simple[0]);
        System.out.println(fractional[2] + ", " + fractional[1] + ", " + fractional[0]);
        System.out.println(arbitrary[3] + ", " + arbitrary[2] + ", " + arbitrary[1] + ", " + arbitrary[0]);

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