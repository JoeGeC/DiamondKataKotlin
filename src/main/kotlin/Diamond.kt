class Diamond {
    private val chars = listOf("A", "B", "C", "D")

    fun convert(letter: String): String {
        return buildLines(letter)
    }

    private fun buildLines(letter: String): String {
        var result = ""
        for(i in 0..chars.indexOf(letter))
            result += "${createBodyFor(chars[i], letter)}\n"
        for(i in chars.indexOf(letter) - 1 downTo 0)
            result += "${createBodyFor(chars[i], letter)}\n"
        return result
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
