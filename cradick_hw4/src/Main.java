/*
Ben Cradick
cs2261 hw4
date 4/6/2017
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Mary", "Patty", "Peggy", "Kate", "Ken", "Bill","Klaus", "Tom", "Tim",
                "Carol", "Kat", "Mike", "Ellen", "Randy", "Mike 2: electric boogaloo"};
        String[] department = {"Math1200", "Math2300", "Econ101", "CS9001","CS2250", "CS2700", "Bio2500",
                "Lang1999","MHLT1260","Art1000"};
        String[] courseNames = {"Algebra", "Calculus","Rand was an idiot, 101", "Advanced Neural Nets with Prolog",
                "C++ Round 2", "Computer Architecture","Genetics","Esperanto", "Musical Journey through the southwest corner of Laos",
                "Art Appreciation"};
        String[] professorName = {"Elon Musk" , "Jeff Bezos", "Bill Gates"};

        String grades = "ABCDF";
        Map<Integer, Professor> professors = new HashMap<>();
        Map<Integer, Student> studentMap = new HashMap<>();
        Map<Integer, Course> courseMap = new HashMap<>();
        Random num = new Random();

        int o = -1;

        Professor empty = new Professor();
        Course placeHolder = new Course("token", "token");
        for (String s: professorName)   //initialize professors
        {
            Professor x = new Professor(s);
            professors.put(x.getID(),x);

        }
        for (String s:names)//initializing the students
        {
            Student x = new Student(s);
            studentMap.put(x.getID(), x);
        }
        for (int i = 0; i < 10 ; i++) // initialize courses
        {
            Course x = new Course(courseNames[i], department[i], empty);
            courseMap.put(i,x);
        }
        for (int i = 0; i < 4; i++) // each iteration of this loop represents a semester.
        {
            // Part 1 of the semester, profs will be assigned classes to teach and students to classes
            for (int k = 0; k < 3; k++) // assigning each professor a course
            {

                int y;

                do
                {
                    y = num.nextInt(10);
                }while(courseMap.get(y).getInstructor() != empty);

                professors.get(k).setCourse(courseMap.get(y));
                courseMap.get(y).setInstructor(professors.get(k));

            }

            for (int j = 3; j < 18; j++) { //students getting assigned courses
                int count = 0;
                while(studentMap.get(j).getFull())// only enrolls a student if they don't have a full load
                {


                    int p;
                    do{                         //puts students in random classes that aren't full
                        p = num.nextInt(10);
                    }while(!courseMap.get(p).full());
                    count++;
                    //System.out.print(count);

                    studentMap.get(j).addCourseToTranscript(courseMap.get(p));
                    courseMap.get(p).enrollStudent(studentMap.get(j));
                }

            }
            // Semester Part 2 assigning grades and tying loose ends
            for (int j = 3; j < 18; j++) {
                for (int k = 0; k < 10 ; k++) {
                    //studentMap.get(j).printGradeAverage();

                    if(studentMap.get(j).containsGrade('n', courseMap.get(k)))
                    {
                        int g;
                        g = num.nextInt(5);
                        if (g > 2) {
                                g = num.nextInt(5);
                            if (g > 2) {
                                g = num.nextInt(5);
                            }
                        }
                        studentMap.get(j).setGrade(grades.charAt(g), courseMap.get(k));
                    }
                }
                studentMap.get(j).printTranscriptAndGradEligibility();
            }
            for (int j = 0; j < 10; j++) {
                courseMap.get(j).nextSemester();
                courseMap.get(j).setInstructor(empty);
                if(j < 3)
                    professors.get(j).clearCourse();

            }

        }
    }
}