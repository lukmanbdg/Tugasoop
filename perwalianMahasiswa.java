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
public class perwalianMahasiswa {
    int noMenu=0, pilihMenu, menu, semester, jurusan, noReg, password, nim;
    String nama;
    
    void perwalianMahasiswa(){
        Scanner inKey = new Scanner (System.in);
        
        while(noMenu==0)
		{
                    System.out.println("Masukan NIM Untuk Login");
                    System.out.println("***********************");
                    System.out.println("");
                    System.out.print ("NIM : ");
                    nim = inKey.nextInt();
                    System.out.print ("NAMA : ");
                    nama = inKey.nextLine();
                    nama = inKey.nextLine();
                    System.out.print ("PASSWORD (1234) : ");
                    password = inKey.nextInt();

		if (password == 1234){
			System.out.println ("");
			System.out.println ("Selamat Datang " + nama);
			System.out.println ("Mahasiswa Sekolah Tinggi Teknologi Bandung");
			System.out.println ("******************************************");
			System.out.println ("");
			System.out.println ("Silahkan isi form perwalian berikut ");
			System.out.println ("");
			System.out.print ("Pilih Semester lanjutan (2/3/4/5/6/7/8) : ");
			semester = inKey.nextInt();
			System.out.println ("Pilih Jurusan : ");
			System.out.println ("1. Teknik Industri");
			System.out.println ("2. Teknik Informatika");
			System.out.println ("3. Design Komunikasi Visual");
			System.out.println ("Pilihan : ");
			jurusan = inKey.nextInt();
			System.out.println("Nomor Registrasi Perwalian Sedang diProses..");
			System.out.println ("");
			System.out.println ("Terima Kasih telah melakukan Perwalian Semester Lanjutan..");
			System.out.println ("");
			System.out.println ("**********************************************************");
			System.out.println ("Silahkan masukan Nomor Registrasi Akhir Transaksi dibawah ini ");
			System.out.println ("**************************************************************");
			System.out.print("Nomor Registrasi (6 digit) : ");
			noReg = inKey.nextInt();
			System.out.println ("");
			System.out.println ("");
			System.out.println("Nomor Registrasi Sedang diProses..");
			System.out.println("");
			System.out.println("");
			System.out.println("Proses Transaksi Berhasil..");
			System.out.println("###########################");
			System.out.println("");

			System.out.println("Harap menunggu konfirmasi pengesahan dari Akademik dan Wali Dosen");
			System.out.println("#################################################################");
			System.out.println("#################################################################");
			System.out.println("");
			System.out.println("");
			System.out.println("============================================================================");
			System.out.println("============================================================================");
			System.out.println("Selamat, Data Perwalian Telah Disetujui Oleh Pihak Akademik dan Dosen Wali..");
			System.out.println("");
			System.out.println("Mengetahui");
			System.out.println("");
			System.out.println("Muhamad Sabar, MT");
			System.out.println("Akademik STTBandung");
			System.out.println("---------------------");
			System.out.println("");
			System.out.println("");
			System.out.println("Mengetahui");
			System.out.println("");
			System.out.println("Indra J.P, ST");
			System.out.println("Wali Dosen STTBandung");
			System.out.println("---------------------");
			System.out.println("");
			System.out.println("");

			System.out.println("== Berikut Nomor KHS anda ==");
			System.out.println("££££££££££££££££££££££££££££");
			System.out.println("");
			System.out.println("== NOMOR RESI KHS == ");
			System.out.println("8975293523952");
			System.out.println("");
			System.out.println("== NIM == ");
			System.out.println(nim);
			System.out.println("");
			System.out.println("== NAMA == ");
			System.out.println(nama);
			System.out.println("");
			System.out.println("== JURUSAN == ");
                    switch (jurusan) {
                        case 1:
                            System.out.println("TEKNIK INDUSTRI");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("TEKNIK INFORMATIKA");
                            System.out.println("");
                            break;
                        case 3:
                            System.out.println("DESIGN KOMUNIKASI VISUAL");
                            System.out.println("");
                            break;
                        default:
                            break;
                    }

			System.out.println("== SEMESTER == ");
			System.out.println(semester);
			System.out.println("");
			System.out.println("****************************************************");
			System.out.println("****************************************************");
			System.out.println("");


			System.out.println ("Info Lebih Lanjut Dapat Dilihat di sttbandung.ac.id");
			System.out.println("****************************************************");
			System.out.println("****************************************************");
			System.out.println();
			System.out.println();
			System.out.println ("Menu Pilihan : ");
			System.out.println ("2. kembali ke Halaman Utama");
 			System.out.println ("3. Keluar dari System");
 			System.out.print("Pilihan : ");
			pilihMenu = inKey.nextInt();
                        switch (pilihMenu) {
                            case 2:
                                System.out.println ("Terima kasih, System kembali ke Halaman utama,");
                                noMenu=1;
                                break;
                            case 3:
                                System.exit(0);
                            default:
                                System.out.println ("Permintaan Tidak Ada !");
                                System.out.println ("Mohon Isi Pilihan Sesuai pilihan yang tersedia...!");
                                System.out.println ("System Out...");
                                System.out.println ("");
                                noMenu=1;
                                break;
                        }	
		}
		else{
			System.out.println ();
			System.out.println("Password salah..");
			System.out.println("Silahkan Ulangi untuk login account !! ");
			System.out.println ();
			noMenu=0;
		}
	}
        
    }
    
    
}
