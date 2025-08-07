public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mang Ben", 35, "BSIT", 90, 90, 90);
        Student student2 = new Student("Omar Ben", 25, "BSIT", 95, 95, 95);
        Student student3 = new Student("Omar Lat", 21, "BSIT", 60, 60, 60);

        int passingCount = 0;


        System.out.println("=========================================");
        student1.displayInfo();
        double avg1 = student1.calculateAverage();
        System.out.println("Average: " + avg1);
        String grade1 = student1.getLetterGrade();
        System.out.println("Letter Grade: " + grade1);
        boolean pass1 = student1.isPassing();
        if (pass1) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }


        System.out.println("=========================================");
        student2.displayInfo();
        double avg2 = student2.calculateAverage();
        System.out.println("Average: " + avg2);
        String grade2 = student2.getLetterGrade();
        System.out.println("Letter Grade: " + grade2);
        boolean pass2 = student2.isPassing();
        if (pass2) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }


        System.out.println("=========================================");
        student3.displayInfo();
        double avg3 = student3.calculateAverage();
        System.out.println("Average: " + avg3);
        String grade3 = student3.getLetterGrade();
        System.out.println("Letter Grade: " + grade3);
        boolean pass3 = student3.isPassing();
        if (pass3) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }

        System.out.println("=========================================");
        System.out.println("Summary: " + passingCount + " out of 3 students are passing.");
    }
}