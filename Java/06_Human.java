public abstract class Human {

    private String firstName;
    private String lastName;
    private int workingHours = 0;

    public Human(String firstName) {
        this.firstName = firstName; }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName; }

    abstract int calculateDailyWage();

    public int calculateSalary(){
        return 22 * calculateDailyWage();
    }
public class Student extends Human {
    private int facNum;

    public Student(String firstName, int facNum) {
        super(firstName);
        this.facNum = facNum;
        setWorkingHours(4);
    }

    public int getFacultyNumber() {
        return facNum;
    }

    public void setFacultyNumber(int facNum) {
        this.facNum = facNum;
    }

    @Override
    public int calculateDailyWage() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return facNum == student.facNum;
    }
}


public class Worker extends Human {
    public Worker(String firstName) {
        super(firstName);
        setWorkingHours(8);
    }

    @Override
    public int calculateDailyWage() {
       
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Моника", 520052);
        Student student2 = new Student("Венцислав", 520054);

        Worker worker1 = new Worker("Аделина");
        Worker worker2 = new Worker("Мариян");

        if (student1.equals(student2)) {
            System.out.println("Двамата студенти еднакъв факултетен номер");
        } else {
            System.out.println("Студентите имат различни факултетни номера");
        }

        int worker1Salary = worker1.calculateSalary();
        int worker2Salary = worker2.calculateSalary();

        System.out.println("Заплата на първи: " + worker1Salary);
        System.out.println("Заплата на втори: " + worker2Salary);
    }
}

    
