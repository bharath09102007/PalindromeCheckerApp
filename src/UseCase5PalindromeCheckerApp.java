import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        Stack<Character> stack = new Stack<>();

        // push characters
        for(char c : word.toCharArray()){
            stack.push(c);
        }

        String reversed = "";

        // pop characters
        while(!stack.isEmpty()){
            reversed = reversed + stack.pop();
        }

        // check palindrome
        if(word.equals(reversed)){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}