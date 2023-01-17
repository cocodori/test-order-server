package com.order.api.menu

import com.order.api.V1_API_PREFIX
import com.order.core.menu.MenuService
import com.order.core.menu.dto.MenuViewResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(V1_API_PREFIX)
class MenuViewApiController(
    private val menuService: MenuService
) {

    @GetMapping("/menu")
    fun getAllMenu(): ResponseEntity<List<MenuViewResponse>> {
        val allMenu = menuService.getAllMenu();

        return ResponseEntity(allMenu, HttpStatus.OK)
    }
}