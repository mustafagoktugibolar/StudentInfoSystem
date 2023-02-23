public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematic", "MATH101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher t1 = new Teacher("Ali", "90550000000", "MAT");
        Teacher t2 = new Teacher("Lutfi", "90550000001", "PHY");
        Teacher t3 = new Teacher("Nese", "90550000002", "CHEM");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Dilara", 4, "140144015", math, physics, chemistry);
        s1.addBulkExamNote(50,20,40);
        s1.addPerformanceNote(80, 80, 80);
        s1.isPass();

        Student s2 = new Student("Ece", 4, "2211133", math, physics, chemistry);
        s2.addPerformanceNote(80, 80, 80);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Duru", 4, "221121312", math, physics, chemistry);
        s3.addBulkExamNote(50,20,40);
        s3.addPerformanceNote(80, 80, 80);
        s3.isPass();
    }
}
