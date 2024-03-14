package basic.class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학새1", "학새2"};
        int[] studentAges = {15, 16};
        int[] studentGrade = {90, 80};

        Student m = new Student();
        m.name = "m";
        m.age = 1;
        m.grade = 1;

        Student s = new Student();
        s.name = "s";
        s.age = 1;
        s.grade = 1;

//        Student[] studentList = new Student[2];
//        studentList[0] = m;
//        studentList[1] = s;

        Student[] studentList = new Student[]{ m, s };




        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].name);
        }

    }
}
