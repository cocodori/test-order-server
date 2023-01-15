package com.order.api

import com.order.core.membership.MembershipService
import com.order.core.membership.dto.MembershipIdResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class MembershipPublishApiController(
    private val membershipService: MembershipService
) {

    @PostMapping("membership")
    fun publishMembership(): ResponseEntity<MembershipIdResponse> {

        val membershipId = membershipService.publish()

        return ResponseEntity(membershipId, HttpStatus.CREATED)
    }

}