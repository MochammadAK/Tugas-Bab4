package bab4;
import java.util.Scanner;
public class MainBukuAlamat{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BukuAlamat data[] = new BukuAlamat[5];

        for (int i = 0; i < data.length; i++) {
            data[i] = new BukuAlamat();
        }         
        System.out.println("=========== DATA BUKU ALAMAT ===========");
        System.out.println("========================================");
        System.out.print  ("Masukkan Banyak Data Yang di Inginkan : ");
        int jumlahUser = in.nextInt();
        System.out.println("");
        System.out.println("******** Masukkan Data Diri Anda *******");
        for (int j = 0; j < jumlahUser; j++) {
            System.out.println("========================================");
            System.out.print("Nama          : ");
            data[j].setNama(in.next());
            System.out.print("Alamat        : ");
            data[j].setAlamat(in.next());
            System.out.print("Nomor Telepon : ");
            data[j].setNoTel(in.next());
            System.out.print("Email         : ");
            data[j].setEmail(in.next());
        }
    }
}