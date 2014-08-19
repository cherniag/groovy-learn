package learn.basic

/**
 * Author: Gennadii Cherniaiev
 * Date: 8/19/2014
 */
class Mix {
    public static void main(String[] args) {
        //run process and print output
        println "cmd /C dir".execute().text

        //null safe navigator - ? operator
        println checkAndChangeCase("case")
        println checkAndChangeCase(null)
    }

    private static checkAndChangeCase(String value) {
        value?.toUpperCase()
    }


}
