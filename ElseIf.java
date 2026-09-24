import java.util.*;
public class ElseIf{
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("They are both equal... 0_0!");
        }
        else if(a>=b){
            System.out.println("Damn... a kinda strong.. ?_?");
        }
        else{
            System.out.println("huh?... b wasn't supposed to win... *_*!");
        }
    }
}