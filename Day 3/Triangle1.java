
//write a program to input angles of triangle and check if the triangle is valid or not.
import java.util.*;

class Triangle {
    public static void main(String args[]) {
        int a1, a2, a3, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angles of triangle");
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
        total = a1 + a2 + a3;
        if (a1 + a2 + a3 == 180) {
            System.out.println("Traingle is valid ");
        }

        else {
            System.out.println("Traingle is Not valid ");
        }

    }

}