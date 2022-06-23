package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL007Test {

    /**
     *  Negative scenario // failed
     */
    @Test
    fun vt_T007_test() {

        val logger: Logger = LogManager.getLogger()
        var article = 344343
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== check Integer===\n")
        check.checkAllTextEllipsis(childCore.lengthMas(childCore.mutableArticle("$article")))
    }
}