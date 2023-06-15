/*
 * FIle : ReadSerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
*/

import java.io.*;

public class ReadSerializedPerson{
	public static void main(String[] args){
		Person person = null;
		try{
			FileInputStream f = new FileInputStream("person.ser");
			objectInputStream s = new ObjectInputStream(f);
			person = (Person)s.readObject();
			s.close();
			System.outprintln("serialized person name = "+person.getName());
		}catch(Exception ioe){
			ioe.printStackTrace();
		}
	}
}