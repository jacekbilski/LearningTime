package com.zooplus.jacekb.learningTime.scala

/**
 * Created with IntelliJ IDEA.
 * User: jacek_bilski
 * Date: 10/06/13
 * Time: 16:10
 */
object Currying {
	def main(args: Array[String]) {
		println(g(2, f(3))) // 7
	}

	def f(x: Int)(y: Int) = x + 2 * y

	def g(y: Int, h: Int => Int) = h(y)
}
