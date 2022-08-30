package baitap1;

public class Main {
    private static ClassStudents classStudents;
    public static final String[] in=new String[]{"C3455H","dffre334","A062211H"};

    public static void main(String[] args) {
        classStudents =new ClassStudents();
        for (String out:in) {
            boolean is=classStudents.validate(out);
            System.out.println(out+is);
        }
    }
}
