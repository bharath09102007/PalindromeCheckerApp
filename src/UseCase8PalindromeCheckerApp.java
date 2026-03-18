class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class UseCase8PalindromeCheckerApp {

    // create linked list from string
    static Node createList(String word) {
        Node head = new Node(word.charAt(0));
        Node temp = head;

        for(int i = 1; i < word.length(); i++){
            temp.next = new Node(word.charAt(i));
            temp = temp.next;
        }

        return head;
    }

    // check palindrome using two pointers
    static boolean isPalindrome(String word){
        int start = 0;
        int end = word.length() - 1;

        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        Node head = createList(word); // linked list created

        if(isPalindrome(word)){
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}