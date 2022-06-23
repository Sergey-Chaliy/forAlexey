package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL002Test {

    @Test
    fun vt_T002_test() {

        val logger: Logger = LogManager.getLogger()
        var article = "one two three four five six seven eight nine ten"
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== Check ellipsis > 25 ===\n")
        check.checkEllipsis(childCore.lengthMas(childCore.mutableArticle("$article")))

    }
}