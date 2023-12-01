
 class IPRCKarongi {
int StudentId;
String StudentName;
String StaffName;
String Position;
public void StudentDetails(int StudentId,String StudentName ){
    this.StudentId=StudentId;
this.StudentName= StudentName;
}
public void StaffDetails(String StaffName,String Position ){
    this.StaffName=StaffName;
this.Position= Position;
}
public static void main(String args[]){
 Student two=new Student();
 Staff three=new Staff();
two.StudentDetails(10,"Niha");
three.StaffDetails("developer", "HOD");
two.DisplayStudentDetails();
three.DisplayStaffDetails();
}
}
   class  Staff extends IPRCKarongi{
    public void DisplayStaffDetails()
    {
   System.out.println("Staff Name:"+StaffName+"\n"+"Position:"+Position);
    }
    }
class Student extends IPRCKarongi{
public void DisplayStudentDetails(){
System.out.println("Student Id:"+StudentId+" \n"+"Student Name:"+StudentName);
}
}