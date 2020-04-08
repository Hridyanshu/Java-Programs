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
