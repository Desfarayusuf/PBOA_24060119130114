
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.bangundatar;

import org.poligon.Poligon;

public class SegiTiga extends Poligon{
	private double tinggi,alas;

	public SegiTiga(double tinggi, double alas, int jumlahSisi){
		this.tinggi = tinggi;
		this.alas = alas;
		this.jumlahSisi = jumlahSisi;
	}

	public double hitungLuas(){
		return  0.5 * tinggi * alas;
	}

	public void printInfo(){
		System.out.println("Bangun SegiTiga bersisi "+this.getJumlahSisi());
	}

}