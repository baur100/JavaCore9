package interviewFL;

public class App5ReverseSentence {
    public static void main(String[] args) {
        final String sentence = "Today is a great day";
        reverseSentence(sentence);
    }

    private static void reverseSentence(String sentence) {
        var words=sentence.split(" ");
        var reverse = "";
        for (int i=words.length-1;i>=0; i--){
            reverse+=words[i]+" ";
        }
        System.out.println(reverse);
    }
}
