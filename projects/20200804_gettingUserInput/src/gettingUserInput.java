import java.util.Scanner;

public class gettingUserInput {
    public static void main(String [] args){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("enter your name");
        String name = keyboardInput.nextLine();//wait users to enter a line of text
        System.out.println(name);
    }
}
