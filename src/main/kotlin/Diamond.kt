class Diamond {
    private val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    fun convert(letter: String): String {
        val range = (0..chars.indexOf(letter)) + (chars.indexOf(letter) - 1 downTo 0)
        return range.fold("") { acc, i -> acc + "${createBodyFor(chars[i], letter)}\n" }
    }

    private fun createBodyFor(char: Char, letter: String): String {
        val startingSpaces = " ".repeat(startingSpacesFor(char, letter))
        if(char == chars[0]) return "${startingSpaces}$char"
        val middleSpaces = " ".repeat(middleSpacesFor(char))
        return "${startingSpaces}$char${middleSpaces}$char"
    }

    private fun middleSpacesFor(char: Char) : Int = chars.indexOf(char) * 2 - 1

    private fun startingSpacesFor(char: Char, letter: String) : Int = chars.indexOf(letter) - chars.indexOf(char)
}
