package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL005Test {

    @Test
    fun vt_T005_test() {

        /**
         *  Negative scenario // failed
         */
        val logger: Logger = LogManager.getLogger()
        var article = ""
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== empty string ===\n")
        check.checkAllTextEllipsis(childCore.lengthMas(childCore.mutableArticle("$article")))
    }
}