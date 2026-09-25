import java.util.*;
public class FloydsPyramid{
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("So....? you really have nothing else to do?");
        System.out.println("thats just sad... :[");
        System.out.println("oh well.... tell me the rows");
        int a = sc.nextInt();
        int number = 1;
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}