/* 

File : BangunDatarGeneric.java
Deskripsi : Kelas konstruksi generic untuk BangunDatar

*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T get (){
		return bangunDatar;
	}
	
	public double hiutngKeliling(){
		return bangunDatar.hitungKeliling();
	}
}