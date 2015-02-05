import java.util.Scanner;
public class FillInQuestion extends Question
{
    // specified question: "The inventot of Java was _James Gosling_"
    // parse the specifed question into a question to display and 
    // an answer to check:
    // question: "The inventor of java was _______"
    // answer: "James Gosling"
    
    public FillInQuestion()
    {
        
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "______" + parser.next();
        super.setText(question);
        super.setAnswer(answer);
    }
}
