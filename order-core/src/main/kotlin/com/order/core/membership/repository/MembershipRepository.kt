package com.order.core.membership.repository

import com.order.core.membership.Membership
import org.springframework.data.jpa.repository.JpaRepository

internal interface MembershipRepository: JpaRepository<Membership, Long>