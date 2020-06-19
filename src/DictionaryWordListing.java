import java.util.Arrays;
import java.util.Scanner;

public class DictionaryWordListing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        TESTS TESTS TESTS
//        String originalText = "kiwi pineapple apple banana orange grapes watermelon cherry strawberry melon"; // OG TEST STRING
//        String originalText = "dog cat bat animal else full true false nine igloo"; //FAILED full and false
//        String originalText = "ate apple book banana cooking crew dude doggo else eat "; //same letter test
//        String originalText = "kiwi p4neapple @pple banana orange, grapes watermelon cherry strawberry melon";
//        String originalText = "too few words test";
//        String originalText = "too many words test too many words test too many ELEVEN";
//        String originalText = "kiwi PINEAPPLE apple BANANA orange grapes WATERMELON CHERRY strawberry melon"; //ALPHA TEST
//----------------------------------------------------------------------------------------------------------------------


        //PROMPTING AND GETTING USER INPUT
        System.out.println("Enter ten words on a single line with a single space in between each word:");
        System.out.println("ex: uno dos tres cuatro cinco seis siete ocho nueve diez");
        String originalText = input.nextLine();

        //VERIFYING USER INPUT
        //check to make sure there are no special characters or numbers in the original string
        for (int i = 0; i < originalText.length(); i++) {

            if(Character.isWhitespace(originalText.charAt(i))){
                continue;
            } else if (originalText.charAt(i) < 65 || originalText.charAt(i) > 122){
                System.out.println("(Error): No numbers or special characters. please");
                System.out.println("Application quitting.");
                return;
            } else {
                continue;
            }

        }// for loop end
//        System.out.println("noNumscheck");                                                        //CHECK


        //cast string to lowerCase so cases wont matter when comparing
        String lowerCase = originalText.toLowerCase();
//        System.out.println("lowercaseCheck");                                                     //CHECK


        //get words into an array
        String [] words = lowerCase.split(" ");
//        System.out.println(Arrays.toString(words));
//        System.out.println("arraySplitCheck");                                                    //CHECK


        //check array length to make sure they entered the right amount of words
        if (words.length == 1){
            System.out.println("(Error): Too few words.");
            System.out.println("Type all ten words on one line before pressing enter");
            System.out.println("Application quitting");
            return;
        } else if (words.length < 10){
            System.out.println("(Error): Too few words.");
            System.out.println("You entered " + words.length + " words.");
            System.out.println("Application quitting");
            return;
        } else if (words.length > 10){
            System.out.println("(Error): Too many words.");
            System.out.println("You entered " + words.length + " words.");
            System.out.println("Application quitting");
            return;
        }
//        System.out.println("passedlength");                                                       //CHECK



        //ALPHABETIZING THE WORDS

        boolean isSorted = false;
        String temp;

        while (!isSorted) {
            isSorted = true; //will exit loop if no swaps are made
            for (int i = 0; i < words.length -1 ; i++) {
                for (int j = 0; j < words.length -1 -i; j++) {
                    if (words[i].charAt(0) > words[i+1].charAt(0)){
                        temp = words[i];
                        words[i] = words[i+1];
                        words[i+1] = temp;
                        isSorted = false;
                    }// swap


                }// j loop words exit

            } //i loop how many swaps exit
        }
//        System.out.println("exitBooleancheck");                                                   //CHECK





        //PRINTING RESULTS

        //print original order
        System.out.println("Original Order:");
        System.out.println(originalText);

        System.out.println();
        System.out.println();


        //print alphabetical order
        System.out.println("Alphabetical Order:");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        //print reversed order
        System.out.println("Reversed Alphabetical Order:");
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Application Finished");


    }
}











