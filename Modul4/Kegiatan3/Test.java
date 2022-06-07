package Modul4.Kegiatan3;

import java.util.Scanner;

public class Test {

    static Assassin agility = new Assassin();
    static Tank strength = new Tank();

    static Mage intellegent = new Mage();

    static int p1, p2, p1lvl, p2lvl;

    String p1name, p2name;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome!!!\n Please Choose a Character for PLayer 1!");

        //p1 Choose hero
        do {
            System.out.print("1. Tank\n2. Assassin\n3. Mage\n\nPlayer 1\t\t: ");
            p1 = in.nextInt();
            if (p1>3 || p1<1){
                System.out.println("Sorry the hero you've choosen is not available...");
            }
        }while(p1>3 || p1<1);
        System.out.print("Player 1 level\t: ");
        p1lvl = in.nextInt();
        chooseHero(p1,p1lvl);

        //p2 Choose hero
        do {
            do {
                System.out.print("\nPlayer 2 \t\t: ");
                p2 = in.nextInt();
                if (p2 > 3 || p2 < 1) {
                    System.out.println("Sorry the hero you've choosen is not available...");

                }
            } while (p2 > 3 || p2 < 1);
            if(p2==p1){
                System.out.println("The hero must be different from the player 1 !!!");
            }
        }while (p2==p1);
        System.out.print("Player 2 Level\t: ");
        p2lvl = in.nextInt();

        chooseHero(p2, p2lvl);
        assigning(p1,p2);

    }


//SOME METHOD HERE=========================================================
    public static void chooseHero(int a, int b) {
        switch (a) {
            case 1:
                strength.summonHero(b);
                break;
            case 2:
                agility.summonHero(b);
                break;
            case 3:
                intellegent.summonHero(b);
                break;
            default:
                System.out.println("Sorry the Hero is not available");
                break;
        }
    }
        public static void assigning(int c, int d){
            if (c == 1) {
                strength.checkStatus(strength.getName());
            } else if (c == 2) {
                agility.checkStatus(agility.getName());
            } else if (c == 3) {
                intellegent.checkStatus(intellegent.getName());
            }
            if (d == 1) {
                strength.checkStatus(strength.getName());
            } else if (d == 2) {
                agility.checkStatus(agility.getName());
            } else if (d == 3) {
                intellegent.checkStatus(intellegent.getName());
            } else {
                System.out.println("Sorry error has occured");
            }
        }
    }

