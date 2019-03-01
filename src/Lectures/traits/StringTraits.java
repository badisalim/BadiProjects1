package Lectures.traits;

import java.util.Arrays;

public class StringTraits {

    public static void main(String[] args) {
        String nacs = "New Austrian Coding School";
        if (!nacs.isEmpty()) {
            System.out.println("Nacs is not empty");
        }

        String upperCase = nacs.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = nacs.toLowerCase();
        System.out.println(lowerCase);

        if (!nacs.equals("new austrian coding school")) {
            System.out.println("It is not equal because of the uppercase");
        }

        if (nacs.equalsIgnoreCase("new austrian coding school")) {
            System.out.println("Is equal because we ignore the uppercase");
        }

        String nas = nacs.replaceAll("Coding", "");
        System.out.println(nas);

        if (nacs.startsWith("New")) {
            System.out.println("It starts with New");
        }
        if (nacs.contains("Coding")) {
            System.out.println("It contains Coding");
        }
        if (nacs.endsWith("School")) {
            System.out.println("It ends with School");
        }

        int length = nacs.length();
        System.out.println(length);

        // Pay attention, different than robocode
        // substring(begin, end)
        // it begins exactly at begin and ends one number before end, so at end-1
        String school = nacs.substring(20, 26);
        System.out.println(school);

        String[] words = nacs.split(" ");
        System.out.println(Arrays.asList(words));

        String withSpacesAround = "   some spaces before and after   ";
        System.out.println(withSpacesAround);
        String withoutSpacesAround = withSpacesAround.trim();
        System.out.println(withoutSpacesAround);

        String substring = "Quiz time".substring(3, 7);
        System.out.println(substring);

        String substring2 = "Hey there!".substring(1, 3);
        System.out.println(substring2);

        String quote = "The lips of wisdom are closed, except to the ears of Understanding";
        boolean wisdomMatches = quote.matches(".*wisdom.*");

        System.out.println("Wisdom is in that sentence. Result is: " + wisdomMatches);
        boolean wisdomOfDoesNotMatch = quote.matches(".*wisdom of.*");
        System.out.println("'Wisdom of' is not in that sentence. Result is: " + wisdomOfDoesNotMatch);

        String a = "a";
        String d = "d";
        boolean aMatches = a.matches("[abc]");
        boolean dDoesNotMatch = d.matches("[abc]");
        System.out.println("Letter a is in [abc]. Result is: " + aMatches);
        System.out.println("Letter d is not in [abc]. Result is: " + dDoesNotMatch);
    }

}
