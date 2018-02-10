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
public class desainVisual extends perwalianMahasiswa {
    
    String namamhsdkv, namamhsdkv2, alamatmhsdkv, pendidikanterakhir, jeniskelamin, notelpon;
    int umurmhsdkv, pilih, noreg, nopil;
                
    protected void pendaftaranDesain(){
        Scanner inKey = new Scanner (System.in);
        while (pilih==0)
		{
			System.out.println("Silahkan isi Form Pendaftaran Mahasiswa Design Komunikasi Visual");
			System.out.println("****************************************************************");
			System.out.println();
			System.out.print ("Masukan Nama Lengkap : ");			
			namamhsdkv = inKey.nextLine();
			namamhsdkv2 = inKey.nextLine();
			System.out.print ("Jenis Kelamin : ");
			jeniskelamin = inKey.nextLine();
			System.out.print ("Masukan Umur : ");
			umurmhsdkv = inKey.nextInt();
			System.out.print ("Masukan Status Pendidikan Terakhir : ");
			pendidikanterakhir = inKey.nextLine();
			pendidikanterakhir = inKey.nextLine();
			System.out.print ("Masukan Alamat : ");
			alamatmhsdkv = inKey.nextLine();
			System.out.print ("Nomor Telphone : ");
			notelpon = inKey.nextLine();
			System.out.println ("");

			System.out.println ("");
			System.out.println ("Terima kasih telah menginput data.");
			System.out.println ("");
			System.out.println("berikut data yang anda input");
			System.out.println("############################");
			System.out.println();
			System.out.println("Nama : " + namamhsdkv + namamhsdkv2);
			System.out.println("Jenis Kelamin : " + jeniskelamin);
			System.out.println("Umur : " + umurmhsdkv);
			System.out.println("Status Pendidikan Terakhir : " + pendidikanterakhir);
			System.out.println("Alamat : " + alamatmhsdkv);
			System.out.println("Nomor Telphone : " + notelpon);
			System.out.println ("");

			System.out.println("Anda Yakin Akan menyimpan data? (1/2)");
			System.out.println("1. Yakin");
			System.out.println("2. Ulangi");
			System.out.print("Pilihan : ");
			pilih = inKey.nextInt();
                        
            switch (pilih) {
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
                    System.out.println("Nomor Registrasi Sedang diProses..");
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
                    System.out.println("Nomor Induk Mahasiswa Anda adalah : 17 787 9468");
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
                            break;
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
