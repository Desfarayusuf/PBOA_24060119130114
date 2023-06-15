/*
 * FIle : SerializePerson.java
 * Deskripsi Program untuk serialisasi objek Person
*/

import java.io
//class Person
class Person implements Serializable{
	private String name;
	public Person(String n){
		name = n;
	}
public String getName(){
	return name;
	}
}

//class SerializePerson
public class SerializePerson{
	public static void main(String[] args){
		try{
			FileOutputStream f= new FileOutputStream("person.ser");
			objectOutputStream s = new objectOutputStream(f);
			s.writerObject(person);
			System.out.println("selesai menulis objek person");
			s.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}