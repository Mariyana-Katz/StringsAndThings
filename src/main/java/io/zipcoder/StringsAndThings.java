package io.zipcoder;


import java.util.ArrayList;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */

    public Integer countYZ(String input){
        int count = 0;
        String [] array = input.split(" ");//separate the words with space.
        for(String word: array){
            if (word.charAt(word.length() -1) == 'z' || word.charAt(word.length() -1) == 'y'){//going trougth each word and checking for z or y in the end
                count++;//count them
            }
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
       //I made a new string named it base1 and then I call the replace method in the () I put remove(the second par and then replaced it with empty string.
        String base1 = base.replace(remove, "");

        return base1;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        //Declaring two counters.
        int isCounter = 0;
        int notCounter = 0;
        //making a for loop to run trought the string.Then checking for 'i' and 's'(using i+1 because is next to the 'i'.
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
                isCounter++;
            }
        }
        //Then another for loop for checking for char 'n', 'o', 't'. And here the length is 22, otherwise will not be able to finish the "not"
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't') {
                notCounter++;
            }
        }
            //Checking if both counters are equal.
        if (isCounter == notCounter)
            return true;
         else
            return false;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
   public Boolean gIsHappy(String input){
        for( int i = 0; i< input.length(); i++){
            if(input.charAt(i) == 'g'){
                if(input.charAt(i-1) =='g' || input.charAt(i+1)=='g'){
                    return true;}

                }
            }return false;

    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
   public Integer countTriple(String input) {
       //declaring counter and char(x)
        int counter = 0;
        char x;
       //making a for loop to run trougth the loop.
        for(int i = 0; i<input.length() -2; i++){
           //assigning a current char in a string.
            x = input.charAt(i);
          // Using a if statement to check for three equal char.
            if ( input.charAt(i + 1) == x && input.charAt(i + 2) == x) {
               counter ++;
            }

        }
        return counter;
    }
}
