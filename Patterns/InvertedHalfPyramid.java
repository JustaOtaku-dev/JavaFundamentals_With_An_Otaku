import java.util.Scanner;

public class InvertedHalfPyramid {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey there! Back again...?");
        System.out.println("oh? you wanna see something else..?");
        System.out.println("Alright then. tell me the rows...");
        int a = sc.nextInt();
        for(int i = a; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("₹");
            }
            System.out.println();
        }
        System.out.println("Bankai : Inverted World");
    }
}
