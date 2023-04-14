public class ClassSchedule {

    private Period[] periods = new Period[4];
    private Block[] blocks = new Block[8];
    private LetterDay[] letterdays = new LetterDay[10];

    /**
     * Beginning of the program
     */
    public void start() {
        createPeriods();
        createBlocks();
        createLetterDays();

        //String letter = promptForLetter();
        //boolean isWednesday = promptForWednesday();
        String letter = "A";
        boolean isWednesday = false;
        printSchedule(letter,isWednesday);
        
    }

    private void printSchedule(String letter, boolean isWednesday) {
        String firstPeriod = "";
        if (isWednesday) {
            firstPeriod += periods[0].getWedStart();
            firstPeriod += " -- ";
            firstPeriod += periods[0].getWedEnd();

        }else {
            firstPeriod += periods[0].getStartTime();
            firstPeriod += " -- ";
            firstPeriod += periods[0].getEndTime();
        }
        firstPeriod += " | ";
        // assume letter is a single capital letter
        int i = letter.compareTo("A");

        LetterDay today = letterdays[i];
        firstPeriod += today.getBlocks()[0];
        System.out.println(firstPeriod);

    }

    private void createPeriods() {
        //create periods;
        periods[0] = new Period(1, "8:30","9:50","8:30","9:45");
        // make remainder of periods
        periods[1] = new Period(2, "10:00","11:20","9:55","11:10");
    }

    private void createBlocks() {
        Course c;

        c = new Course("Intro to Programming","Grade 9/10","IC2");
        blocks[0] = new Block(1, c);

        c = new Course("Math 9","Grade 9","B2");
        blocks[1] = new Block(2, c);

        // make all other courses
    }

    private void createLetterDays() {
        Block[] b;
        
        // A day
        b = new Block[]{blocks[0],blocks[1],blocks[2],blocks[3]};
        letterdays[0] = new LetterDay("A",b);

    
        // B day


        // C day
        b = new Block[]{blocks[1],blocks[2],blocks[3],blocks[0]};
        letterdays[2] = new LetterDay("C",b);
    }

    public static void main(String[] args) {
        ClassSchedule schedule = new ClassSchedule();
        schedule.start();
    }
}