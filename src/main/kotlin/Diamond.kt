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
        val b = "B${space}B"
        return b
    }

    private fun createBodyForC(): String {
        val space = " ".repeat(3)
        val c = "C${space}C"
        return c
    }

    private fun createBodyForD(): String {
        val space = " ".repeat(5)
        val d = "D${space}D"
        return d
    }
}
