public class ConcatenateAndReverseString {
    public static void main(String[] args) {

        ConcatenateAndReverseString cr = new ConcatenateAndReverseString();
        String word1 = "Hyderabad";
        String word2 = "Bangalore";

        String result = cr.concatinateAndReverse(word1 , word2);
        System.out.println(result);
    }

    public String concatinateAndReverse(String word1, String word2)
    {
        String Word1First4 = word1.substring(0, Math.min(4, word1.length()));
        String Word2First4 = word2.substring(0, Math.min(4, word2.length()));

        String concatenated = Word1First4 + Word2First4;

        
        char[] reversedArray = concatenated.toCharArray();

        for (int i = 0, j = reversedArray.length - 1; i < j; i++, j--) {
            char temp = reversedArray[i];
            reversedArray[i] = reversedArray[j];
            reversedArray[j] = temp;
        }

        String reversedConcatenated = new String(reversedArray);

        return reversedConcatenated;
    }
    
}
