package watki;

public class WatkiC extends Thread {

	static Liczba3 l1;
	private int m;

	WatkiC(Liczba3 l1, int m) {
		this.l1 = l1;
		this.m = m;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			l1.metoda(m);
		}
	}
}

class Liczba3 {

	private long b;

	Liczba3(long b) {
		this.b = b;
	}

	public synchronized void metoda(int m) {
			b++;
			System.out.println("Watek " + m + " Posiada wartosc " + b);
	}
}
