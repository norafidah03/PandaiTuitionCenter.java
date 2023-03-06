
public class Main
{
    // APPLICATION CODE
    public static void main(String[] args) {
        TuitionCenter tuiCenter1 = new TuitionCenter();
        tuiCenter1.enterTuitionCenterDetails();

        // Example: Tuition Center1 currently has 3 tutors (this may change from time to time)
        Tutor tutor1 = new Tutor();
        Tutor tutor2 = new Tutor();
        Tutor tutor3 = new Tutor();
        tuiCenter1.addTutor(tutor1);
        tuiCenter1.addTutor(tutor2);
        tuiCenter1.addTutor(tutor3);
        int totalTutors = tuiCenter1.getTotalTutors();
        System.out.println("Total number of active tutors: " + totalTutors);
        System.out.println("\n");

        // ASSIGNING STUDENTS TO THEIR RESPECTIVE TUTORS
        Student student1 = new Student();
        Student student2 = new Student();
        tutor1.addStudent(student1);
        tutor1.addStudent(student2);

        Student student3 = new Student();
        Student student4 = new Student();
        tutor2.addStudent(student3);
        tutor2.addStudent(student4);

        Student student5 = new Student();
        Student student6 = new Student();
        tutor3.addStudent(student5);
        tutor3.addStudent(student6);

        // CALCULATING TOTAL NUMBER OF STUDENTS IN THE TUITION CENTER
        int totalStudents = tutor1.getTotalStudents() + tutor2.getTotalStudents() + tutor3.getTotalStudents();
        System.out.println("Total number of active students: " + totalStudents);
        System.out.println("\n");

        // ENTERING SCORES OF EACH STUDENT
        System.out.println("Enter Student #1's Scores: ");
        float[] student1Scores = student1.enterStudentScores();
        System.out.println("Enter Student #2's Scores: ");
        float[] student2Scores = student2.enterStudentScores();
        System.out.println("Enter Student #3's Scores: ");
        float[] student3Scores = student3.enterStudentScores();
        System.out.println("Enter Student #4's Scores: ");
        float[] student4Scores = student4.enterStudentScores();
        System.out.println("Enter Student #5's Scores: ");
        float[] student5Scores = student5.enterStudentScores();
        System.out.println("Enter Student #6's Scores: ");
        float[] student6Scores = student6.enterStudentScores();

        student1.setStudentScores(student1Scores);
        student2.setStudentScores(student2Scores);
        student3.setStudentScores(student3Scores);
        student4.setStudentScores(student4Scores);
        student5.setStudentScores(student5Scores);
        student6.setStudentScores(student6Scores);

        // CALCULATING THE AVERAGE SCORES OF ALL STUDENTS IN THE CENTER
        float avg = (student1.calcAvg() + student2.calcAvg() + student3.calcAvg() + student4.calcAvg()
                    + student5.calcAvg() + student6.calcAvg()) / totalStudents;

        // GETTING THE LOWEST SCORE AMONG ALL STUDENTS IN THE CENTER
        float min = Math.min(Math.min(Math.min(Math.min(Math.min(student1.getMinScores(), student2.getMinScores()),
                    student3.getMinScores()), student4.getMinScores()), student5.getMinScores()), student6.getMinScores());

        // GETTING THE HIGHEST SCORE AMONG ALL STUDENTS IN THE CENTER
        float max = Math.max(Math.max(Math.max(Math.max(Math.max(student1.getMaxScores(), student2.getMaxScores()),
                    student3.getMaxScores()), student4.getMaxScores()), student5.getMaxScores()), student6.getMaxScores());

        System.out.println("----------------Tuition Center's Performance Report----------------");
        System.out.println("Average Scores: " + String.format("%.2f", avg));
        System.out.println("Minimum Score: " + String.format("%.2f", min));
        System.out.println("Maximum Score: " + String.format("%.2f", max));
    }
}
