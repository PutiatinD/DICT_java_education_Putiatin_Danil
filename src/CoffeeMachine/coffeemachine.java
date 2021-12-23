package CoffeeMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class Coffee{
    private Scanner inp = new Scanner(System.in);
    public int water = 400;
    public int milk = 540;
    public int beans = 120;
    public int cups = 9;
    public int money = 550;

    public void remaining(){
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");
    }

    public void take(){
        System.out.println("I gave you " + money);
        this.money = 0;
    }

    public void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        this.water += inp.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += inp.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.beans += inp.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += inp.nextInt();
    }

    public void low_ngr(int twater,int tmilk,int tbeans,int tmoney){
        if(twater>this.water || tmilk>this.milk || tbeans>this.beans || this.cups==0){
            System.out.println("I have enough resources, making you a coffee!");
        }
        else {
            this.money+=tmoney;
            this.beans-=tbeans;
            this.water-=twater;
            this.milk-=tmilk;
            this.cups-=1;
        }

    }

    public void buy(){
        ArrayList<String> low = new ArrayList<>();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back – to\n" +
                "main menu:");
        String type = inp.next();
        switch (type){
            case "1" -> {
                low_ngr(250,0,16,4);
            }
            case "2" -> {
                low_ngr(350,75,20,7);
            }
            case "3" -> {
                low_ngr(200,100,12,6);
            }
        }

    }

}

public class coffeemachine {
    public static void main(String[] args) {
        Coffee anything = new Coffee();
        Scanner input = new Scanner(System.in);
        String situation = "";
        while (!situation.equals("exit")){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            situation = input.next();
            switch (situation){
                case "remaining" -> {
                    anything.remaining();
                }
                case "buy" -> {
                    anything.buy();

                }
                case "fill" -> {
                    anything.fill();
                }
                case "take" -> {
                    anything.take();
                }

            }
        }
    }
}
