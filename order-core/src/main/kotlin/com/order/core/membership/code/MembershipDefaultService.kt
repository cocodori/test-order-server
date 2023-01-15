package com.order.core.membership.code

import com.order.core.membership.MembershipService
import com.order.core.membership.dto.MembershipIdResponse
import org.springframework.stereotype.Service

@Service
internal class MembershipDefaultService(
    private val publishService: MembershipPublishService
): MembershipService {

    override fun publish(): MembershipIdResponse {
        return publishService.createMembership()
    }

}
