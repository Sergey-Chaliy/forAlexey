package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL001Test {

    /**
     *  Positive scenario
     */
    @Test
    fun vt_T001_test() {

        val logger: Logger = LogManager.getLogger()
        var article = "one two three four five six seven eight nine ten"
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== Check lenght article ===\n")
        check.checkLenghMas(childCore.lengthMas(childCore.mutableArticle("$article")), 26)
    }
}