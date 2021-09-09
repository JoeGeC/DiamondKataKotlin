class Diamond {
    private val chars = listOf("A", "B", "C", "D")

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
        val space = " ".repeat(middleSpacesFor(char))
        return "$char${space}$char"
    }

    private fun middleSpacesFor(char: String) : Int {
        return chars.indexOf(char) * 2 - 1
    }

//    private fun startingSpacesFor(char: String, letter: String) : Int {
//        return
//    }
}
