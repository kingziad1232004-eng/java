
import java.util.Scanner;

public class remember4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please choose");
        System.out.println("-----------------------------------------------");
        System.out.println("1-sum");
        System.out.println("2-sub");
        System.out.println("3-mul");
        System.out.println("4-div");
        System.out.println("5-square");
        System.out.println("6-cube");
        System.out.println("7-end");
        System.out.println("-----------------------------------------------");
        int n1 = s.nextInt();
        switch (n1) {
            case 1:
                System.out.println("choose two numbers ");
                double s1 = remember3.readnumber();
                double s2 = remember3.readnumber();
                double sum = s1 + s2;
                System.out.println("the sum is:" + sum);
                break;
            case 2:
                System.out.println("choose two numbers ");
                double s3 = remember3.readnumber();
                double s4 = remember3.readnumber();

                double sub = s3 - s4;
                System.out.println("the sub is:" + sub);
                break;
            case 3:
                System.out.println("choose two numbers ");
                double s5 = remember3.readnumber();
                double s6 = remember3.readnumber();

                double mul = s5 * s6;
                System.out.println("the mul is :" + mul);
                break;
            case 4:
                System.out.println("choose two numbers ");
                double s7 = remember3.readnumber();
                double s8 = remember3.readnumber();

                double div = s7 / s8;
                System.out.println("the div is :" + div);
                break;
            case 5:
                System.out.println("choose a number ");
                double s9 = remember3.readnumber();

                double squ = s9 * s9;
                System.out.println("the square is :" + squ);
                break;
            case 6:
                System.out.println("choose a number ");
                double s10 = remember3.readnumber();

                double cube = s10 * s10 * s10;
                System.out.println("the cube is :" + cube);
                break;
            case 7:
                System.out.println("bye");
            default:
                System.out.println("error");
        }

    }
}
