package isp.lab6.exercise2;

import java.util.*;

public class Dictionary {
    private static Dictionary INSTANCE;
    private static Map<Word, WordDescription> dictionary;

    private Dictionary() {
    }

    public static Dictionary getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new Dictionary();
            dictionary = new HashMap<>();
        }
        return INSTANCE;
    }

    public static Map<Word, WordDescription> getDictionary() {
        return dictionary;
    }

    /**
     * This method should add a new word in dictionary
     *
     * @param word-                     represent the  word object to be added
     * @param wordDescription-represent the  wordDescription to be added with word
     * @return true if the word was successfully added or false if a particular synonym not found in the dictionary
     */
    public boolean addWord(Word word, WordDescription wordDescription) {
        if ((wordDescription == null) || (wordDescription.getSynonyms() == null) || wordDescription.getSynonyms().isEmpty()) {
        } else {
            dictionary.keySet();
            for (Word word1 : dictionary.keySet()) {
                if (word1.getValue().equals(word)) {
                    System.out.println("The synonyms not found in the dictionary.");
                    return false;
                }

            }

        }
        dictionary.put(word, wordDescription);
        return true;
    }

    /**
     * This method should delete a word from the dictionary
     *
     * @param word represent the word object to be added
     * @return true if the word was found and successfully deleted or false if a particular synonyms was not found
     */
    public boolean deleteWord(Word word) {
        if (dictionary.containsKey(word)) {
            for (Map.Entry<Word, WordDescription> entry : dictionary.entrySet()) {
                Word key = entry.getKey();
                WordDescription wordDescription = entry.getValue();
                if (Objects.nonNull(wordDescription.getSynonyms())) {
                    wordDescription.getSynonyms().remove(word);
                }
            }
            dictionary.remove(word);
            return true;
        } else {
            System.out.println("The word with value " + word.getValue() + " not found in the dictionary");
            return false;
        }
    }

    /**
     * This method should search and  make description for a particular word
     *
     * @param word- represent the word object to be searched
     * @return the WordDescription or null if not found
     */
    public WordDescription searchWord(final Word word) {
        return dictionary.get(word);
    }

    /**
     * This method should find synonyms for a particular word
     *
     * @param word represent word object to be searched
     * @return list of the synonyms existing and null if the word not found
     */
    public List<Word> findSynonyms(Word word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word).getSynonyms();
        }
        return null;
    }

}
