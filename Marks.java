package HWProjectTask2;

/* We have to calculate the average of marks obtained in three subjects by student A and by student B.
   Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
   Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
   three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
    */
public abstract class Marks {
    double englishSubject;
    double mathSubject;
    double historySubject;

    Marks(double englishSubject, double mathSubject, double historySubject){
        this.englishSubject=englishSubject;
        this.mathSubject=mathSubject;
        this.historySubject=historySubject;
    }
    public abstract double getPercentage();
}
class A extends Marks {

    A(double englishSubject, double mathSubject, double historySubject) {
        super(englishSubject, mathSubject, historySubject);
    }

    public double getPercentage() {
        System.out.println("Average grade of student A: " );
        return (englishSubject + mathSubject + historySubject) / 3;

    }
}
class B extends Marks {
    double scienceSubject;

    B(double englishSubject, double mathSubject, double historySubject, double scienceSubject) {
        super(englishSubject, mathSubject, historySubject);
        this.scienceSubject = scienceSubject;
    }


    @Override
    public double getPercentage() {
        System.out.println("Average grade of student B: ");
        return (englishSubject + mathSubject + historySubject + scienceSubject) / 4;
    }
}




