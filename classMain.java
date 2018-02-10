/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sim;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class classMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int noMenu=0, pilihMenu, menu;
        
        System.out.println("Aplikasi Sedang Berjalan.....");
        Scanner inKey = new Scanner (System.in);
        
        teknikIndustri tIndustri = new teknikIndustri();
	teknikInformatika tInformatika = new teknikInformatika();
	desainVisual desainVisual = new desainVisual();
	perwalianMahasiswa perwalian = new perwalianMahasiswa();
                
        while ((noMenu < 1) || (noMenu > 3)) {
                System.out.println ("***************************************************");
		System.out.println ("");
		System.out.println ("MENU UTAMA");
		System.out.println ("Selamat datang di System Akademik STT Bandung 2018/2019");
		System.out.println ("Sekolah Tinggi Teknologi Bandung");
		System.out.println ("***************************************************");
		System.out.println ("");    
                
                System.out.println ("Pilih Menu Akses: ");
		System.out.println ("1. Pendaftaran Mahasiswa Baru");
		System.out.println ("2. Perwalian Mahasiswa Lanjutan");
		System.out.println ("3. Keluar dari aplikasi");
		System.out.println ("");
		System.out.println ("Masukan menu pilihan anda : 1/2/3");
		System.out.print ("Menu : ");
		noMenu = inKey.nextInt();
		System.out.println ("");
		System.out.println ("");
            
            switch (noMenu) {
                case 1:
                    //pendaftaran mahasiswa baru
                    System.out.println ("Selamat datang di Menu Pendaftaran Mahasiswa Baru STT Bandung 2018/2019");
                    System.out.println ("*************************************************************************");
                    System.out.println ("");
                    System.out.println ("Pilih Jurusan Mahasiswa Baru: ");
                    System.out.println ("1. Jurusan Mahasiswa TI (Teknik Industri)");
                    System.out.println ("2. Jurusan Mahasiswa TIF (Teknik Informatika)");
                    System.out.println ("3. Jurusan Mahasiswa DKV (Design Komunikasi Visual)");
                    System.out.println ("4. Kembali ke Menu Utama");
                    System.out.print ("Pilih Kelas Jurusan: ");
                    noMenu = inKey.nextInt();
                    System.out.println ("");
                    
                    switch (noMenu) {
                        case 1:
                            pilihMenu = 0;
                            System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa TI (Teknik Industri)");
                            tIndustri.pendaftaranTeknikIndustri();
                            break;
                        case 2:
                            pilihMenu = 0;
                            System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa TIF (Teknik Informatika)");
                            tInformatika.pendaftaranTeknikInformatika();
                            break;
                        case 3:
                            pilihMenu = 0;
                            System.out.println ("Selamat datang di Form Formulir Kelas Mahasiswa DKV (Design Komunikasi Visual)");
                             desainVisual.pendaftaranDesain();
                            break;
                        case 4:
                            System.out.println ("Terima kasih, System kembali ke Halaman utama,");
                            break;
                        default:
                            System.out.println ("Permintaan tidak ada !");
                            System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
                            System.out.println ("System Out...");
                            System.out.println ("");
                            break;
                    }
                    System.out.println ("Terima kasih, Kembali ke Halaman Utama,");
                    System.out.println ("");
                    noMenu=0;
                    break;
                case 2:
                    System.out.println ("Selamat datang di Perwalian Mahasiswa Lanjutan STTBandung 2018/2019");
                    System.out.println ("*******************************************************************");
                    System.out.println ("");
                    //noMenu=0;
                    perwalian.perwalianMahasiswa();
                    System.out.println ("Terima kasih, System kembali keHalaman utama,");
                    System.out.println ("");
                    noMenu=0;
                    break;           
                case 3:
                    System.exit(0);
                default:
                    System.out.println ("Permintaan tidak ada !");
                    System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
                    System.out.println ("System Out...");
                    System.out.println ("");
                    break;
            }
        }
            
    }
    
}
