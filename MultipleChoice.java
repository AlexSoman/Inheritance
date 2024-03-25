public class MultipleChoice extends Question {
    // user_answer and correct_answer are indexes that point to certain elements in an array called choices
    String[] choices;
    public MultipleChoice(String prompt, int correct_answer_index; String[] choices) {
       super(prompt,choices[correct_answer_index]);
       this.choices = choices;
    }
    public void displayChoices() {
        for(int i = 0; i < choices.length;i++) {
            System.out.println(""+i+". "+choices[i]);
        }
    }
    public boolean check_answer() {
        is_correct = correct_answer.equals(choices[Integer.parseInt(user_answer)]);
        return is_correct;
    }
}
