import java.util.*;
public class ifElse{
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("hey stranger..... you look a little on the young side");
        System.out.println("mind if i know your age? ;]");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("phew.... had me worried for a second <:)");
        }
        else{
            System.out.println("oh? its ok... we can still be friends <;]");
        }
    }
}