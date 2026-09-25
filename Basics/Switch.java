import java.util.*;
public class Switch{
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Greetings cutie <3");
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("Hello :)");
                break;
            case 2:
                System.out.println("Radhe radhe ^_^");
                break;
            case 3:
                System.out.println("Ni Hao -_-");
                break;
            default:
                System.out.println("Whats Wrong? Can't speak???? 0_0!");
        }
    }
}