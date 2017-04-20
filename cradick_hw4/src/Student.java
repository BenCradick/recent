/*
Ben Cradick
cs2261 hw4
date 4/6/2017
 */
import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    Student(){super("no name");}
    Student(String name)
    {
        super(name);
    }
    private Map<Course, Character> transcript = new HashMap<>();
    private int currentLoad = 0;
    private boolean full = (currentLoad > 2);


    //allocates appropriate score to be averaged based on final grade
    private int convertToGPA(char grade)
    {
        grade = Character.toLowerCase(grade);
        if (grade == 'a')
            return 4;
        else if(grade =='b')
            return 3;
        else if(grade == 'c')
            return 2;
        else if(grade == 'd')
            return 1;
        else if(grade == 'f')
            return 0;
        else
        return 0;
    }
    private boolean passClass(char grade){
        return (convertToGPA(grade) > 2);
    }
    void addCourseToTranscript(Course a)
    {
        if (transcript.containsKey(a))
        {
            if(passClass(transcript.get(a)) || transcript.get(a) == 'n'){}

            else {
                if(passClass(transcript.get(a)) || transcript.get(a) == 'n'){ }

                transcript.remove(a);
                transcript.put(a, 'n');
                currentLoad++;

            }

        }

        else if(full){}
        else
        {

            transcript.put(a, 'n');
            currentLoad++;

        }

    }
    boolean containsGrade(char grade, Course a)
    {
        return (transcript.containsKey(a) && transcript.containsValue(grade));
    }
    void setGrade(char grade, Course a)
    {

        if(transcript.replace(a, 'n',grade))
            currentLoad--;
    }
    void printGradeAverage(){
        int x = 0;
        char a = 'N';
        for (Map.Entry<Course, Character> entry: transcript.entrySet())
        {
            x += convertToGPA(entry.getValue());
        }
        x /= transcript.size();

        if(x == 2) {a = 'C';}
        else if(x == 3){a = 'B';}
        else if(x == 1){a = 'D';}
        else if(x == 0){a = 'F';}
        else if(x == 4){a = 'A';}
        else{System.out.printf("error occured when finding average");}

        System.out.printf("Average Grade was:    " + a);


    }



    void printTranscriptAndGradEligibility()// does the function of boolean eligible grad but integrating the function into the for
    {  int count = 0;      // statement saves cpu and memory resources and the test case calls for them to occur together
        String grad;
        System.out.printf("Student Name:\t" + getName()+ "\nStudent ID \t" +
                getID() +"\nTranscript reads as follows:\n");

        for(Map.Entry<Course, Character> entry : transcript.entrySet()) {
            Course course = entry.getKey();
            Character grade = transcript.get(course);
            int pass = (convertToGPA(grade) > 1)? 1:0;
            count += pass;
            System.out.printf("%-20s %-100s \n", course.getCourseId(), grade);

        }
        grad = (count > 7)? "yes": "no";
        printGradeAverage();

        System.out.printf("\nEligible for graduation? " + grad + "\n\n");
    }
    private boolean eligibleGrad()
    {
        int count = 0;
        for(Map.Entry<Course, Character> entry : transcript.entrySet()) {
            Course course = entry.getKey();
            Character grade = entry.getValue();
            int pass = (convertToGPA(grade) > 1) ? 1 : 0;
            count += pass;
        }
        return (count>7);
    }
    void printTranscript()
    {
        System.out.printf("Transcript reads as follows:\n");
        for(Map.Entry<Course, Character> entry : transcript.entrySet()) {
            Course course = entry.getKey();
            Character grade = entry.getValue();
            System.out.printf("%-20s %-100s \n", course.getCourseId(), grade );


        }
    }
    boolean getFull(){return (currentLoad < 2);}


}