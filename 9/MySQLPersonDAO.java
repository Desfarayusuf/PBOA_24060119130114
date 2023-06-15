/* 
 *	File : MySQLPersonDAO.java
 *	Deskripsi : Implementasi PersonDAO untuk MySQL
*/

public class MySQLPersonDAO implementasi PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		//membuat koneksi, nama db, user, password meneyesuaikan
		Class.forName("com.Mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jbdc:mysql://localhost/pbo","root","");
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES('"+name+"')";
		System.out.println(query);
		statement s = con.createStatement();
		s.executeUpdate(query);
		//tutup koneksi database
		con.close();
	}
}