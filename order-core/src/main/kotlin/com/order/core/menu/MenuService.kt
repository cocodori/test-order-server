package com.order.core.menu

import com.order.core.menu.dto.MenuViewResponse

interface MenuService {

    fun getAllMenu(): List<MenuViewResponse>

}