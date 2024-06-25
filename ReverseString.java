public class ReverseString {
    public static void main(String[] args) {
        String s = "Technical Discussion";
        String output = reverseChunks(s);
        System.out.println(output); // Output: "inhcet"
    }
    
    public static String reverseChunks(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            // Get the chunk of 5 characters or less if at the end of the string
            String chunk = s.substring(i, Math.min(i + 5, s.length()));
            // Reverse the chunk
            String reversedChunk = new StringBuilder(chunk).reverse().toString();
            // Append reversed chunk to result
            result.append(reversedChunk);
            // Move to the next chunk
            i += 5;
        }
        return result.toString();
    }
}
