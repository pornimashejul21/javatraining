// You have been asked to write a program for the Sam and Ella Delicatessen. The
// program takes
// daily orders from the Internet. It asks for the item, its price in cents, and
// if express delivery is
// wanted. The program writes out the order and the charges. Regular delivery
// for items under $10
// is $2.00; for items $10 or more delivery is free. For express delivery add
// $3.00.
// Enter the item: Tuna Salad
// Enter the price: 4.50
// Overnight delivery (0==no, 1==yes): 1
// Invoice:
// Tuna Salad 4.50
// delivery 5.00
// total 9.50

import java.util.Scanner;

class Delicatessen {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String itemName;
        int itemPrize;
        int ed = 3;
        int rd = 2;
        int t1, t2, t3, t4;
        int yn;

        System.out.println("Enter item name");
        itemName = sc.next();

        System.out.println("Enter item prize");
        itemPrize = sc.nextInt();

        System.out.println("Do you want express delivery \n for yes type 1 \n for no type 0");
        yn = sc.nextInt();

        if (ed == 1) {
            System.out.println("Your item:" + itemName);
            System.out.println("Your item prize:" + itemPrize);
            System.out.println("Express delivery charges:" + ed);
            t1 = itemPrize + ed;
            System.out.println("total:" + t1);
        }

        else if (itemPrize <= 10) {
            System.out.println("Your item:" + itemName);
            System.out.println("Your item prize:" + itemPrize);
            System.out.println("delivery charges:" + rd);
            t2 = itemPrize + rd;
            System.out.println("total:" + t2);
        } else if (itemPrize > 10) {
            System.out.println("Your item:" + itemName);
            System.out.println("Your item prize:" + itemPrize);
            System.out.println("free delivery for your order");
            t3 = itemPrize;
            System.out.println("total:" + t3);

        } else {
            System.out.println("Your item:" + itemName);
            System.out.println("Your item prize:" + itemPrize);
            System.out.println("Regular delivery charges:" + rd);
            t4 = itemPrize + ed;
            System.out.println("total:" + t4);
        }

    }
}