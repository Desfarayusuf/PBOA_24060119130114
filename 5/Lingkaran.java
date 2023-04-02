
// File : Lingkaran.java 01/04/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi : Interface yang mendefinisikan kontrak bahwa kelas yang membuat implementasi dari interface ini harus memiliki cara untuk menghitung luas

//mengmabil konstanta yang ada di kelas java.lang.math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}