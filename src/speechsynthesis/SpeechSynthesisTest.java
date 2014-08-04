package speechsynthesis;
public class SpeechSynthesisTest
{

    public static void main(String[] args)
    {
    	
    	Voice voiceKevin16 = new Voice("kevin16");

        String[] thingsToSay = new String[]
        {
        	"hello"
        };

        voiceKevin16.say(thingsToSay);
    }
}