package Lesson5;

public class Test20 {

    int summa(int a, int b, int c) {
        return a+b+c;
    }

    int average(int a1, int b1, int c1) {
        return summa(a1,b1,c1)/3;
    }

}

class Test21 {

    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrechCihsel = t.summa(1, 2 , 3);
        System.out.println(summaTrechCihsel);
        System.out.println(t.average(20, 40, 60));
    }
}
