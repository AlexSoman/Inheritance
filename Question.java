public class Question
{
    String prompt;
    String correct_answer;
    String user_answer;
    boolean is_correct;
    public Question(String prompt, String correct_answer) {
       this.prompt = prompt; 
       this.correct_answer = correct_answer;
       user_answer = "";
       is_correct = false;
    }
    public void get_user(String user_answer) {
        this.user_answer = user_answer;
    }
    public String display_prompt() {
        System.out.println(prompt);
    }
    public boolean check_answer() {
        is_correct = correct_answer.equals(user_answer);
        return is_correct
    }
    
    
}
