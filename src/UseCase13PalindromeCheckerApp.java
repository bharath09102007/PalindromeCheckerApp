public class UseCase13PalindromeCheckerApp {

    // Reverse method
    static boolean reverseMethod(String word) {
        String reversed = "";
        for(int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Two pointer method
    static boolean twoPointerMethod(String word) {
        int start = 0, end = word.length() - 1;

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

        long startTime, endTime;

        // Reverse method timing
        startTime = System.nanoTime();
        reverseMethod(word);
        endTime = System.nanoTime();
        System.out.println("Reverse Method Time: " + (endTime - startTime) + " ns");

        // Two pointer timing
        startTime = System.nanoTime();
        twoPointerMethod(word);
        endTime = System.nanoTime();
        System.out.println("Two Pointer Method Time: " + (endTime - startTime) + " ns");
    }
}