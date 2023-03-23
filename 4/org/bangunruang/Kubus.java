
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.bangunruang;

import org.bangundatar.Persegi;


public class Kubus{
	private Persegi permukaan;

	public Kubus (Persegi permukaan){
		this.permukaan = permukaan;
		
	}
	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}

	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getSisi();
	}
/* 	public void printInfo(){
		System.out.println("Bangun Kubus bersisi "+this.getJumlahSisi());
	} */
}