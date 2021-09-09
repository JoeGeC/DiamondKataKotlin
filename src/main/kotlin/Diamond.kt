class Diamond {
    private val chars = listOf("A", "B", "C", "D")

    fun convert(letter: String): String {
        if (letter == "D") {
            return "   A\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("C", letter)}\n" +
                    "${createBodyFor("D", letter)}\n" +
                    "${createBodyFor("C", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "   A\n"
        }
        if (letter == "C") {
            return "  A\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("C", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "  A\n"
        }
        if (letter == "B") {
            return " A\n" +
                    "${createBodyFor("B", letter)}\n" +
                    " A\n"
        }
        return "A"
    }

    private fun createBodyFor(char: String, letter: String): String {
        val middleSpaces = " ".repeat(middleSpacesFor(char))
        val startingSpaces = " ".repeat(startingSpacesFor(char, letter))
        return "${startingSpaces}$char${middleSpaces}$char"
    }

    private fun middleSpacesFor(char: String) : Int {
        return chars.indexOf(char) * 2 - 1
    }

    private fun startingSpacesFor(char: String, letter: String) : Int {
        return chars.indexOf(letter) - chars.indexOf(char)
    }
}
