package check

import kotlin.test.assertEquals

class CheckClass {

    fun checkLenghMas(expected: String, actual: Int) {
        var expectedLengh = expected.length
        assertEquals(
            "$expectedLengh",
            "$actual",
            "the received value ($expectedLengh) does not match the expected value ($actual)"
        )
    }

    fun checkEllipsis(expected: String) {
        var expectedEllipsis = expected.takeLast(3)
        assertEquals(
            "$expectedEllipsis",
            "...",
            "an ellipsis was expected at the end of the line"
        )
    }

    fun checkAllTextEllipsis(expected: String) {
        var allText = expected.contains("one two three four five...", true)
        assertEquals(
            allText,
            true,
            "text is not what you expected"
        )
    }

    fun checkAllText(expected: String) {
        var allText = expected.contains("one two three", true)
        assertEquals(
            allText,
            true,
            "text is not what you expected"
        )
    }
}