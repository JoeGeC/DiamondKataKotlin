class Diamond {
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
        if(char == "B") return 1
        if(char == "C") return 3
        return 5
    }
}
