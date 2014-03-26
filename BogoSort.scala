object BogoSort {
    def main(args: Array[String]) = {
        val myArr = Array(2,3,13,53,12,1,34,6,7,23,81,19,4)
        sort(myArr)
        println(myArr.mkString(" "))
    }

    def sort(arr: Array[Int]){
        def swap(i: Int, j: Int){
            val tmp = arr(i)
            arr(i) = arr(j)
            arr(j) = tmp
        }

        val rand = scala.util.Random

        def shuffle(){
            for(num <- 0 until arr.length){
                var a = rand.nextInt(arr.length)
                var b = rand.nextInt(arr.length)
                swap(a, b)
            }
        }


        def bogosort(){
            var i: Int = 0
            var flag = true
            println("Shuffling ")
            shuffle()
            while (i < arr.length - 1){
                if (arr(i) > arr(i + 1))
                {
                    flag = false
                }
                i += 1
            }
            if( !flag ){
                println(arr.mkString(" "))
                bogosort()
            }
        }
        println(arr.mkString(" "))
        bogosort()
    }
}