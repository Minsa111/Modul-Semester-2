import java.util.Scanner;

public class Mahasiswa {
    private String username;
    private String password;
    private String nim;

    //setter------------------------------------

    public void setName(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setNIM(String nim){
        this.nim = nim;
    }
    //setter------------------------------------

    public String getName(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getNIM(){
        return nim;
    }
    public void daftar(){
        int count, i=0;
        Mahasiswa name = new Mahasiswa();
        Mahasiswa pass = new Mahasiswa();
        Mahasiswa NIM  = new Mahasiswa();
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
    }
}
