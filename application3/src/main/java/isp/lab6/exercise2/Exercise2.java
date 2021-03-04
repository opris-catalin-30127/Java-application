package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        Dictionary dictionary = Dictionary.getInstance();

        List<Word> words = new ArrayList<>();

        //some words
        Word word1 = new Word("processes");
        Word word2 = new Word("work");
        Word word3 = new Word("serves");
        Word word4 = new Word("tree");
        Word word5 = new Word("arbor");
        Word word6 = new Word("car");

        //added the word in list
        words.add(word1);
        words.add(word2);
        words.add(word3);
        words.add(word4);
        words.add(word5);
        words.add(word6);

        //description for each word
        WordDescription word1Description = new WordDescription("is an activity", null);
        WordDescription word2Description = new WordDescription("is an activity", words.subList(0, 1));
        WordDescription word3Description = new WordDescription("is an activity", words.subList(0, 2));
        WordDescription word4Description = new WordDescription("Fruit tree", null);
        WordDescription word5Description = new WordDescription("Fruit tree", words.subList(3, 4));
        WordDescription word6Description = new WordDescription("Technical system ", null);

        //added the word1 in dictionary
        boolean word1Added = dictionary.addWord(word1, word1Description);
        System.out.println("The result of added=" + word1Added);
        System.out.println(" My dictionary after add=" + Dictionary.getDictionary());

        //added the word2 in dictionary
        boolean word2Added = dictionary.addWord(word2, word2Description);
        System.out.println("The result of added=" + word2Added);
        System.out.println(" My dictionary after add=" + Dictionary.getDictionary());

        //added the word3 in dictionary
        boolean word3Added = dictionary.addWord(word3, word3Description);
        System.out.println("The result of added=" + word3Added);
        System.out.println(" My dictionary after add=" + Dictionary.getDictionary());

        //added the word4 in dictionary
        boolean word4Added = dictionary.addWord(word4, word4Description);
        System.out.println("The result of added=" + word4Added);
        System.out.println(" My dictionary after add=" + Dictionary.getDictionary());

        //added the word5 in dictionary
        boolean word5Added = dictionary.addWord(word5, word5Description);
        System.out.println("The result of added=" + word5Added);
        System.out.println(" My dictionary after add=" + Dictionary.getDictionary());

        //added the word6 in dictionary
        boolean word6Added = dictionary.addWord(word6, word6Description);
        System.out.println("The result of added=" + word6Added);
        System.out.println(" My dictionary after add=" + Dictionary.getDictionary());


        // delete word
        final boolean wordDeleted = dictionary.deleteWord(word6);
        System.out.println("The result of delete=" + wordDeleted);
        System.out.println("My Dictionary after delete=" + Dictionary.getDictionary());

        //search word
        WordDescription description = dictionary.searchWord(new Word("tree"));
        System.out.println("The result of search=" + description);

        //find synonyms
        final List<Word> wordWithoutSynonyms = dictionary.findSynonyms(new Word("work"));
        System.out.println("The result of find=" + wordWithoutSynonyms);


    }

}
