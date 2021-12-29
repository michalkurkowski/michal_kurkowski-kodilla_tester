public class Grades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(2);
        grades.add(3);
        grades.add(3);
        grades.getAverage();
        grades.getLastGrade();
    }
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
        public void add (int value){
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public void getLastGrade() {
        System.out.println(grades[this.size - 1]);
    }
    public void getAverage () {
        int[] grades = {2, 3, 3};
        double sum = 0;
        int quantity = this.size;
        for (int i = 0; i < this.size; i++) {
            sum += grades[i];
        }
        double average = sum / quantity;
        System.out.println(average);
    }
}
