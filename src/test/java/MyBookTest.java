import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBookTest {
    @Test
    public void testThatMyBookCanGetTitleFromAbstractClassBook(){
        MyBook new_novel = new MyBook();
        new_novel.setTitle("Alice");
        assertEquals("Alice", new_novel.getTitle());
    }
}