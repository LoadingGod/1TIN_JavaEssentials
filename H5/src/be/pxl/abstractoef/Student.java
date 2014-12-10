package be.pxl.abstractoef;

class Student extends Person
{
	private String SID;    // student ID number

    /*
     * Create a student with default settings for detail information.
     */

    Student()
    {
    	super("(unknown name)", 0000);
    	SID = "(unknown ID)";
    }
 

    /*
     * Create a student with given name, year of birth and student ID
     */
    Student(String name, int yearOfBirth, String studentID)
	{
		super(name, yearOfBirth);
        SID = studentID;
    }

    /*
     * Return the student ID of this student.
     */
    public String getStudentID()
    {
       return SID;
    }

    /*
     * Return a string representation of this object.
     */
    public String toString()    // redefined from "Person" = overriding!!
    {
        return super.toString() +
               "Student\n" +
               "Student ID: " + SID + "\n";
    }
    
    void printAll() {
    	System.out.println("Name: "+getName()+"\n"
    					+ "Year of birth: "+ getYearOfBirth() +"\n"
    					+ "StudentID: "+ SID + "\n");
    }

}


