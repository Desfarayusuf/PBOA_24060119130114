
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.panjangSisi = 4;
	}
	public double hitungLuas(){
		return this.panjangSisi * this.panjangSisi;
	}
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}