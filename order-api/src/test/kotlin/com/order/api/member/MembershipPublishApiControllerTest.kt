package com.order.api.member

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.post

@AutoConfigureMockMvc
@SpringBootTest
internal class MembershipPublishApiControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `membership 발급 요청 201 Created`() {
        mockMvc.post("/api/v1/membership")
            .andExpect {
                status { isCreated() }
                content {
                    contentType(MediaType.APPLICATION_JSON)
                    jsonPath("id") { exists() }
                    jsonPath("membershipId") { exists() }
                    jsonPath("membershipId") { isString() }
                }
            }.andDo {
                print()
            }
    }
}