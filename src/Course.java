public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int performance;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Process Succesful!");
        } else {
            System.out.println(t.name + " Academician can not teach this lesson!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " Lessons' Academician : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " Couldn't assign  an Academician to your lesson!");
        }
    }
}
