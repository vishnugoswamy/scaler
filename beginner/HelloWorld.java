import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hi i am studying");
        // System.out.println("i like to code ");
        // //int x=1000900000;
        // long y=1000000000000000000L;
        // //x = (int) y;
    
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        String name =  scn.next();
        System.out.println("Hello "+name+" you are "+age+" years old");
    }
}