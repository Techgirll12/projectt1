public class student {
    String studentName;
    int studentregNumber;

    {
        studentName="hamdi";
        studentregNumber=12/33/666;
        System.out.println("studentName from IIB" +" " + studentName);
        System.out.println("studentregNumber from IIB " +" " + studentregNumber);
    }
    public student(String SN, int SR) {
        this.studentName = SN;
        this.studentregNumber = SR;

        System.out.println("studentName from Constructor" + " " + studentName);
        System.out.println("studentregNumber from Constructor" + " " + studentregNumber);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentregNumber() {
        return studentregNumber;
    }
    public static void main(String[]args){
        student stud1 = new student("hamda", 12/33/666);
        System.out.println("studentName is" +stud1.studentName);
    }
}

