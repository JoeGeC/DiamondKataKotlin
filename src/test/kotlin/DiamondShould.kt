import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DiamondShould {
    @Test
    fun `convert A`(){
        val diamond = Diamond()
        assertEquals("A", diamond.convert("A"))
    }

    @Test
    fun `convert B`(){
        val diamond = Diamond()
        assertEquals(" A \n" +
                "B B\n" +
                " A \n", diamond.convert("B"))
    }
}