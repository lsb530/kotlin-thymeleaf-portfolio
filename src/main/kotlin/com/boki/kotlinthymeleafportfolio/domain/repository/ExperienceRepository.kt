package com.boki.kotlinthymeleafportfolio.domain.repository

import com.boki.kotlinthymeleafportfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Experience>

}
