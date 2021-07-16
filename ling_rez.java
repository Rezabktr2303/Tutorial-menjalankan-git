import java.util.Scanner;

public class ling_rez extends info_rez implements UI_rez{
	
	double r;
	Scanner scn = new Scanner(System.in);
	
	ling_rez(double r)
	{
		this.r=r;
	}
	
	void input(){
		System.out.println("--------inputan lingkaran-------");
		System.out.println("Masukkan jari-jari");
		r= scn.nextDouble();
	}
	
	public double K()
	{
		double K;
		K=3.14*(r+r);
		return K;
	}
	
	public double L()
	{
		double L;
		L=3.14*r*r;
		return L;
	}
	
	void cetak(){
		System.out.println("----------lingkaran----------");
		System.out.println("Diketahui : \nDiameter = "+r+"\n");
		L();
		K();
		System.out.println("Hasil : \nLuas = "+L()+"\nKeliling = "+K());
	}
}