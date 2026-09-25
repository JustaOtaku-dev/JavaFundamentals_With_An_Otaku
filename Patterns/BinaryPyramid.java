import java.util.Scanner;

public class BinaryPyramid {
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bruh.. 0_0! ");
        System.out.println("Leave me alone or else i will have to use my ultimate!");
        System.out.println("dont test my patience >:[");
        int a = sc.nextInt();
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                int sum = (i+j);
                if(sum%2==0){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("java special technique : Binary Domain");
    }
}
