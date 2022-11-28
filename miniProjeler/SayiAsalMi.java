package miniProje1;

import java.util.Scanner;

//ASAL SAYIYI BULAN PROGRAM

public class SayiAsalMi {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Asal mi degil mi diye kontrol edilecek sayiyi giriniz:");
		int number=scanner.nextInt();
		
		boolean isPrime=true;
		
		if(number<0) {
			System.out.println("Negatif sayilar asal sayi olamaz.");
			return;
		}
		
		if(number==1) {
			System.out.println(number+" sayisi asal degildir.");
			return;
		}else if(number==0) {
			System.out.println(number+" sayisi asal degildir.");
			return;			
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println(number+" sayisi asaldir.");
		}else {
			System.out.println(number+" sayisi asal degildir.");
		}
	}
}