public class LetterDay {
    private String letter;
    private Block[] blocks;

    public LetterDay(String theLetter, Block[] theBlocks) {
        letter = theLetter;
        blocks = theBlocks;
    }

    public Block[] getBlocks() {
        return blocks;
    }
}
