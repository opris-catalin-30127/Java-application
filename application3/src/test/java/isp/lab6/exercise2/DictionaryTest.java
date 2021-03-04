package isp.lab6.exercise2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DictionaryTest {
    @Test
    public void testAddWord() {
        final Dictionary dictionary = Dictionary.getInstance();

        final Word word = new Word("word");
        final WordDescription wordDescription = new WordDescription("word description", null);
        final boolean resultOfAdded = dictionary.addWord(word, wordDescription);

        assertEquals("The result should be : true", true, resultOfAdded);
        assertEquals("The result should be : {Word{" +
                "value='word'}=WordDescription{" +
                "description='word description', synonyms=null}}", "{Word{" +
                "value='word'}=WordDescription{" +
                "description='word description', synonyms=null}}", Dictionary.getDictionary().toString());
    }

    @Test
    public void testDeleteWord() {
        //when
        final Dictionary dictionary = Dictionary.getInstance();

        final Word word = new Word("word");
        final boolean resultOfDeleted = dictionary.deleteWord(word);

        //then
        assertEquals("The result should be : true", true, resultOfDeleted);
        assertEquals("The result should be : {}", "{}", Dictionary.getDictionary().toString());
        assertEquals("The result of size should be: 0", 0, Dictionary.getDictionary().size());
    }

    @Test
    public void testSearchWord() {
        //when
        final Dictionary dictionary = Dictionary.getInstance();

        final WordDescription wordDescription = dictionary.searchWord(new Word("word"));

        //then
        assertEquals("The result should be : WordDescription{" +
                "description='word description', synonyms=null}", "WordDescription{" +
                "description='word description', synonyms=null}", wordDescription.toString());
        assertEquals("The result of size should be: 1", 1, Dictionary.getDictionary().size());

    }

    @Test
    public void testFindSynonyms() {
        //when
        final Dictionary dictionary = Dictionary.getInstance();

        final List<Word> notHaveSynonyms = dictionary.findSynonyms(new Word("not found the Word"));

        //then
        assertEquals("The result should be : null", null, notHaveSynonyms);


    }
}
