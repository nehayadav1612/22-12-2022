public class Employee {

private int id;
private String firstName; 
private String lastName; 
private double Salary; 
		
		
		public Employee( int empid,String fname, String lname, double salary)
		{
			id=empid;
			firstName = fname; 
			lastName = lname; 
			Salary = salary; 
			
			
			if (salary < 0.0)
				Salary = 0.0;
		} 
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public void setFirstName (String fname)
		{
			firstName = fname;	}
		
		
		public String getFirstName ()
		{
			return firstName;
		} 
		
		public void setLastName (String lname)
		{
			lastName = lname;	
		}
		
		
		public String getLastName ()
		{
			return lastName;
		} 
		
		
		public void setSalary (double salary)
		{
			Salary = salary;	}
		
		
		
		public double getSalary ()
		{
			return Salary;
		} 
		
		public double getYearlySalary()
		{
			double yearlySalary = Salary * 12;
			return yearlySalary;
		} 
		public double getRaiseSalary()
		{
			double raise =  Salary * 0.1 ;
			double raiseSalary = ( Salary + raise ) * 12;
			return raiseSalary;
		} 
		
		public String toString() {
			String str= "Id= " +getId()+" "+ "\nFirst name= "+getFirstName()+ " " + "\nLast name= "+getLastName()+ " " + "\nSalary= "+ " "+getRaiseSalary();
			return str;
			
		}
		
		
	} 
