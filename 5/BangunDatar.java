
// File : BangunDatar.java 01/04/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Kelas Abstrak, Berisi abstraksi bangun datar


public abstract class BangunDatar{
	protected double luas;
	
	public abstract double hitungLuas(double sisi);
	
	public void setLuas(double l){
		luas = l;
	}
	
	public double getLuas(){
		return luas;
	}
}