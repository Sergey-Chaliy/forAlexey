package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL010Test {
    @Test
    fun vt_T010_test() {

        val logger: Logger = LogManager.getLogger()
        var article = "one two three"
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== check allText===\n")
        check.checkAllText(childCore.lengthMas(childCore.mutableArticle("$article")))

    }
}
