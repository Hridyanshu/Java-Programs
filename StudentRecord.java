class Student
{
	//this class defines the fields of the student.
	String name;
	int sapId;
	Date dob; //reference variable of Date class; thus aggregation.
	
	Student(String name, int sapId, int dd, int mm, int yyyy)
	{
		//assigning values to the fields.
		dob = new Date(dd, mm, yyyy); //Date class constructor being called.
		this.name = name;
		this.sapId = sapId;
	}
	void display()
	{
		//displaying all field values.
		System.out.println("Name: " + this.name);
		System.out.println("Sap-Id: " + this.sapId);
		(this.dob).display();
	}
}
class Date
{
	//This class stores the date in a givem format.
	int dd, mm, yyyy;
	Date(int dd, int mm, int yyyy)
	{
		//Assigning values to the fields.
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	void display()
	{
		//Displaying the date in a given format.
		System.out.println("Date of Birth: " + this.dd + "-" + this.mm + "-" + this.yyyy);
	}
}

