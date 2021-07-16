import java.util.Scanner;

public class tabung_rez extends ling_rez implements UI2_rez{
	
	double t;
	Scanner scn =  new Scanner(System.in);
	
	tabung_rez(double r,  double t)
	{
		super(r);
		this.t = t;
	}
	
	void input(){
		System.out.println("----------inputan tabung---------");
		System.out.println("Masukkan jari-jari");
		r = scn.nextDouble();
		System.out.println("Masukkan Tinggi");
		t = scn.nextDouble();
	}
	
	public double LP()
	{
		double LP;
		LP=(2*(.14*r*r))*((3.14*(r+r))*t);
		return LP;
	}
	
	public double V()
	{
		double V;
		V=3.14*r*r*t;
		return V;
	}
	void cetak(){
		System.out.println("------------tabung------------");
		System.out.println("Diketahui : \njari-jari = "+r+"\nTinggi = "+t+"\n");
		LP();
		V();
		System.out.println("Hasil : \nLuas Permukaan = "+LP()+"\nVolume = "+V());
	}
}