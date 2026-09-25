import java.util.Scanner;

public class HalfPyramid {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey! Back again?");
        System.out.println("how many rows....?");
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++){
            for(int j=1; j <= i; j++){
                System.out.print("₹");
            }
            System.out.println();
        }
    }
}
