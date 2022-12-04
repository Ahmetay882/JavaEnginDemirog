package classes;

public class Clas {
	public static void main(String[] args) {
		//classlar referans tiplidir.
		//new ile oluşturulan değişken ile heapte alan ayrılır.
		CustomerManager customerManager=new CustomerManager(); //class'dan bir nesne oluşturmuş olduk.
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;//örneğin customerMnager'in adresi 101 customerMnager'in adresi 102 ise şimdi ikisinin adresi de 102 olmuş oldu ve 101'i garbage collaction 101'i bellekten siler
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
	}
}
