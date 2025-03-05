package com.boki.kotlinthymeleafportfolio.domain.repository

import com.boki.kotlinthymeleafportfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {

    fun countAllByCreatedDateTimeBetween(start: LocalDateTime, end: LocalDateTime): Long

}

