public class UseCase9PalindromeCheckerApp {

    // recursive function
    static boolean checkPalindrome(String word, int start, int end){

        // base condition
        if(start >= end){
            return true;
        }

        // mismatch condition
        if(word.charAt(start) != word.charAt(end)){
            return false;
        }

        // recursive call
        return checkPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        if(checkPalindrome(word, 0, word.length() - 1)){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}