package Modul5.Kegiatan1;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        dinasPertahanan data = new dinasPertahanan();

        String alamat[] = new String[3];
        int panjang[] = new int[3];
        int luastanah[] = new int[3];
        boolean fax=true;
        int i = 0;
        int count = 1;
    try {
        while (fax) {
            System.out.println("=== Data ke : " + count+++" ===");
            System.out.print("Alamat\t\t: ");
            data.setAlamat(in.next());
            System.out.print("Panjang tanah\t: ");
            data.setPanjangTanah(in.nextInt());
            System.out.print("Luas tanah\t:");
            data.setLuasTanah(in.nextInt());

            alamat[i] = data.getAlamat();
            panjang[i] = data.getPanjangTanah();
            luastanah[i] = data.getLuasTanah();
            i++;
        }
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Exception Thrown :" +e);
        fax = false;
    }catch(InputMismatchException e){
        System.out.println("Missmatch input. Panjang or LuasTanah input should be in numeric data: "+e);
    }
    finally {
        System.out.println("Stopped");
    }
    }
}
