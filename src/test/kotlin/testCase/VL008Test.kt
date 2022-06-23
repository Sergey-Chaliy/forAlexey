package testCase

import check.CheckClass
import core.Core
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.testng.annotations.Test

class VL008Test {

    @Test
    fun vt_T008_test() {

    val logger: Logger = LogManager.getLogger()
    var article = "one two three four five six"
    val childCore = Core()
    val check = CheckClass()

    logger.info("\n=== check allTextEllipsis===\n")
    check.checkAllTextEllipsis(childCore.lengthMas(childCore.mutableArticle("$article")))

    }
}