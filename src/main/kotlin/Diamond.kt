class Diamond {
    fun convert(letter: String): String {
        if (letter == "D") {
            return "   A\n" +
                    "  ${createBodyForB()}\n" +
                    " ${createBodyForC()}\n" +
                    "${createBodyForD()}\n" +
                    " ${createBodyForC()}\n" +
                    "  ${createBodyForB()}\n" +
                    "   A\n"
        }
        if (letter == "C") {
            return "  A\n" +
                    " ${createBodyForB()}\n" +
                    "${createBodyForC()}\n" +
                    " ${createBodyForB()}\n" +
                    "  A\n"
        }
        if (letter == "B") {
            return " A\n" +
                    "${createBodyForB()}\n" +
                    " A\n"
        }
        return "A"
    }

    private fun createBodyForB(): String {
        val space = " ".repeat(1)
        val char = "B"
        return "$char${space}$char"
    }

    private fun createBodyForC(): String {
        val space = " ".repeat(3)
        val char = "C"
        return "$char${space}$char"
    }

    private fun createBodyForD(): String {
        val space = " ".repeat(5)
        val char = "D"
        return "$char${space}$char"
    }
}
