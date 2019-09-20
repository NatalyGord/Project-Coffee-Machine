package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cup = 9;
        int money = 550;
        boolean start = true;
        while(start == true){
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String coffeeNum = scanner.next();
                    switch (coffeeNum) {
                        case "1":
                            // "espresso"
                            if (water / 250 < 1 || coffee / 16 < 1 || cup < 1) {
                                if (water / 250 < 1) {
                                    System.out.println("Sorry, not enough water!");
                                    System.out.println();
                                    break;
                                } else {
                                    if (coffee / 16 < 1) {
                                        System.out.println("Sorry, not enough coffee!");
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Sorry, not enough cup!");
                                        System.out.println();
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                            }
                            water -= 250;
                            coffee -= 16;
                            cup -= 1;
                            money += 4;
                            break;
                        case "2":
                            //"latte"
                            if (water / 350 < 1 || milk / 75 < 1 || coffee / 20 < 1 || cup < 1) {
                                if (water / 350 < 1) {
                                    System.out.println("Sorry, not enough water!");
                                    System.out.println();
                                    break;
                                } else {
                                    if (milk / 75 < 1) {
                                        System.out.println("Sorry, not enough milk!");
                                        System.out.println();
                                        break;
                                    } else {
                                        if(coffee / 20 < 1){
                                            System.out.println("Sorry, not enough coffee!");
                                            System.out.println();
                                            break;
                                        }
                                        else {
                                            System.out.println("Sorry, not enough cup!");
                                            System.out.println();
                                            break;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                            }
                            water -= 350;
                            milk -= 75;
                            coffee -= 20;
                            cup -= 1;
                            money += 7;
                            break;
                        case "3":
                            //"cappuccino"
                            if (water / 200 < 1 || milk / 100 < 1 || coffee / 12 < 1 || cup < 1) {
                                if (water / 200 < 1) {
                                    System.out.println("Sorry, not enough water!");
                                    System.out.println();
                                    break;
                                } else {
                                    if (milk / 100 < 1) {
                                        System.out.println("Sorry, not enough milk!");
                                        System.out.println();
                                        break;
                                    } else {
                                        if(coffee / 12 < 1){
                                            System.out.println("Sorry, not enough coffee!");
                                            System.out.println();
                                            break;
                                        }
                                        else {
                                            System.out.println("Sorry, not enough cup!");
                                            System.out.println();
                                            break;
                                        }
                                    }
                                }
                            } else {
                                System.out.println("I have enough resources, making you a coffee!");
                                System.out.println();
                            }
                            water -= 200;
                            milk -= 100;
                            coffee -= 12;
                            cup -= 1;
                            money += 6;
                            break;
                        case "back":
                            break;
                        default:
                            System.out.println("Not Found");
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int addWater = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    int addMilk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int addCoffee = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    int addCup = scanner.nextInt();
                    water += addWater;
                    milk += addMilk;
                    coffee += addCoffee;
                    cup += addCup;
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(cup + " of disposable cups");
                    System.out.println("$" + money + " of money");
                    System.out.println();
                    break;
                case "exit":
                    start = false;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
        }
    }
}
