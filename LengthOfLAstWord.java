public class LengthOfLAstWord {
    public static int LengthOfLastWord(String sentence) {
        int wordCount = 0;

        String space = sentence.trim().replace("  ", " ");

        String[] SpliteStringArray = space.split(" ");

        wordCount = SpliteStringArray[SpliteStringArray.length - 1].length();

        return wordCount;
    }

    public static void main(String[] args) {
        String Sentence = "VPtCBexbhyOqEHWMpF  VJOZpC";
        int Length = LengthOfLastWord(Sentence);
        System.out.println(Length);
    }
}
