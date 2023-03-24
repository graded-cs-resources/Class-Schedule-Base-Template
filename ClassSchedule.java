public class ClassSchedule {

    private Period[] periods = new Period[4];
    private Course[] courses = new Course[8];
    private Block[] blocks = new Block[8];
    private LetterDay[] letterdays = new LetterDay[10];

    /**
     * Beginning of the program
     */
    public void start() {
        
    }

    public static void main(String[] args) {
        ClassSchedule schedule = new ClassSchedule();
        schedule.start();
    }
}