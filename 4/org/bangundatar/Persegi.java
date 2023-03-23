
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.bangundatar;

import org.poligon.Poligon;

public class Persegi extends Poligon{
	private double sisi;

	public Persegi(double sisi, int jumlahSisi){
		this.sisi = sisi;
		this.jumlahSisi = jumlahSisi;
		
	}

	public double hitungLuas(){
		return this.sisi * this.sisi;
	}
	public double getSisi(){
		return this.sisi;
	}
	
	

	public void printInfo(){
		System.out.println("Bangun Persegi bersisi "+this.getJumlahSisi());
	}

}