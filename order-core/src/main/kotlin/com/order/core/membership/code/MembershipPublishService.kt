package com.order.core.membership.code

import com.order.core.membership.Membership
import com.order.core.membership.dto.MembershipIdResponse
import com.order.core.membership.repository.MembershipRepository
import org.springframework.stereotype.Service

@Service
internal class MembershipPublishService(
    private val membershipRepository: MembershipRepository
) {
    fun createMembership(): MembershipIdResponse {
        val newMembership = membershipRepository.save(Membership())

        return MembershipIdResponse.of(newMembership)
    }
}