package com.boki.kotlinthymeleafportfolio.domain.repository

import com.boki.kotlinthymeleafportfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {

    // select * from achievement where is_active = :isActive
    fun findAllByIsActive(isActive: Boolean): List<Achievement>

}
