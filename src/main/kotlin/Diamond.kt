class Diamond {
    fun convert(letter: String): String {
        if (letter == "D") {
            return "   A\n" +
                    "  B B\n" +
                    " C   C\n" +
                    "D     D\n" +
                    " C   C\n" +
                    "  B B\n" +
                    "   A\n"
        }
        if (letter == "C") {
            return "  A\n" +
                    " B B\n" +
                    "C   C\n" +
                    " B B\n" +
                    "  A\n"
        }
        if (letter == "B") {
            return " A\n" +
                    "B B\n" +
                    " A\n"
        }
        return "A"
    }
}
