import java.util.Scanner;

public class SolidRectangle {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So we meet again.....");
        System.out.println("Listen.... you wanna see a magic trick? ?_>");
        System.out.println("tell me how many rows do you want..?");
        int a = sc.nextInt();
        System.out.println("and how many columns..?");
        int b = sc.nextInt();
        for(int i = 1; i<=a; i = i + 1){
            for(int j = 1; j<=b; j = j + 1){
                System.out.print("₹");
            }
            System.out.println();
        }
        System.out.println("Pretty cool right? ^_^");
    }
}
