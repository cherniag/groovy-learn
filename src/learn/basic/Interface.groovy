package learn.basic

/**
 * Author: Gennadii Cherniaiev
 * Date: 8/19/2014
 */
class Interface {

    public static void main(String[] args) {
        //Runnable example:
        def another = new Thread({ println Thread.currentThread().name} as Runnable)    //works even without "as Runnable"
        println Thread.currentThread().name
        another.start()

        //map of implemented methods - no need to implement unused methods - notifyThird
        def listener = [
            //method name : implementation
            onFirstEvent: { source, message -> println "onFirstEvent >> source: $source, message: $message"},
            onSecondEvent: { println "onSecondEvent >> message: $it"}
        ]
        def notifier = new Notifier();
        notifier.addListener(listener as SomeListener)

        notifier.notifyFirst("1")
        notifier.notifySecond("2")
        //not provided implementation so UnsupportedOperationException
        // notifier.notifyThird("3")

    }
}


interface SomeListener{
    def onFirstEvent(source, message);
    def onSecondEvent(message);
    def onThirdEvent(source);
}

class Notifier{

    private SomeListener listener

    def addListener(SomeListener listener){
        this.listener = listener
    }

    def notifyFirst(message){
        listener.onFirstEvent(this, message)
    }

    def notifySecond(message){
        listener.onSecondEvent(message)
    }

    def notifyThird(message){
        listener.onThirdEvent(this)
    }
}