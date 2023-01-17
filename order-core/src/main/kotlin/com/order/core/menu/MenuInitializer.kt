package com.order.core.menu

import com.order.core.menu.entity.Menu
import com.order.core.menu.repository.MenuRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
internal class MenuInitializer(
    private val menuRepository: MenuRepository
) {

    @PostConstruct
    fun init() {
        if (menuRepository.count() > 0) return

        val menuList = listOf(
            Menu("불고기 샌드위치", 8000),
            Menu("닭가슴살 샌드위치", 8000),
            Menu("함박 샌드위치", 8000),
            Menu("에그마요 샌드위치", 6000),
            Menu("햄참치 샌드위치", 7000),
            Menu("장조림 라이스 샐러드", 10000),
            Menu("잠봉 라이스 샐러드", 10000),
            Menu("연어 샐러드", 12000),
            Menu("아메리카노", 3000),
            Menu("카페라떼", 4000),
            Menu("히비스커스티", 3000),
            Menu("탄산음료", 2000),
            Menu("생수", 1000),
        )

        menuRepository.saveAll(menuList)

    }
}