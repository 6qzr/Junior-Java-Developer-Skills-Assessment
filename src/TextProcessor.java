public class TextProcessor {
    // Count words in a sentence
    public static int countWords(String sentence) {
        // Split the sentence and count words
        // Handle empty strings
        if (sentence.isEmpty()) {
            return 0;
        }
        String[] splittedSentence = sentence.split(" ");
        return splittedSentence.length;
    }
    // Replace specific words
    public static String replaceWord(String text, String oldWord, String newWord) {
        // Replace all occurrences of oldWord with newWord
        return text.replace(oldWord, newWord);
    }
    public static void main(String[] args) {
        // Test with: "Java is fun and Java is powerful"
        // Count words
        // Replace "Java" with "Programming"
        String sentence = "Java is fun and Java is powerful";
        // 1. Count words
        int wordCount = countWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Word count: " + wordCount);

        // 2. Replace "Java" with "Programming"
        String updatedSentence = replaceWord(sentence, "Java", "Programming");
        System.out.println("Updated sentence: " + updatedSentence);
    }
}