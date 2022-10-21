public class Main {
    public static void main(String[] args) {

        // Student Information input
        System.out.println("\n");

        Student student = new Student();
        student.Name = "Md.Karim";
        student.Roll=10;
        student.Reg=1500974233;

        // Student Information Output
        System.out.println("<----*Student Information*---->");
        System.out.println("Student Name : "+student.Name);
        System.out.println("Student Roll Number :"+student.Roll);
        System.out.println("Student Registration Number : "+student.Reg);
        student.inputresult("Out of 4.00 G.P.A :"+"3.80");
        System.out.println(student.checkresult());
        System.out.println("\n");

        // Teacher Information input
        System.out.println("<----*Teacher Information*---->");
        Teacher teacher = new Teacher();
        teacher.Name = "Md Najmul Hasan";
        System.out.println(teacher.Name);
        teacher.Educational_qualification ="B.S.C and M.S.C in";
        System.out.println(teacher.Educational_qualification);
        System.out.println("Bangladesh University of Engineering and Technology (BUET)");
        teacher.getnumber("017******49");
        System.out.println(teacher.setnumber());
        System.out.println("\n");

        // Parents Information

        System.out.println("<----*Parents Information*---->");
        parents parents = new parents();
        parents.Name = "MD Shahidullah";
        parents.Mother_name = "Khursheda Begum";
        System.out.println(parents.Name);
        System.out.println(parents.Mother_name);
        parents.Father_number ="016******89";
        parents.Mother_number ="016******79";
        System.out.println(parents.Father_number);
        System.out.println(parents.Mother_number);


    }
}