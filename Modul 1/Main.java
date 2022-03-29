import java.util.Scanner;


class Main {

    
    public static void main(String[] args) {
    String username;
    String password;
    String nim;
    int count, i=0;
        Method name = new Method();
        Method pass = new Method();
        Method NIM  = new Method();
        System.out.println("---Register---");
        Scanner in=new Scanner(System.in);        
        System.out.println("Name:");
        username = in.nextLine();
        name.setName(username);

        while (i==0){
            System.out.println("NIM     :");
            nim = in.nextLine();
            count=nim.length();
            if (count == 15){
                NIM.setNIM(nim);
                break;
            }else{
                System.out.println("NIM has to be 15 numbers");
            }
        }
        i=0;
        while (i==0){
            System.out.println("password:");
            password = in.nextLine();
            count=password.length();
            if(count >=8){
                pass.setPassword(password);
                break;
            }
            else
            {System.out.println("Password has to be at least 8 characters");
            }
        }
        in.close();

        System.out.println("\nCongrats "+ name.getName() + " You succesfully registered");
        System.out.println("\nThis is your Username and Password:");
        System.out.println("Username: "+ NIM.getNIM());
        System.out.println("Password: "+ pass.getPassword());
    }
}
