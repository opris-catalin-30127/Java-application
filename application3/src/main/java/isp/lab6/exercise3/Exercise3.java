package isp.lab6.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        //some cards
        Card cards1 = new Card("1234 1234 1234 1234", "1234");
        Card cards2 = new Card("5678 5678 1234 1234", "5678");
        Card cards3 = new Card("1111 1234 1111 1234", "1111");
        Card cards4 = new Card("2222 1234 1234 2222", "2222");
        Card cards5 = new Card("3333 1234 3333 1234", "3333");
        Card cards6 = new Card("4444 4444 1234 1234", "4444");
        Card cards7 = new Card("5555 5555 5555 1234", "5555");

        //some accounts
        Account accounts1 = new Account("Mathew", 580000, cards1);
        Account accounts2 = new Account("Kevin", 3450000, cards2);
        Account accounts3 = new Account("Clark", 780000, cards3);
        Account accounts4 = new Account("Ana", 1230000, cards4);
        Account accounts5 = new Account("Mary", 890000, cards5);
        Account accounts6 = new Account("Alexander", 980000, cards6);
        Account accounts7 = new Account("Mateo", 5080000, cards7);

        //add card in list
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(cards1);
        cards.add(cards2);
        cards.add(cards3);
        cards.add(cards4);
        cards.add(cards5);
        cards.add(cards6);
        cards.add(cards7);

        //add accounts in list
        List<Account> accounts = new ArrayList<>();
        accounts.add(accounts1);
        accounts.add(accounts2);
        accounts.add(accounts3);
        accounts.add(accounts4);
        accounts.add(accounts5);
        accounts.add(accounts6);
        accounts.add(accounts7);

        //display accounts
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }

        //display the person who have an account
        System.out.println("Index: 0 Name: Mathew");
        System.out.println("Index: 1 Name: Kevin");
        System.out.println("Index: 2 Name: Clark");
        System.out.println("Index: 3 Name: Ana");
        System.out.println("Index: 4 Name: Mary");
        System.out.println("Index: 5 Name: Alexander");
        System.out.println("Index: 6 Name: Mateo");

        //program for an atm transactiom
        Scanner in = new Scanner(System.in);
        System.out.println("\nPlease enter the index of the person whose card you want to insert:");
        int NrCards = in.nextInt();

        boolean optionContinue = false;

        ATM atm = new ATM();

        System.out.println("The card was inserted! ");

        System.out.println("Insert PIN:");

        Scanner p = new Scanner((System.in));
        String pin = p.nextLine();

        if ((atm.insertCard(cards.get(NrCards), pin) == true)) {
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
