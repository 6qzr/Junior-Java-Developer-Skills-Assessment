public class GradeManager {
    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {
    // Reverse each individual name (like "John" becomes "nhoJ")
    // Keep the array order the same
    // Return the modified array
        for (int i = 0; i < names.length; i++) {
            String reversedStudentName = "";
            for (int j = names[i].length() - 1; j >= 0; j--) {
                reversedStudentName += names[i].charAt(j);
            }
            names[i] = reversedStudentName;
        }
        return names;
    }
    // Method to calculate letter grades
    public static char getLetterGrade(int score) {
        // Use if-else conditions:
        // 90-100: 'A', 80-89: 'B', 70-79: 'C', 60-69: 'D', below 60: 'F'
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    // Method to find students who need to retake exam
    public static String[] findFailingStudents(String[] names, int[] scores) {
        // Return array of names where score is below 60
        // Use loops to check each student
        String[] failingStudentNames = new String[names.length];
        for (int studentNo = 0;  studentNo < names.length; studentNo++) {
            if (scores[studentNo] < 60) {
                failingStudentNames[studentNo] = names[studentNo];
            }
        }
        return failingStudentNames;
    }
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};
        // Test all your methods
        // Display results clearly

        // 1. Reverse student names
        String[] reversedNames = reverseStudentNames(students.clone()); // use clone to avoid modifying original
        System.out.println("Reversed Names:");
        for (String name : reversedNames) {
            System.out.println("- " + name);
        }

        // 2. Display letter grades
        System.out.println("\nLetter Grades:");
        for (int i = 0; i < students.length; i++) {
            char grade = getLetterGrade(scores[i]);
            System.out.println(students[i] + ": " + scores[i] + " => " + grade);
        }

        // 3. Show failing students
        System.out.println("\nStudents who need to retake the exam:");
        String[] failing = findFailingStudents(students, scores);
        for (String name : failing) {
            if (name != null) { // skip empty entries
                System.out.println("- " + name);
            }
        }
    }
}