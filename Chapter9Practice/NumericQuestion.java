

/**
 * Write a description of class NumericQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumericQuestion extends Question
{
    private double answer;
    public NumericQuestion()
    {
        
    }
    
    public void setAnswer(double correctResponse)
    {
        answer = correctResponse;
    }
    
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble(response);
        return Math.abs(reponseAsDouble - answer) <= 0.01;
    }
}
