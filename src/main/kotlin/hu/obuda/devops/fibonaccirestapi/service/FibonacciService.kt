package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        if ( n <= 0) return -1
        if ( n > 46) return -1

        if (n == 1) return 0
        if (n == 2) return 1

        var a = 0
        var b = 1
        var result = 0

        for (i in 3..n) {
            result = a + b
            a = b
            b = result
        }

        return result
    }
}