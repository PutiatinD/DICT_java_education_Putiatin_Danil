package Hangman;

import java.util.*;

class Game{
    private Scanner inp = new Scanner(System.in);
    private String letters = "qwertyuioplmkjnhbvgfcxdsza";
    private ArrayList<String> word;
    private ArrayList<String> letter;
    private ArrayList<String> warning;
    private int health = 8;

    public void createGame(){
        word = new ArrayList<>();
        letter = new ArrayList<>();
        warning = new ArrayList<>();
        Random random = new Random();
        ArrayList<String> allWords = new ArrayList<String>();
        allWords.add("java");
        allWords.add("javascript");
        allWords.add("python");
        allWords.add("kotlin");
        String sword = allWords.get(random.nextInt(3));
        for (int i = 0;i<sword.length();i++){
            this.word.add(String.valueOf((sword.charAt(i))));
        }
    }

    public void play(){
        while (true){
            int n = 0;
            for (String s : word) {
                if (letter.contains(s)) {
                    System.out.print(s);
                } else {
                    System.out.print("-");
                    n += 1;
                }
            }
            System.out.println();
            if (n==0){
                System.out.println("You survived!");
                break;
            }
            System.out.println("Input a letter:");
            String let = inp.next();
            if (let.length()>1){
                System.out.println("You should input a single letter.");
                continue;
            }
            else if(!letters.contains(let)){
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }
            System.out.println(word);
            System.out.println(let);
            if(word.contains(let) && !letter.contains(let)){
                letter.add(let);
                System.out.println("fasdaf");
            }
            else{
                if (warning.contains(let) || letter.contains(let)){
                    System.out.println("You've already guessed this letter.");
                }
                this.warning.add(let);
                this.health-=1;
                if (health==0){
                    System.out.println("You lost!");
                    System.exit(0);
                }

            }


        }

    }
}

public class hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game player = new Game();
        System.out.println("HANGMAN");
        while (true) {
            player.createGame();
            System.out.println("Type 'play' to play the game, 'exit' to quit: ");
            String sit = input.next();
            if (Objects.equals(sit, "exit")){
                break;
            }
            else if(Objects.equals(sit, "play")){
                player.play();
            }

        }
    }
}
