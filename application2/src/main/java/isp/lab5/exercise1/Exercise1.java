package isp.lab5.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Card[] cards = new Card[7];
        cards[0] = new Card("1234 1234 1234 1234", "1234");
        cards[1] = new Card("5678 5678 1234 1234", "5678");
        cards[2] = new Card("1111 1234 1111 1234", "1111");
        cards[3] = new Card("2222 1234 1234 2222", "2222");
        cards[4] = new Card("3333 1234 3333 1234", "3333");
        cards[5] = new Card("4444 4444 1234 1234", "4444");
        cards[6] = new Card("5555 5555 5555 1234", "5555");

        Account[] accounts = new Account[7];
        accounts[0] = new Account("Mathew", 580000, cards[0]);
        accounts[1] = new Account("Kevin", 3450000, cards[1]);
        accounts[2] = new Account("Clark", 780000, cards[2]);
        accounts[3] = new Account("Ana", 1230000, cards[3]);
        accounts[4] = new Account("Mary", 890000, cards[4]);
        accounts[5] = new Account("Alexander", 980000, cards[5]);
        accounts[6] = new Account("Mateo", 5080000, cards[6]);

        Bank bank = new Bank(accounts);
        System.out.println(Arrays.toString(bank.getAccounts()));


        System.out.println("Index: 0 Name: Mathew");
        System.out.println("Index: 1 Name: Kevin");
        System.out.println("Index: 2 Name: Clark");
        System.out.println("Index: 3 Name: Ana");
        System.out.println("Index: 4 Name: Mary");
        System.out.println("Index: 5 Name: Alexander");
        System.out.println("Index: 6 Name: Mateo");

        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease enter the index of the person whose card you want to insert:");
        int NrCards = in.nextInt();

        boolean optionContinue = false;

        ATM atm = new ATM();

        System.out.println("The card was inserted! ");

        System.out.println("Insert PIN:");

        Scanner p = new Scanner((System.in));
        String pin = p.nextLine();

        if ((atm.insertCard(cards[NrCards], pin) == true)) {
            System.out.println("PIN ok");
            optionContinue = true;
        } else {
            System.out.println("Pin incorect");
        }


        while (optionContinue) {
            System.out.println(ATM.userMenu() + " \nYour option is: \n");
            Scanner o = new Scanner(System.in);
            int option = o.nextInt();
            switch (option) {
                case 1: {

                    System.out.println();
                    break;
                }
                case 2: {

                    System.out.println();
                    break;
                }
                case 3: {

                    System.out.println();
                    break;
                }

                case 4: {

                    System.out.println();
                    break;
                }
            }
        }
    }
}
