public class NumericAnswer extends Question {
    public NumericAnswer(String prompt, double correct_answer) {
        super(prompt,String.valueOf(correct_answer));
    }
    // doesent really require any new implementation, just converting the correct answer to a string which is done in constructor.
}
