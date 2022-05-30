fun main(args: Array<String>) {
        val n = 2000
        print("Even Numbers from 500 to $n are: ")
        for (i in 500..n) {
            if (i % 2 == 0) {
                print("$i ")
            }
        }
    }
