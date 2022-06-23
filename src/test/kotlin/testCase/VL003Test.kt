package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL003Test {

    /**
     *  Negative scenario // failed
     */
    @Test
    fun vt_T003_test() {

        val logger: Logger = LogManager.getLogger()
        var article = "one two three"
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== Check lenght article negativ ===\n")
        check.checkLenghMas(childCore.lengthMas(childCore.mutableArticle("$article")), 26)
    }
}