/*

	Titik.java 22/2/2023
	Penulis : Desfara D. Yusuf
	Deskripsi : kelas yang berisi program utama yang memanfaatkan kelas Titik

*/



class Titik{
	double absis;
	double ordinat;
	static int counterTitik;
	void Titik (){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat (double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}
}



/* class Titik{
	double absis; //absis
	double ordinat; //ordinat
	static int counterTitik; //penghitung objek titik yang telah dibuat
	//tugas dalam post test 
	Titik(double a,double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	//end tugas
	Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
		
	void setAbsis(double a){
		absis = a;
	}
	
	void setOrdinat(double o){
		ordinat = o;
	}
	
	double getAbsis(){
		return absis;
	}
	
	double getOrdinat(){
		return ordinat;
	}
	
	int getCounterTitik(){
		return counterTitik;
	}

 } */
	 