package com.order.core.menu.code

import com.order.core.menu.MenuService
import com.order.core.menu.dto.MenuViewResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
internal class MenuDefaultService(
    private val menuViewService: MenuViewService
): MenuService{

    @Transactional(readOnly = true)
    override fun getAllMenu(): List<MenuViewResponse> {
        return menuViewService.getAllMenu()
    }

}