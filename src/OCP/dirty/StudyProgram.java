package OCP.dirty;

public class StudyProgram {

    public void showCourseDetails(String courseName) {
        if (courseName.equalsIgnoreCase("DataStructures")) {
            System.out.println("DataStructures: Arrays, Linked Lists, Trees, Graphs");
        } else if (courseName.equalsIgnoreCase("Algorithms")) {
            System.out.println("Algorithms: Sorting, Searching, Dynamic Programming");
        } else if (courseName.equalsIgnoreCase("Programming")) {
            System.out.println("Programming: Java, Python, C++");
        } else {
            System.out.println(courseName + ": Details not available");
        }
    }
}