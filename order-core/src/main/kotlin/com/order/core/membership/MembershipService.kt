package com.order.core.membership

import com.order.core.membership.dto.MembershipIdResponse

interface MembershipService {
    fun publish(): MembershipIdResponse
}