public class Student {
    String name,studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String studentNo, Course math,Course physics,Course chemistry) {
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }

    }

    public void addPerformanceNote(int math, int physics, int chemistry) {

        if (math >= 0 && math <= 100) {
            this.math.performance = math;
        }

        if (physics >= 0 && physics <= 100) {
            this.physics.performance = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.performance = chemistry;
        }

    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0 ||
            this.math.performance == 0|| this.physics.performance == 0 || this.chemistry.performance == 0) {

            System.out.println("Not all grades entered!");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed! ");
            } else {
                System.out.println("Failed!");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.physics.note + this.chemistry.note + this.math.note) * 4 ) / 15) 
        + ((this.physics.performance + this.chemistry.performance + this.math.performance) / 15);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math Grade (Note : Performance) : " + this.math.note+ " : " + this.math.performance);
        System.out.println("Physics Grade (Note : Performance) : " + this.physics.note+ " : " + this.physics.performance);
        System.out.println("chemistry Grade (Note : Performance) : " + this.chemistry.note + " : " + this.chemistry.performance);
    }

}
