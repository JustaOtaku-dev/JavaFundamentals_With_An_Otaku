import java.util.*;
public class Problem1 { //Making a Basic Calculator
    static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Worlds First ever Java based calculator!!!!!");
        System.out.println("to start things off.... enter your numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Now please select your desired operation....");
        System.out.println("Press 1 for add");
        System.out.println("Press 2 for sub");
        System.out.println("Press 3 for mult ");
        System.out.println("Press 4 for div");
        System.out.println("Press 5 for mod");
        System.out.println("Dont be scared... <:]");
        int x = sc.nextInt();
        float sum = (a+b);
        float sub = (a-b);
        float mult = (a*b);
        float div = (a/b);
        float mod = (a%b);
        switch(x){
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(mult);
                break;
            case 4:
                System.out.println(div);
                break;
            case 5:
                System.out.println(mod);
                break;
            default:
                System.out.println("Wow... how do you mess something this simple? :|");
        }
    }
}
