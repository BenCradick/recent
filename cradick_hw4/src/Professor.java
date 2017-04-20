/*
Ben Cradick
cs2261 hw4
date 4/6/2017
 */
import java.util.ArrayList;
public class Professor extends Person {
    Professor()
    {
        super();
    }
    Professor(String name)
    {
        super(name);

    }
    private Course course;
    private static ArrayList<Course> courses = new ArrayList<>();
    boolean full(){return (course != null);} // tells me if the prof is assigned a course to teach

    void clearCourse(){
        if(full())
        {
            courses.add(course);
            course = null;
        }
    }
    void setCourse(Course y){


        course = y;
    }
    void printCurrentCourse(){System.out.printf(course.getCourseTitle());}

    void printCourses()
    {
        for (int i = courses.size() - 3; i < courses.size() ; i++) {
            System.out.printf(courses.get(i) + " ");
        }
    }
    Course getCourse(){return course;}
}