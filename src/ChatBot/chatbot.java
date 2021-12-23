package ChatBot;

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! My name is " + "Danya\n" +
                "I was created in " + 2020 + "\nPlease, remind me your name.");
        String name = input.next();
        System.out.println("What a great name you have, " + name + "\nLet me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int age = (input.nextInt() * 70 + input.nextInt() * 21 + input.nextInt() * 15) % 105;
        System.out.println("Your age is " + age + ";s a good time to start programming!\n Now I will prove to you that I can count to any number you want.");
        int count = input.nextInt();
        for (int i = 0;i<count+1;i++){
            System.out.println(i + " !");
        }
        System.out.println("Test!\n" +
                "How I'm feeling?\n" +
                "1.Fine\n" +
                "2.Bad\n" +
                "3.Good");
        if (input.nextInt()==1){
            System.out.println("You win");
        }
        else{
            System.out.println("You lose");
        }

    }
}
