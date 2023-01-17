package com.order.api.menu

import com.order.api.V1_API_PREFIX
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@AutoConfigureMockMvc
@SpringBootTest
internal class MenuViewApiControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `메뉴 목록 조회 200 OK`() {
        mockMvc.get("$V1_API_PREFIX/menu")
            .andExpect {
                status { isOk() }
                content {
                    contentType(MediaType.APPLICATION_JSON)
                }
            }
            .andDo { print() }
    }
}