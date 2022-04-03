package id.web.alexanderbryanw;

import java.util.Scanner;

public class Prak10_7 {

	public static void doInsertionSortAscNama(Data[] data) {
		int putaran, index;
		String tempNama;
		double tempTotal;
		int tempHarga, tempDiskon;
		int panjangArr = data.length;
		for (putaran = 1; putaran < panjangArr; putaran++) {
			tempNama = data[putaran].nama;
			tempHarga = data[putaran].harga;
			tempDiskon = data[putaran].diskon;
			tempTotal = data[putaran].total; 
			index = putaran - 1;
			while (index >= 0 && data[index].nama.compareToIgnoreCase(data[index + 1].nama) > 0) {
				data[index + 1].nama = data[index].nama;
				data[index + 1].harga = data[index].harga;
				data[index + 1].diskon = data[index].diskon;
				data[index + 1].total = data[index].total;
				index = index - 1;
			}
			data[index + 1].nama = tempNama;
			data[index + 1].harga = tempHarga;
			data[index + 1].diskon = tempDiskon;
			data[index + 1].total = tempTotal;
		}
		
	}

	public static void doInsertionSortDescNama(Data[] data) {
		int putaran, index;
		String tempNama;
		double tempTotal;
		int tempHarga, tempDiskon;
		int panjangArr = data.length;
		for (putaran = 1; putaran < panjangArr; putaran++) {
			tempNama = data[putaran].nama;
			tempHarga = data[putaran].harga;
			tempDiskon = data[putaran].diskon;
			tempTotal = data[putaran].total;
			index = putaran - 1;
			while (index >= 0 && data[index].nama.compareToIgnoreCase(data[index + 1].nama) < 0) {
				data[index + 1].nama = data[index].nama;
				data[index + 1].harga = data[index].harga;
				data[index + 1].diskon = data[index].diskon;
				data[index + 1].total = data[index].total;
				index = index - 1;
			}
			data[index + 1].nama = tempNama;
			data[index + 1].harga = tempHarga;
			data[index + 1].diskon = tempDiskon;
			data[index + 1].total = tempTotal;
		}
	}

	public static void doInsertionSortAscHarga(Data[] data) {
		int putaran, index, tempHarga, tempDiskon;
		String tempNama;
		double tempTotal;
		int panjangArr = data.length;
		for (putaran = 1; putaran < panjangArr; putaran++) {
			tempHarga = data[putaran].harga;
			tempNama = data[putaran].nama;
			tempDiskon = data[putaran].diskon;
			tempTotal = data[putaran].total;
			index = putaran - 1;
			while (index >= 0 && tempHarga < data[index].harga) {
				data[index + 1].harga = data[index].harga;
				data[index + 1].nama = data[index].nama;
				data[index + 1].diskon = data[index].diskon;
				data[index + 1].total = data[index].total;
				index = index - 1;
			}
			data[index + 1].harga = tempHarga;
			data[index + 1].nama = tempNama;
			data[index + 1].diskon = tempDiskon;
			data[index + 1].total = tempTotal;
		}
		tampilkanArray(data);
	}

	public static void doInsertionSortDescHarga(Data[] data) {
		int putaran, index, tempHarga, tempDiskon;
		String tempNama;
		double tempTotal;
		int panjangArr = data.length;
		for (putaran = 1; putaran < panjangArr; putaran++) {
			tempHarga = data[putaran].harga;
			tempNama = data[putaran].nama;
			tempDiskon = data[putaran].diskon;
			tempTotal = data[putaran].total;
			index = putaran - 1;
			while (index >= 0 && tempHarga > data[index].harga) {
				data[index + 1].harga = data[index].harga;
				data[index + 1].nama = data[index].nama;
				data[index + 1].diskon = data[index].diskon;
				data[index + 1].total = data[index].total;
				index = index - 1;
			}
			data[index + 1].harga = tempHarga;
			data[index + 1].nama = tempNama;
			data[index + 1].diskon = tempDiskon;
			data[index + 1].total = tempTotal;
		}
		tampilkanArray(data);
	}

	public static void tampilkanArray(Data[] data) {
		for (int index = 0; index < data.length; index++) {
			System.out.printf("%d\t%-10s\tRp%-8d\t%-8d\tRp%-10.2f\n", index + 1, data[index].nama, data[index].harga,
					data[index].diskon, data[index].total);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Jumlah data yang di-input : ");
		int length = scan.nextInt();
		Data[] data = new Data[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = new Data();
		}
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			System.out.printf("----------Input Barang-%d----------\n", i + 1);
			System.out.printf("Masukkan Nama Barang %d : ", i + 1);
			data[i].nama = scan.next();
			System.out.printf("Masukkan Harga Barang %d : ", i + 1);
			data[i].harga = scan.nextInt();
			System.out.printf("Masukkan Diskon Barang %d : ", i + 1);
			data[i].diskon = scan.nextInt();
			data[i].total = (data[i].harga - ((data[i].diskon * 0.01) * data[i].harga));
			System.out.println();
		}
		Boolean ulang;
		while (ulang = true) {
			System.out.println("Menu: ");
			System.out.println("1. Sort Berdasarkan Nama (A-Z)");
			System.out.println("2. Sort Berdasarkan Nama (Z-A)");
			System.out.println("3. Sort Berdasarkan Harga (ASC)");
			System.out.println("4. Sort Berdasarkan Harga (DESC)");
			System.out.println("5. Update Data");
			System.out.print("Pilihan : ");
			int pilihan = scan.nextInt();
			System.out.println();
			if (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4) {
				System.out.println("No	Nama	Harga		Diskon	Total");
				System.out.println("===================================================");
			}
			if (data.length == 1) {
				tampilkanArray(data);
			} else if (pilihan == 1) {
				for(int k = 1; k <= length; k++) {
					doInsertionSortAscNama(data);
				}
				tampilkanArray(data);
			} else if (pilihan == 2) {
				for(int k = 1; k <= length; k++) {
					doInsertionSortDescNama(data);
				}
				tampilkanArray(data);
			} else if (pilihan == 3) {
				doInsertionSortAscHarga(data);
			} else if (pilihan == 4) {
				doInsertionSortDescHarga(data);
			} else if (pilihan == 5) {
				for (int i = 0; i < data.length; i++) {
					System.out.println("Hasil Update Data:");
					System.out.printf("Nama Barang %d = %s\n", i + 1, data[i].nama);
					System.out.printf("Jumlah Harga Barang %d = %d\n", i + 1, data[i].harga);
					System.out.printf("Jumlah Diskon Barang %d = %d\n", i + 1, data[i].diskon);
					System.out.printf("Total Harga Barang %d = %.2f\n", i + 1, data[i].total);
				}
			} 
			System.out.println();
			System.out.print("Keluar (Ya/Tidak): ");
			String jawaban = scan.next();
			if(jawaban.equalsIgnoreCase("Ya")) {
				ulang = false;
				break;
			}
		}
		System.out.println("Terima kasih telah menggunakan program Alexander Bryan =)");
	}
}
