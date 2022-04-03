package id.web.alexanderbryanw;

public class Prak10_1 {
	// untuk melakukan penukaran array
	public static void tukar(int[] myArr, int index) {
		int arrPertama = myArr[index];
		int arrKedua = myArr[index -1];
		//tukar
		myArr[index] = arrKedua;
		myArr[index - 1] = arrPertama;
	}
	
	public static void doBubbleSort (int[] arrayDiurutkan) {
		int panjangArr = arrayDiurutkan.length;
		for(int putaran = 1; putaran < panjangArr; putaran++) {
			System.out.println();
			System.out.printf("Putaran ke %d\n", putaran);
			for(int index = panjangArr - 1; index >= putaran; index--) {
				System.out.printf("Bandingkan %d dengan %d ", 
						arrayDiurutkan[index], arrayDiurutkan[index-1]);
				if (arrayDiurutkan [index - 1] > arrayDiurutkan [index]) {
					System.out.printf(" - Tukar -\n");
					tukar (arrayDiurutkan, index);
				}else {
					System.out.println();
				}
			}
		System.out.print("Hasil Putaran: ");
		tampilkanArray (arrayDiurutkan);
		System.out.println();
		}
	}
	
	public static void tampilkanArray (int[] myArr) {
		for (int index = 0; index < myArr.length; index++) {
			System.out.printf("%d ", myArr[index]);
		}
	}
	
	public static void main(String[] args) {
		int[] arrInginDiurutkan = {7, 9, 2, 5, 4};
		System.out.println("Sebelum diurutkan ");
		tampilkanArray(arrInginDiurutkan);
		System.out.println();
		doBubbleSort(arrInginDiurutkan);
		tampilkanArray(arrInginDiurutkan);
	}
}
