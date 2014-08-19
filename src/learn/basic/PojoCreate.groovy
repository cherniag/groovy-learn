package learn.basic

/**
 * Author: Gennadii Cherniaiev
 * Date: 8/19/2014
 */
class PojoCreate {
    def width, height, length


    public static void main(String[] args) {
        def pojo = new PojoCreate(length: 100, width: 20, height: 50)
        println "width: $pojo.width ; height: $pojo.height ; length: $pojo.length"
    }
}
