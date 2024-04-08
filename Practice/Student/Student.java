package Practice.Student;

class Student {
    int rno;
    String name;
    double marks;

    Student(int rno, String name, double marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    public int getRno() { return rno; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    public void setRno() { this.rno = rno; }
    public void setName() { this.name = name; }
    public void setMarks() { this.marks = marks; }
}
