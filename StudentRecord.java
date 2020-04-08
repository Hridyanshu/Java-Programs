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
public class StudentRecord
{
	public static void main(String args[])
	{
		String name;
		int sapId, dd, mm, yyyy;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size = input.nextInt(); //size refers to the no of students.
		Student student[] = new Student[size]; //array of refernces.
		for(int i=0;i<size;i++)
		{
			//Taking data of students from the user.
			System.out.println("Enter the details of the student " + (i+1));
			System.out.print("Name: ");
			input.nextLine();
			name = input.nextLine();
			System.out.print("Sap-Id: ");
			sapId = input.nextInt();
			System.out.print("Date of Birth (dd mm yyyy): ");
			dd = input.nextInt();
			mm = input.nextInt();
			yyyy = input.nextInt();
			student[i] = new Student(name, sapId, dd, mm, yyyy);
		}
		System.out.println("\n\nDisplaying the details of the students");
		for(int i=0;i<size;i++)
		{
			//Displaying the data of students to the user.
			System.out.println("Student " + (i+1));
			student[i].display();
			System.out.print("\n");
		}
	}
}
