import java.util.Scanner;

public class HollowRectangle {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("i actually just learnt this new technique");
        System.out.println("some guy was blabbing about 'infinity'..@_@!");
        System.out.println("anyways.... how many rows?");
        int a = sc.nextInt();
        System.out.println("Great! and how many columns?");
        int b = sc.nextInt();
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=b; j++){
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("₹");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Imaginary technique : Hollow rectangle");
    }
}
