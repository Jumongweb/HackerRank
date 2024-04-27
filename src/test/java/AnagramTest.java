import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramTest {
    @Test
    public void testThatCatAndActAreAnagram(){
        String first = "caT";
        String second = "Act";
        assertTrue(Anagram.isAnagram(first, second));
    }
    @Test
    public void testThatDogAndRatAreNotAnagram(){
        String first = "Dog";
        String second = "Rat";
        assertFalse(Anagram.isAnagram(first, second));
    }
    @Test
    public void testThatCatAndActAreNotAnagram(){
        String first = "anagramm";
        String second = "marganaa";
        assertFalse(Anagram.isAnagram(first, second));
    }

}