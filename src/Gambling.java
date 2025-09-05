import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
        System.out.println("Reminder: you should not gamble unless you are old enough");
        System.out.println("Welcome to a game that makes you get addicted to gambling!!!");
        int the_choose_variable = 1;
        double ur_bank_money_cus_ur_poor = 0.0;
        while (the_choose_variable != 3) {
            System.out.println("Your money in the bank is "+ur_bank_money_cus_ur_poor+" because your so poor");
            System.out.println("Please enter your choice:");
            System.out.println("(1) Deposit some money in the bank cus you gambled all ur money away");
            System.out.println("(2) Lets go gambling!!!");
            System.out.println("(3) Quit cus ur a loser");
            Scanner scanner_again = new Scanner(System.in);
            the_choose_variable = scanner_again.nextInt();
            if (the_choose_variable == 1) {
                System.out.println("How much money do you want to deposit?");
                ur_bank_money_cus_ur_poor +=  scanner_again.nextDouble();
            }
            else if (the_choose_variable == 2) {
                System.out.println("How much money do you want bet you addict?");
                double the_money_you_will_probably_lose = scanner_again.nextDouble();
                while (true){
                    if(ur_bank_money_cus_ur_poor < the_money_you_will_probably_lose){
                        System.out.println("Too much money you genius who doesn't know any math");
                        System.out.println("Bet a price that's lower than "+ur_bank_money_cus_ur_poor);
                    }else {
                        ur_bank_money_cus_ur_poor -= the_money_you_will_probably_lose;
                        break;
                    }
                }
                System.out.println("What is your guess on the dice roll?");
                int banana_player_dice = scanner_again.nextInt();
                System.out.println("What is your guess on the coin flip, Heads (H) or Tails (T)?");
                String banana_player_coin = scanner_again.next();
                System.out.println("What is your guess on the spinner, red (r), green (g), blue (b), or yellow (y)?");
                String banana_player_color = scanner_again.next();
                int apple_com_dice = (int) (Math.random() * 7);
                System.out.println("You rolled a "+apple_com_dice);
                int pre_apple_com_coin = (int) (Math.random() * 3);
                int pre_apple_com_color = (int) (Math.random() * 5);
                String apple_com_color = "";
                String apple_com_coin = "";
                if (pre_apple_com_color == 0){
                    apple_com_color = "r";
                    System.out.println("You spun red");
                }else if (pre_apple_com_color == 1){
                    apple_com_color = "g";
                    System.out.println("You spun green");
                }else if  (pre_apple_com_color == 2){
                    apple_com_color = "b";
                    System.out.println("You spun blue");
                }else{
                    apple_com_color = "y";
                    System.out.println("You spun yellow");
                }
                if (pre_apple_com_coin == 0){
                    apple_com_coin = "H";
                    System.out.println("You flipped heads");
                }else{
                    apple_com_coin = "T";
                    System.out.println("You flipped tails");
                }
                int righty_times_you_lucky_guy = 0;
                if(banana_player_color.equals(apple_com_color)){
                    righty_times_you_lucky_guy++;
                    System.out.println("You the color right kinda lucky");
                }
                if(banana_player_coin.equals(apple_com_coin)){
                    righty_times_you_lucky_guy++;
                    System.out.println("You got coin right cus its soooooooo ez");
                }
                if (banana_player_dice == apple_com_dice){
                    righty_times_you_lucky_guy++;
                    System.out.println("You got dice right you should go gambling");
                }
                if(righty_times_you_lucky_guy == 3){
                    System.out.println("NAH WAY YOU CHEATED!!!!!!");
                    ur_bank_money_cus_ur_poor += the_money_you_will_probably_lose * 3;
                }else if(righty_times_you_lucky_guy == 2){
                    System.out.println("Lucks on ur side today.... but not tomorrow");
                    ur_bank_money_cus_ur_poor += the_money_you_will_probably_lose * 2;
                }else if(righty_times_you_lucky_guy == 1){
                    if(banana_player_coin.equals(apple_com_coin)) {
                        ur_bank_money_cus_ur_poor += the_money_you_will_probably_lose * 0.25;
                    }
                    if(banana_player_color.equals(apple_com_color)){
                        ur_bank_money_cus_ur_poor += the_money_you_will_probably_lose * 0.5;
                    }
                    if(banana_player_dice == apple_com_dice){
                        ur_bank_money_cus_ur_poor += the_money_you_will_probably_lose;
                    }
                }else{
                    System.out.println("HAHAHAHAHA you have nothing right HAHAHA");
                }
            }
        }
        System.out.println("Thanks 4 playing");
    }
}