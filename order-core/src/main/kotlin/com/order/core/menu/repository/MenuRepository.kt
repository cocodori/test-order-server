package com.order.core.menu.repository

import com.order.core.menu.entity.Menu
import org.springframework.data.jpa.repository.JpaRepository

internal interface MenuRepository: JpaRepository<Menu, Long> {
}