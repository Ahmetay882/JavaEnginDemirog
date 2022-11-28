package miniProje2;

import java.util.Scanner;

//SESLİ HARFLERİ İNCE VE KALIN SESLİ ÜNLÜ HARF OLMAK ÜZERE İKİYE AYIRAN PROGRAM

public class KalınSesliveİnceSesliHarfler {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int exit=0;
		while(exit==0) {
			System.out.println("Sistemden cikmak icin q'ya basin.");
			System.out.print("Harf giriniz:");
			String harf=scanner.nextLine();
					
			switch (harf) {
				case "A","a":
				case "I","ı":
				case "O","o":
				case "U","u":
					System.out.println("Kalin sesli harf.");
					break;
					
				case "E","e":
				case "İ","i":
				case "Ö","ö":
				case "Ü","ü":
					System.out.println("Ince sesli harf.");
					break;
					
				default:
					if(harf.equals("q")) {
						System.out.println("Sistemden cikis yapiliyor.");
						exit++;
					}else {
						System.out.println("Girmis oldugunuz harf sesli harf degildir");
					}
					break;		
			}

		}
		
	}
}