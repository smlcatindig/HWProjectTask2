package HWProjectTask2;

public class MarksTester {

        public static void main(String[] args) {
            Marks[] marks = {new A(90.5, 88.6, 95.3), new B(89.6, 98.4, 91.5, 87.3)};
            for (Marks mark : marks) {
                System.out.println(mark.getPercentage());
            }

        }

    }
