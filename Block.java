public class Block {
    private Course course;
    private int blockNumber;

    public Block(int num, Course c) {
        course = c;
        blockNumber = num;
    }

    public String toString() {
        return "Block " + blockNumber + ": " + course;
    }
}
