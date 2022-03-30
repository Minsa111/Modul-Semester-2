

class Main {

    
    public static void main(String[] args) {
        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.daftar();
       

        System.out.println("\nCongrats "+ Mahasiswa1.getName() + " You succesfully registered");
        System.out.println("\nThis is your Username and Password:");
        System.out.println("Username: "+ Mahasiswa1.getNIM());
        System.out.println("Password: "+ Mahasiswa1.getPassword());
    }
}
