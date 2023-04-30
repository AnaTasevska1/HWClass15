package HWClass15;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

        String name;
        String ID;
        static int numberOfStudents;

        public static void main(String[] args) {
            Students nikic1=new Students();
            nikic1.ID="12548";
            nikic1.name="Luka";
            numberOfStudents++;


            Students nikic2=new Students();
            nikic2.ID="51252";
            nikic2.name="Lea";
            numberOfStudents++;


            Students nikic3=new Students();
            nikic3.ID="45164";
            nikic3.name="Nika";
            numberOfStudents++;

            System.out.println(numberOfStudents);
        }
    }

