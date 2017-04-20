/*
Ben Cradick
cs2261 hw4
date 4/6/2017
 */
import java.util.ArrayList;



public class Course {
    Course(String title, String id){
        courseTitle = title;
        courseId = id;
    }
    Course(String title, String id, Professor prof)
    {
        courseTitle = title;
        courseId = id;
        instructor = prof;
    }

    private String courseTitle;
    private String courseId;
    private Professor instructor;
    ArrayList<Student> students = new ArrayList<>(0);

    void enrollStudent(Student id) {students.add(id);}
    void setCourseTitle(String x){courseTitle = x;}
    void setCourseId(String x){courseId = x;}
    void setInstructor(Professor x){instructor = x;} //8bit x-man theme plays
    String getCourseTitle(){return courseTitle;}
    String getCourseId(){return courseId;}
    Professor getInstructor(){return instructor;}
    boolean full(){return (students.size() < 10);}
    void nextSemester(){
        students.removeAll(students);


    }

}