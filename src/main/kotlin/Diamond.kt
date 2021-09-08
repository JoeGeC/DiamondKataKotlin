class Diamond {
    private val chars = mapOf("B" to 1, "C" to 3, "D" to 5)

    fun convert(letter: String): String {
        if (letter == "D") {
            return "   A\n" +
                    "  ${createBodyFor("B")}\n" +
                    " ${createBodyFor("C")}\n" +
                    "${createBodyFor("D")}\n" +
                    " ${createBodyFor("C")}\n" +
                    "  ${createBodyFor("B")}\n" +
                    "   A\n"
        }
        if (letter == "C") {
            return "  A\n" +
                    " ${createBodyFor("B")}\n" +
                    "${createBodyFor("C")}\n" +
                    " ${createBodyFor("B")}\n" +
                    "  A\n"
        }
        if (letter == "B") {
            return " A\n" +
                    "${createBodyFor("B")}\n" +
                    " A\n"
        }
        return "A"
    }

    private fun createBodyFor(char: String): String {
        val space = " ".repeat(spacesFor(char))
        return "$char${space}$char"
    }

    private fun spacesFor(char: String) : Int {
        return chars[char] ?: 0
    }
}
