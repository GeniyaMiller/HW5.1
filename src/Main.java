public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        int [] ball = new int [3];
        ball [0] = 1;
        ball [1] = 2;
        ball [2] = 3;
        double [] d = {1.57, 7.654, 9.986};
        int [] arr = new int [5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;

        //Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < ball.length; i++) {
            System.out.print(ball[i]);
            if (i != ball.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
            if (i != d.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 3
        System.out.println("Задание 3");
        for (int i = ball.length-1; i >= 0; i--) {
            System.out.print(ball[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = d.length-1; i >= 0; i--) {
            System.out.print(d[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < ball.length; i++) {
            if (ball[i] % 2 != 0) {
                ball[i]++;
            }
            System.out.print(ball[i]);
            if (i != ball.length - 1) {
            System.out.print(", ");
                }
            }

    }
}