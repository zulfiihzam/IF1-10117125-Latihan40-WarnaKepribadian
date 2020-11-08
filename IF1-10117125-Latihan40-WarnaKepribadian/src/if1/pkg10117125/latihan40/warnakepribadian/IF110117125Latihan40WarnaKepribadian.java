/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan40.warnakepribadian;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : Zulfi Ihzam Rahmat
 * Kelas    : IF-1
 * NIM      : 10117125
 * Deskripsi Program : program ini berisi tampilan untuk mengecek kepribadian
 * berdasarkan warna
 */
public class IF110117125Latihan40WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String warnaK;
        String nama;
        warna warna = new warna();
        Scanner scanner = new Scanner(System.in);

        System.out.print(warna.ANSI_RED + "YUK "
                + warna.ANSI_RESET);
        System.out.print(warna.ANSI_GREEN + "CEK "
                + warna.ANSI_RESET);
        System.out.print(warna.ANSI_YELLOW + "KEPRIBADIANMU "
                + warna.ANSI_RESET);
        System.out.print(warna.ANSI_CYAN + "DARI "
                + warna.ANSI_RESET);
        System.out.print(warna.ANSI_PURPLE + "WARNA "
                + warna.ANSI_RESET);
        System.out.print(warna.ANSI_BLUE + "FAVORITMU "
                + warna.ANSI_RESET + "\n");

        System.out.print("\n" + warna.ANSI_RED_BACKGROUND + warna.ANSI_WHITE
                + "\t MERAH \t\t\n" + warna.ANSI_RESET);
        System.out.print(warna.ANSI_GREEN_BACKGROUND + warna.ANSI_WHITE
                + "\t HIJAU \t\t\n" + warna.ANSI_RESET);
        System.out.print(warna.ANSI_YELLOW_BACKGROUND + warna.ANSI_WHITE
                + "\t KUNING \t\n" + warna.ANSI_RESET);
        System.out.print(warna.ANSI_BLUE_BACKGROUND + warna.ANSI_WHITE
                + "\t BIRU \t\t\n" + warna.ANSI_RESET);
        System.out.print(warna.ANSI_PURPLE_BACKGROUND + warna.ANSI_WHITE
                + "\t UNGU \t\t\n\n" + warna.ANSI_RESET);

        System.out.print("PILIH WARNA FAVORITMU : ");
        warnaK = scanner.next();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "
                + nama.toUpperCase() + "====");
        warna.hasilTest(warnaK);
    }
    
}
