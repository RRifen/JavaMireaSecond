package Prac7.Facade;

public class Worker {
    public String reBuild(String string) {
        Character[] chars = new Character[20];

        for(int i = 1; i < string.length() - 1; i++) {
            chars[i] = (char)(string.charAt(i) + 1);
        }

        chars[0] = '|';
        chars[string.length() - 1] = '|';

        StringBuilder resultString = new StringBuilder();

        for(int i = 0; i < string.length(); i++) {
            resultString.append(chars[i]);
        }

        return resultString.toString();
    }
}
