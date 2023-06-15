/* 
 *	File : DAOManager.java
 *	Deskripsi : Pengelola DAO dalam program
*/

public class DAOManager{
	private PersonDAO person DAO;
	
	public void setPersonDAO(personDAO person){
		personDAO = person;
	}
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}