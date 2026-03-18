import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // insert into queue and stack
        for(char c : word.toCharArray()){
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        // compare queue (front) with stack (top)
        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
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