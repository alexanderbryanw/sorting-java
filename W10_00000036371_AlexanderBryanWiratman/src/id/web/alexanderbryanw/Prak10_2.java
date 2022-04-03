package id.web.alexanderbryanw;

public class Prak10_2 {
	// untuk melakukan penukaran array
	public static void tukar(int[] myArr, int index1, int index2) {
		int arrPertama = myArr[index1];
		int arrKedua = myArr[index2];
		// tukar
		myArr[index1] = arrKedua;
		myArr[index2] = arrPertama;
	}

	public static void doSelectionSort(int[] arrayDiurutkan) {
		int panjangArr = arrayDiurutkan.length;
		int pencatatIndex = 0;
		for (int putaran = 1; putaran < panjangArr; putaran++) {
			System.out.println();
			System.out.printf("Putaran ke %d\n", putaran);
			pencatatIndex = putaran - 1;
			for (int index = putaran - 1; index < panjangArr; index++) {
				if (index != pencatatIndex) {
					System.out.printf("Bandingkan: %d dengan %d\n", arrayDiurutkan[index],
							arrayDiurutkan[pencatatIndex]);
					if (arrayDiurutkan[index] < arrayDiurutkan[pencatatIndex]) {
						System.out.printf("Index dengan value terkecil : %d\n", index);
						pencatatIndex = index;
					}
				}
			}
			if (pencatatIndex != putaran - 1) {
				System.out.printf("Pindah posisi : %d - %d\n", arrayDiurutkan[pencatatIndex],
						arrayDiurutkan[putaran - 1]);
				tukar(arrayDiurutkan, pencatatIndex, putaran - 1);
			}
			System.out.print("Hasil array: ");
			tampilkanArray(arrayDiurutkan);
			System.out.println();
		}
	}

	public static void tampilkanArray(int[] myArr) {
		for (int index = 0; index < myArr.length; index++) {
			System.out.printf("%d ", myArr[index]);
		}
	}

	public static void main(String[] args) {
		int[] arrInginDiurutkan = { 60, 70, 30, 50, 40, 20 };
		System.out.println("Sebelum diurutkan ");
		tampilkanArray(arrInginDiurutkan);
		System.out.println();
		doSelectionSort(arrInginDiurutkan);
		System.out.println("\nSetelah diurutkan ");
		tampilkanArray(arrInginDiurutkan);
	}

}
