package HW9;

public class Students {

/*
Task:
Create a Class called Students
Create three variables  Name, ID  and numberOfStudents
Create three objects of the Students Class
Set the value for studentName, studentID and increment the numberOfStudents for each object
Print out  total number of students
*/

    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students class1 = new Students();
        class1.name = "Vonny";
        class1.id = "010101";
        numberOfStudents++;

        Students class2 = new Students();
        class2.name = "BeeBee";
        class2.id = "343434";
        numberOfStudents++;

        Students class3 = new Students();
        class3.name = "Django";
        class3.id = "565656";
        numberOfStudents++;

        Students class4 = new Students();
        class4.name = "Cican";
        class4.id = "676767";
        numberOfStudents++;


        System.out.println("Total Number of Students: " + Students.numberOfStudents);

    }


}

















