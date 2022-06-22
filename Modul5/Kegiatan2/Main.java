package Modul5.Kegiatan2;

import java.io.*;
import java.util.*;
import java.lang.String;

public class Main {
    static dinasPertahanan data = new dinasPertahanan();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception {menu();}
    public static void menu()throws Exception{
        System.out.println("1. Input data\n2. Show Data\n3. Exit");
        int menu = in.nextInt();

        switch (menu){
            case 1: input();menu();
            case 2: show();menu();
            case 3: System.exit(0);
        }
    }
    public static void input()throws Exception{
        FileWriter fileWriter = new FileWriter("data.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        Scanner stringinput = new Scanner(System.in);
        System.out.print("Alamat\t\t\t: "); data.setAlamat(stringinput.nextLine());
        System.out.print("Panjang tanah\t: "); data.setPanjangTanah(in.nextInt());
        System.out.print("Luas tanah\t\t: ");data.setLuasTanah(in.nextInt());

        String write = String.format("%s,%s,%s\n", data.getAlamat(),data.getPanjangTanah(),data.getLuasTanah());
        bufferedWriter.write(write);
        bufferedWriter.close();
    }
    public static void show(){
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String a = bufferedReader.readLine();

            int count = 0;
            System.out.printf("%-7s %-25s %-15s %-15s\n", "No", "Alamat", "Panjang Tanah", "Luas Tanah");
            while(a != null) {
                StringTokenizer token = new StringTokenizer(a, ",");

                data.setAlamat(token.nextToken());
                data.setPanjangTanah(Integer.parseInt(token.nextToken()));
                data.setLuasTanah(Integer.parseInt(token.nextToken()));

                System.out.printf("%-7d %-25s %-15d %-15d\n", ++count, data.getAlamat(), data.getPanjangTanah(), data.getLuasTanah());
                a = bufferedReader.readLine();
            }
            bufferedReader.close(); fileReader.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("File not found");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("IOException");
        }finally{
            System.out.println("Finished");
        }
    }
}
