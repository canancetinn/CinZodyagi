package CinZodyagi;
import java.util.Scanner;
public class CinZodyagi {

	public static void main(String[] args) {
		int dogumTarihi;
		Scanner input = new Scanner(System.in);
		System.out.print("Do�um Tariihi Giriniz:");
		dogumTarihi = input.nextInt();
		if(dogumTarihi % 12 == 0) {
			System.out.print("�in Zodya�i Burcunuz: Maymun");
		}else if(dogumTarihi % 12 == 1){
			System.out.print("�in Zodya�i Burcunuz: Horoz");
		}else if(dogumTarihi % 12 == 2) {
			System.out.print("�in Zodya�i Burcunuz: K�pek");
		}else if(dogumTarihi % 12 == 3) {
			System.out.print("�in Zodya�i Burcunuz: Domuz");
		}else if(dogumTarihi % 12 == 4) {
			System.out.print("�in Zodya�i Burcunuz: Fare");
		}else if(dogumTarihi % 12 == 5) {
			System.out.print("�in Zodya�i Burcunuz: �k�z");
		}else if(dogumTarihi % 12 == 6) {
			System.out.print("�in Zodya�i Burcunuz: Kaplan");
		}else if(dogumTarihi % 12 == 7) {
			System.out.print("�in Zodya�i Burcunuz: Tav�an");
		}else if(dogumTarihi % 12 == 8) {
			System.out.print("�in Zodya�i Burcunuz: Ejderha");
		}else if(dogumTarihi % 12 == 9) {
			System.out.print("�in Zodya�i Burcunuz: Y�lan");
		}else if(dogumTarihi % 12 == 10) {
			System.out.print("�in Zodya�i Burcunuz: At");
		}else if(dogumTarihi % 12 == 11) {
			System.out.print("�in Zodya�i Burcunuz: Koyun");
		}
	}

}
