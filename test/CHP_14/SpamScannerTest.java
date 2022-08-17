package CHP_14;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static CHP_14.SpamScanner.countSpamPhrases;
import static org.junit.jupiter.api.Assertions.*;

class SpamScannerTest {
    private String mail;
    SpamScanner spam = new SpamScanner();

    @BeforeEach
    void setUp() {
        mail = """
                Hello Idris, 
                This is  John from Samsung we looked at your free website idea and wants to proceed with this idea
                by Being a member of your large enterprise making you earn massive profit allowing you to be independent
                and being your own boss
                Yours,
                ALien White
                """;

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void testTheLIstOfSpamWordsExist() {
        assertNotNull(spam.getSpamPhrasesList());
    }

    @Test
    void testThatListContains_30_Words() {
        assertEquals(30, spam.getSpamPhrasesList().length);
    }

    @Test
    void testRatingSystem() {
//        assertEquals(spam.);
    }

//    @Test
//    void testThatSpamPhrasesCanBeCounted(){
//        assertEquals(5,spam, countSpamPhrases(mail));
//
//    }
//@Test
//    void
//}
}