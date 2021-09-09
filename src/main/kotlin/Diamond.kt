class Diamond {
    private val chars = listOf("A", "B", "C", "D")

    fun convert(letter: String): String {
        if (letter == "D") {
            return "${createBodyFor("A", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("C", letter)}\n" +
                    "${createBodyFor("D", letter)}\n" +
                    "${createBodyFor("C", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("A", letter)}\n"
        }
        if (letter == "C") {
            return "${createBodyFor("A", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("C", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("A", letter)}\n"
        }
        if (letter == "B") {
            return "${createBodyFor("A", letter)}\n" +
                    "${createBodyFor("B", letter)}\n" +
                    "${createBodyFor("A", letter)}\n"
        }
        return "A"
    }

    private fun createBodyFor(char: String, letter: String): String {
        val startingSpaces = " ".repeat(startingSpacesFor(char, letter))
        if(char == "A") return "${startingSpaces}$char"
        val middleSpaces = " ".repeat(middleSpacesFor(char))
        return "${startingSpaces}$char${middleSpaces}$char"
    }

    private fun middleSpacesFor(char: String) : Int {
        return chars.indexOf(char) * 2 - 1
    }

    private fun startingSpacesFor(char: String, letter: String) : Int {
        return chars.indexOf(letter) - chars.indexOf(char)
    }
}
