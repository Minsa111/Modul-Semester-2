import java.util.Scanner;


class Main {

    
    public static void main(String[] args) {
        Mahasiswa Mahasiswa = new Mahasiswa();
        Mahasiswa.daftar();
       

        System.out.println("\nCongrats "+ Mahasiswa.getName() + " You succesfully registered");
        System.out.println("\nThis is your Username and Password:");
        System.out.println("Username: "+ Mahasiswa.getNIM());
        System.out.println("Password: "+ Mahasiswa.getPassword());
    }
}
