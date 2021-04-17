import java.util.Scanner;
import java.text.DecimalFormatSymbols;
import java.text.DecimalFormat;

public class tugas_coba {
    static void cetak(String teks){
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
        System.out.println(teks);
    }

    public static void main(String[] args) {
        //cetak("Praktikum Dasar Komputer dan Pemrograman 2021");
        //cetak1();
        //cetak2("Shift 1");
        method_tugas_coba objek = new method_tugas_coba();
        objek.greeting();

//        System.out.println("===================================================");
//        System.out.println(" ");
//        System.out.println("===================================================");
//        System.out.println("Nama Anggota 1 : Alya Adelia Mumtaz (2112012014079)");
//        System.out.println("Nama Anggota 2 : Alya Zahra Fatikha (21120120140056)");
//        System.out.println("Nama Anggota 3 : Maulana Yusuf Suradin (21120120140051)");
//        System.out.println("Nama Anggota 4 : Siti Sholekah (21120120120003)");
//        System.out.println("===================================================");
//        System.out.println(" ");
//        System.out.println(" ");
//
//        System.out.println("===================================================");
//        System.out.println("==========****Program Sewa Kost Putri****==========");
//        System.out.println("===================================================");
//        System.out.println(" ");
//        System.out.println(" ");

        // inisialisasi objek untuk masing-masing kelas
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        System.out.println ("kode 1. Kost Tipe A          Rp   500.000/bulan");
        System.out.println ("kode 2. Kost Tipe B          Rp   750.000/bulan");
        System.out.println ("kode 3. Kost Tipe C          Rp 1.100.000/bulan");

        int jumlah =0, i=0;
        int total_bayar=0;

        int [] kode = new int[3];
        String [] tipe = new String [3];
        String [] fasilitas = new String [3];
        int[] berapalama=new int[3];
        int [] harga = new int [3];
        double [] sub_total = new double [3];

        System.out.print("Masukkan jumlah sewa yang diinginkan : ");
        jumlah = input.nextInt();
        System.out.println(" ");

        for (i=0; i<jumlah;i++){
            System.out.print("Masukkan kode kost : ");
            kode [i]=input.nextInt();
            System.out.print("Masukkan jangka waktu sewa (bulan) : ");
            berapalama [i] =input.nextInt();

            switch (kode[i]){
                case 1 :
                    tipe[i] = "A";
                    fasilitas[i]= "Tempat tidur, Almari     ";
                    harga [i]= 500000;
                    break;
                case 2 :
                    tipe[i]="B";
                    fasilitas[i]="Tipe A + kamar mandi dalam";
                    harga [i]= 750000;
                    break;
                case 3 :
                    tipe[i]="C";
                    fasilitas[i]="Tipe B + AC              ";
                    harga [i]= 1100000;
                    break;
                default :
                    System.out.println("Kode Tidak Tersedia");
            }
        }
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        System.out.println(" ");
        System.out.println("Kode  Tipe Kamar     Fasilitas                                                 Harga           Lama Sewa     Sub Total");

        for (i=0;i<jumlah ;i++){
            sub_total[i]=(berapalama[i]*harga[i]);
            total_bayar+=sub_total[i];
            System.out.println(i+1+"      "+tipe[i]+"              "+fasilitas[i]+"                                "+kursIndonesia.format(harga[i])+"     "+berapalama[i]+"               "+kursIndonesia.format(sub_total[i])+" ");
        }
        System.out.println(" ");
        System.out.println("Total Bayar : "+kursIndonesia.format(total_bayar));
    }
}



