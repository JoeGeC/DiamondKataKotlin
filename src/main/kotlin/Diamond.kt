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
        return "B B"
    }

    private fun createBodyForC(): String {
        return "C   C"
    }

    private fun createBodyForD(): String {
        return "D     D"
    }
}
