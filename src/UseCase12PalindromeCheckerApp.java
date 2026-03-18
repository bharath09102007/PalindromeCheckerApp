import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                return false;
            }
        }

        return true;
    }
}

// Main Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // choose strategy
        PalindromeStrategy strategy = new StackStrategy();
        //PalindromeStrategy strategy = new DequeStrategy();

        if(strategy.check(word)){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}