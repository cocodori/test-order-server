package com.order.core.menu.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime


@Entity
internal class Menu(
    menu: String,
    price: Int
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0

    val menu: String = menu

    val price: Int = price

    val createdAt: LocalDateTime = LocalDateTime.now()
}