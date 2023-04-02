
// File : Poligon.java 08/03/2023
// Penulis : Desfara Dyabi Yusuf
// Deskripsi :Representasi dasar objek poligon (segi banyak)

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	
	public void Poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}

}