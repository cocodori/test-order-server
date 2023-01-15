package com.order.core.membership

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime
import java.util.UUID

@Entity
internal class Membership(
    membershipUUID: String = UUID.randomUUID().toString()
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0;

    val membershipUUID: String = membershipUUID

    val createdAt: LocalDateTime = LocalDateTime.now()
}