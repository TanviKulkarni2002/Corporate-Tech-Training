import java.util.Scanner;

public class ParagraphSearcherReplacer{

    Scanner sc = new Scanner(System.in); //To take input
    private String findingWord;
    private String replacingWord;
    private String paragraph;
    public static void main(String[] args) {
        ParagraphSearcherReplacer psr = new ParagraphSearcherReplacer();
        psr.paragraphInput();
        psr.wordToFind();
        psr.wordtoReplaceWith();
        String updatedString = psr.performUpdations();
        System.out.println("Updated String: "+updatedString);
        psr.closeScanner();
    }

    public void wordToFind(){
        //Take word to look for in paragraph: input from user
        System.out.println("Enter the word to look for: ");
        findingWord = sc.next();
        findingWord=findingWord.toLowerCase(); //handles case-sensitivity
    }
    public void wordtoReplaceWith(){
        //Take word to repleace the found word: input from user
        System.out.println("Enter the word to replace it with: ");
        replacingWord = sc.next();
        replacingWord=replacingWord.toLowerCase(); //handles case-sensitivity
    }

    public void paragraphInput(){
        //Take paragraph input from user
        System.out.println("Enter your paragraph: ");
        paragraph = sc.nextLine();
        paragraph=paragraph.toLowerCase(); //handles case-sensitivity
    }

    public String performUpdations(){
        String updatedString = paragraph.replaceAll("\\b" + findingWord + "\\b", replacingWord);
        updatedString=updatedString.toLowerCase(); //handles case-sensitivity
        return updatedString;
    }

    public void closeScanner(){
        //close the scanner
        sc.close();
    }
}