package bks;

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        String q1 = "What color are apples?"
                    + "(a) red (b) blue";
        String q2 = "What color are pears?"
                + "(a) yellow (b) purple";
        String a1 = "a";
        String a2 = "a";

        Questions [] bags = { //arrays of Questions class
                new Questions(q1, a1),
                new Questions(q2, a2)
        };

        takeTest(bags);
    }

    public static void takeTest(Questions [] questions){
        int i = 0;
        int count = 0;
        Scanner s = new Scanner(System.in);//dont forget parameter
        while(i < questions.length){
            System.out.println(questions[i].prompt);
            System.out.println("enter the answer of question " + (i+1) + "\n");
            String input1 = s.nextLine();
            if(questions[i].answer.equals(input1)){//cant use "=="
                count++;
            }
            i++;
            input1 = "";
        }
        System.out.println("your score is: " + count);
    }
}
