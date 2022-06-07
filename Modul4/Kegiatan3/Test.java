package Modul4.Kegiatan3;

import java.util.Scanner;

public class Test {

    static Assassin agility = new Assassin();

    static Tank strength = new Tank();

    static Mage intellegent = new Mage();

    static int p1, p2, p1lvl, p2lvl, round=1;

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
        battle(p1,p2);


        if (strength.isLifeStatus() ){
            System.out.println("\n\nCongrats the Tanker won the match!!!");
        }else if (agility.isLifeStatus()){
            System.out.println("\n\nCongrats the Asssassin won the match!!!");
        } else if (intellegent.isLifeStatus()) {
            System.out.println("\n\nCongrats the Mage won the match!!!");
        }else{System.out.println("bruh idk");}
    }


//SOME METHOD HERE=========================================================
    public static void chooseHero(int a, int b) {
        switch (a) {
            case 1 -> {
                strength.spawnIntro(b);
                strength.setLifeStatus(true);
            }
            case 2 -> {
                agility.spawnIntro(b);
                agility.setLifeStatus(true);
            }
            case 3 -> {
                intellegent.spawnIntro(b);
                intellegent.setLifeStatus(true);
            }
            default -> System.out.println("Sorry the Hero is not available");
        }
    }
        public static void assigning(int c, int d){
            if (c == 1) {
                strength.checkStatus(strength.getName());

            } else if (c == 2) {
                agility.checkStatus(agility.getName());

            } else if (c == 3) {
                intellegent.checkStatus(intellegent.getName());

            } else {
                System.out.println("Sorry error has occured");
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
        public static void battle(int p1, int p2){
            if (p1==1&&p2==2 || p1==2&&p2==1){
                do{
                    System.out.printf("\n\n=============== Round %d ===============", round);
                    round++;
                    if (agility.isLifeStatus()){

                        agility.attack(agility.getName(), strength.getName(),
                                agility.getAttackDamage(), strength.getHealthPoint(), strength.getDefense());
                        strength.setHealthPoint(agility.getDamageDealt());
                    }
                    if (strength.getHealthPoint()<=0){
                        strength.setLifeStatus(false);
                    }
                    if(strength.isLifeStatus()){
                        strength.attack(strength.getName(), agility.getName(),
                                strength.getAttackDamage(), agility.getHealthPoint(),
                                agility.getDefense());
                        agility.setHealthPoint(strength.getDamageDealt());
                    }

                    if (agility.getHealthPoint()<=0){
                        agility.setLifeStatus(false);
                    }

                }while(agility.isLifeStatus()&& strength.isLifeStatus());

            }else if(p1==1&&p2==3 || p1==3&&p2==1){
                do{
                    System.out.printf("\n\n=============== Round %d ===============", round);
                    round++;
                    if (intellegent.isLifeStatus()){

                        intellegent.attack(intellegent.getName(), strength.getName(),
                                intellegent.getAttackDamage(), strength.getHealthPoint(), strength.getDefense());
                        strength.setHealthPoint(intellegent.getDamageDealt());
                    }
                    if (strength.getHealthPoint()<=0){
                        strength.setLifeStatus(false);
                    }

                    if(strength.isLifeStatus()){
                        strength.attack(strength.getName(), intellegent.getName(),
                                strength.getAttackDamage(), intellegent.getHealthPoint(),
                                intellegent.getDefense());
                        intellegent.setHealthPoint(strength.getDamageDealt());
                    }

                    if (intellegent.getHealthPoint()<=0){
                        intellegent.setLifeStatus(false);
                    }

                }while(intellegent.isLifeStatus()&& strength.isLifeStatus());
            }
            else if(p1==2&&p2==3 || p1==3&&p2==2){
                do{
                    System.out.printf("\n\n=============== Round %d ===============", round);
                    round++;
                    if (intellegent.isLifeStatus()){

                        intellegent.attack(intellegent.getName(), agility.getName(),
                                intellegent.getAttackDamage(), agility.getHealthPoint(), agility.getDefense());
                        agility.setHealthPoint(intellegent.getDamageDealt());
                    }
                    if (agility.getHealthPoint()<=0){
                        agility.setLifeStatus(false);
                    }

                    if(agility.isLifeStatus()){
                        agility.attack(agility.getName(), intellegent.getName(),
                                agility.getAttackDamage(), intellegent.getHealthPoint(),
                                intellegent.getDefense());
                        intellegent.setHealthPoint(agility.getDamageDealt());
                    }

                    if (intellegent.getHealthPoint()<=0){
                        intellegent.setLifeStatus(false);
                    }

                }while(intellegent.isLifeStatus()&& agility.isLifeStatus());
            }else{System.out.println("bruh I dont even know");}
        }
    }

