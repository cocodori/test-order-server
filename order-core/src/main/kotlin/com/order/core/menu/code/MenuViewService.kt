package com.order.core.menu.code

import com.order.core.menu.dto.MenuViewResponse
import com.order.core.menu.repository.MenuRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
internal class MenuViewService(
    private val menuRepository: MenuRepository
) {

    @Transactional(readOnly = true)
    fun getAllMenu(): List<MenuViewResponse> {
        return menuRepository.findAll()
            .map { MenuViewResponse.of(it) }
    }
}