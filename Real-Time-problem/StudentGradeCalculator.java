class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    String grade() {
        if(marks >= 90) return "A";
        else if(marks >= 75) return "B";
        else if(marks >= 60) return "C";
        else return "D";
    }
}

public class GradeCheck {
    public static void main(String[] args) {
        Student s = new Student("Rashi", 72);
        System.out.println(s.name + " Grade: " + s.grade());
    }
}
