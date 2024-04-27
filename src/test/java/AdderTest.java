import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {
    @Test
    public void testThatAdderClassCanUseTheFunctionFromAClassItExtends(){
        Adder adder = new Adder();
        int result = adder.add(1, 2);
        assertEquals(3, result);
        System.out.println(adder.getClass().getSuperclass().getName());
    }

    @Test
    public void testThatadderSuperClassIsAritmethic(){
        Adder adder = new Adder();
        assertEquals("Arithmetic", adder.getClass().getSuperclass().getName());
    }


}