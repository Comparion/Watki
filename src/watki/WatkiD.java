package watki;

public class WatkiD extends Thread {

	static Liczba2 l1;
	private int m;

	WatkiD(Liczba2 l1, int m) {
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

class Liczba2 {

	private long b;

	Liczba2(long b) {
		this.b = b;
	}

	public void metoda(int m) {
		synchronized (this) {
			notify();
			b++;
			System.out.println("Watek " + m + " Posiada wartosc " + b);
			try {
				wait();
			} catch (InterruptedException e) {
			}

		}
	}
}
