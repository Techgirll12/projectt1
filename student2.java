public class student2 {
    static int TotalStudents;
    String StudName;

    static {
        TotalStudents = 50;
    }

    public student2(String studName) {
        this.StudName = studName;
        System.out.println("studName is" + " " + studName);
    }

    public static int getTotalStudents() {
        return TotalStudents;
    }

    public String getStudName() {
        return StudName;
    }

    public static void main(String[] args) {

        student2 stud1 = new student2("halima");
        System.out.println("TotalStudents after stud1: " + student2.getTotalStudents());
        System.out.println(getTotalStudents());
    }
}

