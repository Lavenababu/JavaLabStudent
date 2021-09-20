public class Student {
    double dsa;
    double dbms;
    double math;
    double pcpf;
    double pcom;

}
class StudentAverage{
    public static void main(String[] args) {

        Student a = new Student();
        Student b = new Student();

        double average1,average2;

        a.dsa = 88;
        a.dbms = 85;
        a.math = 93;
        a.pcpf = 77;
        a.pcom = 89;

        b.dsa = 92;
        b.dbms = 90;
        b.math = 75;
        b.pcpf = 82;
        b.pcom = 88;

        average1 = (a.dsa + a.dbms + a.math + a.pcpf + a.pcom)/5;
        average2 = (b.dsa + b.dbms + b.math + b.pcpf + b.pcom)/5;

        System.out.println("Average 1 : " +average1);
        System.out.println("Average 2 : " +average2);
    }
}
