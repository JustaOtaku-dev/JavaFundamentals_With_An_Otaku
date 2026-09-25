import java.util.Scanner;

public class RightAngledPyramid {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hehehe... Still not satisfied? Hmph!");
        System.out.println("This will definitely impress you!");
        System.out.println("As usual tell me the rows first...");
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("₹");
            }
            System.out.println();
        }
    }
}
