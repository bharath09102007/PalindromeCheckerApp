public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        // reverse string
        for(int i = word.length() - 1; i >= 0; i--){
            reversed = reversed + word.charAt(i);
        }

        // check palindrome
        if(word.equals(reversed)){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}