package DAY_20;

public class Student {
    String name;
    int rollNumber;
    String classroomCode;
    float cgpa;

    //default constructor
    public Student(){
        this.name="John Doe";
        this.rollNumber=-1;
        this.classroomCode="-1";
        this.cgpa=-1;
    }

    //custom constructor
    public Student(String n, int rollNo, String crCode, float cg){
        this.name=n;
        this.rollNumber=rollNo;
        this.classroomCode=crCode;
        this.cgpa=cg;
    }
}
