import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = {1.57, 7.654, 9.986};

        String[] s = new String[3];
        s[0] = "It ain't much ";
        s[1] = "but it's ";
        s[2] = "honest work";

    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = {1.57, 7.654, 9.986};

        String[] s = new String[3];
        s[0] = "It ain't much ";
        s[1] = "but it's ";
        s[2] = "honest work";

        for (int ti = 0; ti < i.length; ti++) {
            System.out.print(i[ti]);
            if (ti < (i.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int td = 0; td < d.length; td++) {
            System.out.print(d[td]);
            if (td < (d.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int ts = 0; ts < s.length; ts++) {
            System.out.print(s[ts]);
            if (ts < (s.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = {1.57, 7.654, 9.986};

        String[] s = new String[3];
        s[0] = "It ain't much ";
        s[1] = "but it's ";
        s[2] = "honest work!";

        for (int ti = (i.length - 1); ti >= 0; ti--) {
            System.out.print(i[ti]);
            if (ti > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int td = (d.length - 1); td >= 0; td--) {
            System.out.print(d[td]);
            if (td > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");

        for (int ts = (s.length - 1); ts >= 0; ts--) {
            System.out.print(s[ts]);
            if (ts > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] i = {1, 2, 3};
        for (int ti = 0; ti < i.length; ti++) {
            if (i[ti] % 2 != 0) {
                i[ti]++;
            }
        }
        System.out.println(Arrays.toString(i));
    }
}
