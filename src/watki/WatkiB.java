package watki;

public class WatkiB extends Thread {

	static Liczba l1;
	private int m;

	WatkiB(Liczba l1, int m) {
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

class Liczba {

	private long b;

	Liczba(long b) {
		this.b = b;
	}

	public void metoda(int m) {
		synchronized (this) {
			b++;
			System.out.println("Watek " + m + " Posiada wartosc " + b);
		}
	}
}