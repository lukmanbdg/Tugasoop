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
public class teknikInformatika extends perwalianMahasiswa {
    
    String namamhstif, namamhstif2, alamatmhstif, pendidikanterakhir, jeniskelamin, notelpon;
    int umurmhstif, pilih, noreg, nopil;
    
    void pendaftaranTeknikInformatika (){
        Scanner inKey = new Scanner (System.in);
        while (pilih==0)
		{
			System.out.println("Silahkan isi Form Pendaftaran Mahasiswa Teknik Informatika");
			System.out.println("**********************************************************");
			System.out.println();
			System.out.print ("Masukan Nama Lengkap : ");
			//namamhsti = inKey.nextLine();
			namamhstif = inKey.nextLine();
			namamhstif2 = inKey.nextLine();
			System.out.print ("Jenis Kelamin : ");
			jeniskelamin = inKey.nextLine();
			System.out.print ("Masukan Umur : ");
			umurmhstif = inKey.nextInt();
			System.out.print ("Masukan Status Pendidikan Terakhir : ");
			pendidikanterakhir = inKey.nextLine();
			pendidikanterakhir = inKey.nextLine();
			System.out.print ("Masukan Alamat : ");
			alamatmhstif = inKey.nextLine();
			System.out.print ("Nomor Telphone : ");
			notelpon = inKey.nextLine();
			System.out.println ("");

			System.out.println ("");
			System.out.println ("Terima Kasih Telah Menginput Data.");
			System.out.println ("");
			System.out.println("Berikut Data Yang Anda Input");
			System.out.println("############################");
			System.out.println();
			System.out.println("Nama : " + namamhstif + namamhstif2);
			System.out.println("Jenis Kelamin : " + jeniskelamin);
			System.out.println("Umur : " + umurmhstif);
			System.out.println("Status Pendidikan Terakhir : " + pendidikanterakhir);
			System.out.println("Alamat : " + alamatmhstif);
			System.out.println("Nomor Telphone : " + notelpon);
			System.out.println ("");

			System.out.println("Anda Yakin Akan menyimpan data? (1/2)");
			System.out.println("1. Yakin");
			System.out.println("2. Ulangi");
			System.out.print("Pilihan : ");
			pilih = inKey.nextInt();
                        
            switch (pilih) {
            //end nopil 1
                case 1:
                    System.out.println ("");
                    System.out.println ("Data Anda tersimpan .");
                    System.out.println ("Silahkan melakukan Transaksi Pembayaran");
                    System.out.println ("ke Nomor Rekening Akademik yang tersedia : ");
                    System.out.println ("Nomor Rekening : 451 900 9026 0040050054");
                    System.out.println();
                    System.out.println ("Silahkan memasukan Nomor Registrasi Akhir Transaksi dibawah ini ");
                    System.out.println("*****************************************************************");
                    System.out.print("Nomor Registrasi (6 digit) : ");
                    noreg = inKey.nextInt();
                    System.out.println();
                    System.out.println();
                    System.out.println("Harap Menunggu Konfirmasi Pengesahan Dari Akademik dan Wali Dosen Semester 1");
                    System.out.println("****************************************************************************");
                    System.out.println("****************************************************************************");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("############################################################################");
                    System.out.println("############################################################################");
                    System.out.println("Selamat, data anda telah disetujui oleh pihak akademik");
                    System.out.println("");
                    System.out.println("Mengetahui");
                    System.out.println("");
                    System.out.println("Muhamad Sabar, MT");
                    System.out.println("Akademik STTBandung");
                    System.out.println("---------------------");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Terima Kasih telah melakukan Pendaftaran Di STT Bandung");
                    System.out.println("=======================================================");
                    System.out.println("Nomor Induk Mahasiswa Anda adalah : 17 232 5329");
                    System.out.println();
                    System.out.println();
                    System.out.println ("Info Lebih lanjut dapat dilihat di sttbandung.ac.id");
                    System.out.println("****************************************************");
                    System.out.println("****************************************************");
                    System.out.println();
                    System.out.println();
                    System.out.println ("Menu Pilihan : ");
                    System.out.println ("2. kembali ke Halaman Utama");
                    System.out.println ("3. Keluar dari System");
                    System.out.print("Pilihan : ");
                    pilih = inKey.nextInt();
                    
                        switch (pilih) {
                            case 2:
                                System.out.println ("Terima kasih, System kembali ke Halaman utama,");
                                break;
                            case 3:
                                System.exit(0);
                            default:
                                System.out.println ("Permintaan tidak ada !");
                                System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
                                System.out.println ("System Out...");
                                System.out.println ("");
                                break; //end menu pilihan
                        }
                    break;
                case 2:
                    System.out.println("*********************************");
                    System.out.println("*********************************");
                    System.out.println ("Terima Kasih");
                    System.out.println ("Silahkan ulangi data Pendaftaran");
                    System.out.println ("");
                    pilih = 0;
                    break;
                default:
                    System.out.println ("Permintaan tidak ada !");
                    System.out.println ("Mohon isi pilihan dengan pilihan yang tersedia...");
                    System.out.println ("System Out...");
                    System.out.println ("");
                    System.out.println ("System kembali ke Halaman utama,");
                    break;
            }
		}
        
    }

    @Override
    void perwalianMahasiswa (){
    }    
}
