//Started 10:29 pm
//Ended

import java.util.*;

public class OmmitNoneMatchingBraces {
    private static final Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence;
        System.out.println("Enter sentence with brackets ex. big poppa (Ramzi)");
        sentence = kb.next();
        ommitUnmatchedBraces(sentence);
    }

    private static String ommitUnmatchedBraces(String text) {
        String newText = "";
        int openBraces = 0;
        int closingBraces = 0;
        ArrayList<Integer> locationOfClosingBrace = new ArrayList<>();
        ArrayList<Integer> locationOfOpenBrace = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ')') {
                closingBraces++;
                locationOfClosingBrace.add(i);
            }
            if (text.charAt(i) == '(') {
                openBraces++;
                locationOfOpenBrace.add(i);
            }
        }
        if (openBraces == closingBraces) {
            for (int i=0; i<=locationOfClosingBrace.size();i++){
                if((locationOfClosingBrace.get(i) > locationOfOpenBrace.get(i))){
                    for (int j = 0; j <= locationOfOpenBrace.get(i);j++){
                       if() {
                           newText += text.charAt(j);
                       }
                    }
                }
            }
        }
        return text;
    }
}
