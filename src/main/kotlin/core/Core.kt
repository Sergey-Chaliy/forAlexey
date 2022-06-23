package core

class Core {

    /**
     * The function accepts a string if the function argument is empty or does not match the format,
     * then it terminates the program execution
     * @param article forwarded article / array of words
     */
    fun lengthMas(article: String): String {
        var articleLength = article.length
        println("lenght article = $articleLength")

        if (articleLength == 0 || articleLength == null) {
            println("string cannot be empty")
        }

        if( article == "" || article == " " || article == null) {
            println("you entered invalid characters")
            assert(true)
        }

        println(" RESULT STRING =  $article")
        return article
    }

    /**
     * the function takes a string and returns the same string if it is less than 25 characters, if more then
     * it cuts the string to the last whole word and adds an ellipsis to the end of the returned string
     * @param masStr forwarded article / array of words
     */
    fun mutableArticle(masStr: String): String {
        var countMasStr = 0
        var countFinishArticle = 0
        var intermediateArticle = ""
        var finishArticle = ""
        var ellipsis = false

        for (letter in masStr) {
            intermediateArticle = intermediateArticle + letter
            countMasStr++
            if (countMasStr == 25) {
                break
            }
        }

        var index = intermediateArticle.toCharArray().size - 1

        while (intermediateArticle[index] != ' ' && intermediateArticle.toCharArray().size > 24 ) {
            println("index --")
            index--
            ellipsis = true
        }

        for (letter in intermediateArticle) {
            finishArticle = finishArticle + letter
            countFinishArticle++
            if (ellipsis) {
                if (countFinishArticle == index) {
                    break
                }
            }
            if (ellipsis == false)
                if (countFinishArticle == index + 1) {
                    break
                }
        }

        if (ellipsis){
        return finishArticle + "..."
        }

        return finishArticle
    }
}


