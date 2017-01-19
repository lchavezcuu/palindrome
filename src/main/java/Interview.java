import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 18/01/17.
 */
public class Interview {
    /* Determinate if the word is a palindrome
     * could include any symbol, include spaces and numbers*/

    /* Complexity O(n) --> Not so bad but it could be better
     * This solution is based on what Antonio was telling me during the interview,
     * sadly I hadn't time to finish it on time */

    public static boolean isPalindrome(String word){
        //If the input is empty or null
        if (word == null || word.isEmpty()){
            System.out.println("The input is empty or null!");
            return false;
        }

        word=word.toLowerCase();
        char [] wordArray= word.toCharArray();
        List<Character> myList=new ArrayList<Character>();

        //Only letters
        for (char character: wordArray) {
            if(Character.isLetter(character)){//Following the idea of Antonio, use "isLetter"
                myList.add(character);
            }
        }

        //If there is not letters on the input --> I didn't think this if(consequence of unit test)
        if(myList.isEmpty()){
            System.out.println("The input doesn't include letters");
            return false;
        }

        //Following the idea of Antonio (get the size of the list out of the for loop)
        int listSize=myList.size();
        for(int i=0; i<listSize; i++){
            if(myList.get(i) != myList.get(listSize-1-i)){
                System.out.println("NOT A PALINDROME");
                return false;
            }
        }
        System.out.println("PALINDROME!");
        return true;
    }

    /* CONCLUSION
    * Not the best solution, but that was my idea (final idea) during the interview,
    * at this moment I know a couple of better solutions (I haven't implemented them yet)
    * but it was after investigate.
    * Thanks for the help during the interview (Y) */
}
