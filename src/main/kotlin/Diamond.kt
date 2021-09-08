class Diamond {
    fun convert(letter: String): String {
        if (letter == "D") {
            return "   A\n" +
                    "  ${createBodyForB("B")}\n" +
                    " ${createBodyForC("C")}\n" +
                    "${createBodyForD("D")}\n" +
                    " ${createBodyForC("C")}\n" +
                    "  ${createBodyForB("B")}\n" +
                    "   A\n"
        }
        if (letter == "C") {
            return "  A\n" +
                    " ${createBodyForB("B")}\n" +
                    "${createBodyForC("C")}\n" +
                    " ${createBodyForB("B")}\n" +
                    "  A\n"
        }
        if (letter == "B") {
            return " A\n" +
                    "${createBodyForB("B")}\n" +
                    " A\n"
        }
        return "A"
    }

    private fun createBodyForB(char: String): String {
        val space = " ".repeat(spacesFor(char))
        return "$char${space}$char"
    }

    private fun createBodyForC(char: String): String {
        val space = " ".repeat(spacesFor(char))
        return "$char${space}$char"
    }

    private fun createBodyForD(char: String): String {
        val space = " ".repeat(spacesFor(char))
        return "$char${space}$char"
    }

    private fun spacesFor(char: String) : Int {
        if(char == "B") return 1
        if(char == "C") return 3
        return 5
    }
}
