package com.order.core.menu.dto

import com.order.core.menu.entity.Menu

data class MenuViewResponse(
    val id: Long,
    val menu: String,
    val price: Int
) {
    companion object {
        internal fun of(menu: Menu) = MenuViewResponse(
            id = menu.id,
            menu = menu.menu,
            price = menu.price
        )
    }
}