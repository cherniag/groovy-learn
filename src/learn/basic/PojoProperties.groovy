package learn.basic

/**
 * Author: Gennadii Cherniaiev
 * Date: 8/19/2014
 */
class PojoProperties {
    def readAndWriteField
    // read only field without setter
    final readOnlyField
    def overrideField

    PojoProperties(readOnlyField) {
        this.readOnlyField = readOnlyField
    }

    //override getter
    def getOverrideField(){
        println "getter was called"
        overrideField
    }

    //override setter
    def setOverrideField(value){
        println "setter was called with $value"
        overrideField = value
    }

    def defaultParameters(x, y = 100){
        x * y
    }

    //the trailing array parameter as optional.
    def optionalParameters(x, String[] y){
        println "x: $x ; y: $y"
    }



    public static void main(String[] args) {
        def pojo = new PojoProperties(2014)
        println pojo.readOnlyField
        println pojo.readAndWriteField

        pojo.readAndWriteField = "value"
        println pojo.readAndWriteField

        //call getter
        println pojo.overrideField
        //call setter
        pojo.overrideField = "tra"

        //try to set read only property
        try {
            //uncomment it
            //pojo.readOnlyField = 34;
        }catch (ex){
            println ex.message
        }

        //test params:
        println pojo.defaultParameters(5)    //500
        println pojo.defaultParameters(5, 10)    //50

        pojo.optionalParameters(10)
        pojo.optionalParameters(10, 'a')
        pojo.optionalParameters(10, 'a', 'b')
    }
}
