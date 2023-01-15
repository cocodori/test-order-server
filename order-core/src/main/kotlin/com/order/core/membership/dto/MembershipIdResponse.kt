package com.order.core.membership.dto

import com.order.core.membership.Membership

data class MembershipIdResponse(
    val id: Long,
    val membershipId: String
) {
    companion object {
        internal fun of(membership: Membership) = MembershipIdResponse(
            id = membership.id,
            membershipId = membership.membershipUUID
        )
    }
}