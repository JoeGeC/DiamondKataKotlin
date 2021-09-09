class Diamond {
    private val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun convert(letter: String): String {
        return createDiamondHalf(letter, true) + createDiamondHalf(letter, false)
    }

    private fun createDiamondHalf(letter: String, top: Boolean): String {
        var result = ""
        val range = if(top) 0..chars.indexOf(letter)
        else chars.indexOf(letter) - 1 downTo 0
        for (i in range)
            result += "${createBodyFor(chars[i], letter)}\n"
        return result
    }

    private fun createBodyFor(char: Char, letter: String): String {
        val startingSpaces = " ".repeat(startingSpacesFor(char, letter))
        if(char == chars[0]) return "${startingSpaces}$char"
        val middleSpaces = " ".repeat(middleSpacesFor(char))
        return "${startingSpaces}$char${middleSpaces}$char"
    }

    private fun middleSpacesFor(char: Char) : Int {
        return chars.indexOf(char) * 2 - 1
    }

    private fun startingSpacesFor(char: Char, letter: String) : Int {
        return chars.indexOf(letter) - chars.indexOf(char)
    }
}
