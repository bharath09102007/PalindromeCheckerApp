import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // insert characters
        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // compare front and rear
        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}