package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL006Test {

    @Test
    fun vt_T006_test() {

        /**
         *  Negative scenario // failed
         */
        val logger: Logger = LogManager.getLogger()
        var article = " "
        val childCore = Core()
        val check = CheckClass()

        logger.info("\n=== check Space===\n")
        check.checkAllTextEllipsis(childCore.lengthMas(childCore.mutableArticle("$article")))
}
}