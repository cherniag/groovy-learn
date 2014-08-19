package learn.basic

/**
 * Author: Gennadii Cherniaiev
 * Date: 8/19/2014
 */
class Interface {

    public static void main(String[] args) {
        def another = new Thread({ println Thread.currentThread().name} as Runnable)    //works even without "as Runnable"
        println Thread.currentThread().name
        another.start()
    }
}
