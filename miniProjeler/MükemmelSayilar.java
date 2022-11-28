package miniProje3;

import java.util.Scanner;

//MÜKEMMEL SAYIYI BULAN PROGRAM (MÜKEMMEL SAYI:POZİTİF TAM BÖLENKERİN SAYILARININ TOPLAMI 
//YİNE KENDİNE EŞİT OLAN SAYILARDIR)


public class MükemmelSayilar {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String exit="a";
		int temp=0;
		
		while(exit=="a") {
			System.out.print("Hangi sayi mukemmel sayi mi degil mi diye kontrol edilsin: ");
			int number=scanner.nextInt();
			
			if(number<0) {
				System.out.println("Negatif sayilar mukemmel sayi olamaz.Sistem kapatiliyor");
				break;
			}else if(number==0) {
				System.out.println("Sifir mukemmel sayi olamaz.Sistem kapatiliyor");
				break;
			}
			
			for(int i=1;i<number;i++) {
				if(number%i==0) {
					temp+=i;
				}
			}
			
			if(temp==number) {
				System.out.println(number+" sayisi mukemmel sayidir.");
			}else{
				System.out.println(number+" sayisi mukemmel sayi degildir.");
			}
			
			scanner.nextLine();
			System.out.print("Sistemden cikmak icin q'ya basin:");
			exit=scanner.nextLine();
			if(exit=="q") {
				return;
			}
			
		}

	}
}