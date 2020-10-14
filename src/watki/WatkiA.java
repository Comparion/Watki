package watki;

import java.util.concurrent.TimeUnit;

public class WatkiA extends Thread {
	
	private String t;
	private volatile static long b=0;
	
	public WatkiA(String t)
	{
		this.t=t;
	}
	@Override
	public void run()
	{
		for(int i= 0; i<5;i++) {
			b++;
			System.out.println(b + t);
		}
	}
}
