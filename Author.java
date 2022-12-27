
public class Author {
	String firstName;
	String lastName;
	String bookName;
	
	//default constr
		public Author() {
			
		}
	// 2 param constr	
	public Author(String f,String l) {
		this.firstName= f;
		this.lastName=l;
	}
	//3 param constr
	public Author(String f,String l,String b) {
		this.firstName= f;
		this.lastName=l;
		this.bookName=b;
	}
	//getter setter
	public  String getfirstName( ) {
		return firstName;
	}
	public void setfirstName(String lastName) {
		this.firstName=firstName;
	}
	public  String getlastName( ) {
		return lastName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}//string to display author details
	public String toString() {
		String Str="\n\nFirst Name: "+" "+getfirstName()+ " "+"\nLast Name "+" "+getlastName()+ "\nBook Name " + getBookName();
		return Str;
		
	}

}
