package Lesson4;

public class Student {
    int student_id;
    double math_avg;
    double econ_avg;
    double foreign_lan;
    String name;
    String lastName;
    String year;

    double average(double a , double b, double c){
        return  (a + b + c) / 3;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student nurkharl = new Student();
        Student saranego = new Student();
        Student orgratig = new Student();
        nurkharl.math_avg = 5.0;
        nurkharl.econ_avg = 5.0;
        nurkharl.foreign_lan =4.5;

        saranego.math_avg = 2.5;
        saranego.econ_avg = 3.0;
        saranego.foreign_lan =4.3;

        orgratig.math_avg = 3.6;
        orgratig.econ_avg = 3.1;
        orgratig.foreign_lan =5.0;

        System.out.print("Arlan :");
        System.out.println(nurkharl.average(nurkharl.math_avg, nurkharl.econ_avg, nurkharl.foreign_lan));

        System.out.print("Egor: ");
        System.out.println(saranego.average(saranego.math_avg, saranego.foreign_lan, saranego.econ_avg));

        System.out.print("Tigran: ");
        System.out.println(orgratig.average(orgratig.math_avg, orgratig.foreign_lan, orgratig.econ_avg));
    }
}