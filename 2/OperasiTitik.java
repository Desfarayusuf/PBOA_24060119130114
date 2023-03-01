/* 
	OperasiTitik.java 1/3/2023
	Nama : Desfara Dyabi Yusuf
	Deskripsi : Kelas Titik

*/
public class OperasiTitik{
	
	
	private void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	
	private void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	public void refleksiX(Titik t){
		refleksiSumbuX(t);
	}
	public void refleksiY(Titik t){
		refleksiSumbuY(t);
	}
}