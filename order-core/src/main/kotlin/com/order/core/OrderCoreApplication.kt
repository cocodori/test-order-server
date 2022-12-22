package com.order.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderCoreApplication

fun main(args: Array<String>) {
	runApplication<OrderCoreApplication>(*args)
}
