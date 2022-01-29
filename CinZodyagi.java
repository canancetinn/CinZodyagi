package CinZodyagi;
import java.util.Scanner;
public class CinZodyagi {

	public static void main(String[] args) {
		int dogumTarihi;
		Scanner input = new Scanner(System.in);
		System.out.print("Doðum Tariihi Giriniz:");
		dogumTarihi = input.nextInt();
		if(dogumTarihi % 12 == 0) {
			System.out.print("Çin Zodyaði Burcunuz: Maymun");
		}else if(dogumTarihi % 12 == 1){
			System.out.print("Çin Zodyaði Burcunuz: Horoz");
		}else if(dogumTarihi % 12 == 2) {
			System.out.print("Çin Zodyaði Burcunuz: Köpek");
		}else if(dogumTarihi % 12 == 3) {
			System.out.print("Çin Zodyaði Burcunuz: Domuz");
		}else if(dogumTarihi % 12 == 4) {
			System.out.print("Çin Zodyaði Burcunuz: Fare");
		}else if(dogumTarihi % 12 == 5) {
			System.out.print("Çin Zodyaði Burcunuz: Öküz");
		}else if(dogumTarihi % 12 == 6) {
			System.out.print("Çin Zodyaði Burcunuz: Kaplan");
		}else if(dogumTarihi % 12 == 7) {
			System.out.print("Çin Zodyaði Burcunuz: Tavþan");
		}else if(dogumTarihi % 12 == 8) {
			System.out.print("Çin Zodyaði Burcunuz: Ejderha");
		}else if(dogumTarihi % 12 == 9) {
			System.out.print("Çin Zodyaði Burcunuz: Yýlan");
		}else if(dogumTarihi % 12 == 10) {
			System.out.print("Çin Zodyaði Burcunuz: At");
		}else if(dogumTarihi % 12 == 11) {
			System.out.print("Çin Zodyaði Burcunuz: Koyun");
		}
	}

}
