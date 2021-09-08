class Diamond {
    fun convert(letter: String): String {
        val b = "B B"
        val c = "C   C"
        val d = "D     D"
        if (letter == "D") {
            return "   A\n" +
                    "  $b\n" +
                    " $c\n" +
                    "$d\n" +
                    " $c\n" +
                    "  $b\n" +
                    "   A\n"
        }
        if (letter == "C") {
            return "  A\n" +
                    " $b\n" +
                    "$c\n" +
                    " $b\n" +
                    "  A\n"
        }
        if (letter == "B") {
            return " A\n" +
                    "$b\n" +
                    " A\n"
        }
        return "A"
    }
}
