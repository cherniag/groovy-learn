package learn.basic

/**
 * Author: Gennadii Cherniaiev
 * Date: 8/19/2014
 */
class Loop {

    public static void main(String[] args) {

        //using Range [0..2]
        for(i in 0..2){
            println i
        }

        //using times [0..3)
        3.times{
            println it
        }

        //using up to [2..5]
        2.upto(5){
            println it
        }

        //using step
        2.step(9, 3){
            println it
        }

    }
}
