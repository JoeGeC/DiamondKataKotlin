import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DiamondShould {
    @Test
    fun `convert A`(){
        val diamond = Diamond()
        assertEquals("A\n", diamond.convert("A"))
    }

    @Test
    fun `convert B`(){
        val diamond = Diamond()
        assertEquals(" A\n" +
                "B B\n" +
                " A\n", diamond.convert("B"))
    }

    @Test
    fun `convert C`(){
        val diamond = Diamond()
        assertEquals("  A\n" +
                " B B\n" +
                "C   C\n" +
                " B B\n" +
                "  A\n", diamond.convert("C"))
    }

    @Test
    fun `convert D`(){
        val diamond = Diamond()
        assertEquals("   A\n" +
                "  B B\n" +
                " C   C\n" +
                "D     D\n" +
                " C   C\n" +
                "  B B\n" +
                "   A\n", diamond.convert("D"))
    }
}