package Lab9;

public class UnluckyException extends Exception
{
    public String excetptionMessage(){
        return "Error! Unlucky exception";
    }

    public String getAdvice(){
        return "Advice -> Don't divide by 13";
    }

}
