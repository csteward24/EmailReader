package speechsynthesis;
public class SpeechSynthesisTest
{
    public static void main(String[] args)
    {
        Voice voiceKevin16 = new Voice("kevin16");

        String[] thingsToSay = new String[]
        {
            "hi everybody",
            "my name is kevin sixteen",
            "my voice is built into free t t s",
            "but it isn't very mellifluous",
            "it could be worse, though",
            "every time my friend alan tries to talk",
            "about anything more exciting than what time it is",
            "he barfs up a bunch of exceptions",
            "and passes out",
        };

        voiceKevin16.say(thingsToSay);
    }
}