class Student {
    String name;
    int[] marks;

 Student (String n, int[] m) {
        name = n;
        marks = m;
    }

    int totalMarks() {
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return sum;
    }

    double  percentage() {
        return (totalMarks() / 300) * 100;
    }
}

public class Number1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Vansh", new int[]{85, 92, 78});
        students[1] = new Student("Vikas", new int[]{80, 78, 90});
        students[2] = new Student("Vishnu", new int[]{90, 92, 95});
        students[3] = new Student("Vishal", new int[]{86, 90, 89});
        students[4] = new Student("Yash", new int[]{95, 75, 89});

        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].name + " " + students[i].totalMarks() + " " + students[i].percentage());
        }
    }
}