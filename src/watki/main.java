package watki;

public class main {

	public static void main(String[] args) {
		/*
		System.out.println("Podpunkt A");
		WatkiA t1 = new WatkiA("a");
		t1.start();
		WatkiA t2 = new WatkiA("b");
		t2.start();
		
		System.out.println("Podpunkt B");
		Liczba l1 = new Liczba(0);
		WatkiB t3 = new WatkiB(l1,1);
		t3.start();
		WatkiB t4 = new WatkiB(l1,2);
		t4.start();
		*/
		System.out.println("Podpunkt C");
		Liczba3 l3 = new Liczba3(0);
		WatkiC t7 = new WatkiC(l3,1);
		t7.start();
		WatkiC t8 = new WatkiC(l3,2);
		t8.start();
		/*
		System.out.println("Podpunkt D");
		Liczba2 l2 = new Liczba2(0);
		WatkiD t5 = new WatkiD(l2,1);
		t5.start();
		WatkiD t6 = new WatkiD(l2,2);
		t6.start();*/
	}

}
