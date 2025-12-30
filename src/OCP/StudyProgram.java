package OCP;

import OCP.clean.Algorithms;
import OCP.clean.Course;
import OCP.clean.DataStructures;
import OCP.clean.Programming;

public class StudyProgram {
    public static void main(String[] args) {
        System.out.println("=== Dirty OCP Study Program Example ===");
        OCP.dirty.StudyProgram DirtyProgram = new OCP.dirty.StudyProgram();
        DirtyProgram.showCourseDetails("DataStructures");
        DirtyProgram.showCourseDetails("Algorithms");
        DirtyProgram.showCourseDetails("Programming");

        System.out.println("=== Clean OCP Study Program Example ===");
        OCP.clean.StudyProgram CleanProgram = new OCP.clean.StudyProgram();
        Course ds = new DataStructures();
        Course algo = new Algorithms();
        Course prog = new Programming();
        CleanProgram.showCourseDetails(ds);
        CleanProgram.showCourseDetails(algo);
        CleanProgram.showCourseDetails(prog);
    }
}
