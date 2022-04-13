package Kegiatan_2;
import java.util.Scanner;

public class the_other {
    public static void main(String[] args) {
    double diagonal1;
    double diagonal2;
    double sisi;
    int ans;
    double result;

            Scanner in = new Scanner(System.in);
            Method method = new Method();
    
            System.out.println("Calculate rhomb\n\n");
            System.out.print("First Diagonal\t:");
            diagonal1 = in.nextDouble();
            System.out.print("Second Diagonal\t:");
            diagonal2 = in.nextDouble();
            System.out.print("Side\t\t:");
            sisi = in.nextDouble();
    
            System.out.print("How do you want it to be calculated?\n1. Area\n2. Perimeter\n\nAnswer it by the number:");
            ans = in.nextInt();
            
            switch(ans){
                case 1:
                    result = diagonal1*diagonal2/2;
                    System.out.println("\n\nThe area of the rhomb is: " + result);
                break;
                case 2:
                    result = sisi*4;
                    System.out.println("\n\nThe parimeter of the rhomb is: "+ result );
                break;
                default:
                    System.out.println("Please enter a valid answer!");
                break;
            }
        in.close();
    }
}
