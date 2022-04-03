package id.web.alexanderbryanw;

public class Prak10_3 {

	public static void doInsertionSort(int[] arrayDiurutkan) {
		int putaran, index, temp;
		int panjangArr = arrayDiurutkan.length;
		for (putaran = 1; putaran < panjangArr; putaran++) {
			System.out.printf("\n Putaran ke %d\n", putaran);
			System.out.print("Awal : ");
			tampilkanArray(arrayDiurutkan);
			System.out.println();
			temp = arrayDiurutkan[putaran];
			System.out.printf("Temp : %d", temp);
			index = putaran - 1;
			while (index >= 0 && temp < arrayDiurutkan[index]) {
				System.out.printf("\nGeser %d(%d) ke %d(%d)", index, arrayDiurutkan[index], index + 1,
						arrayDiurutkan[index + 1]);
				arrayDiurutkan[index + 1] = arrayDiurutkan[index];
				index = index - 1;
			}
			System.out.printf("\nSet posisi %d, dengan isi temp (%d)", index + 1, temp);
			arrayDiurutkan[index + 1] = temp;
			System.out.print("\nHasil : ");
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
		int[] arrInginDiurutkan = { 60, 40, 20, 70, 30, 50 };
		System.out.println("Sebelum diurutkan ");
		tampilkanArray(arrInginDiurutkan);
		System.out.println();
		doInsertionSort(arrInginDiurutkan);
		System.out.println("\nSetelah diurutkan ");
		tampilkanArray(arrInginDiurutkan);
	}

}
