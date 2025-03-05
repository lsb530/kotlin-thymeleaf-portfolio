package com.boki.kotlinthymeleafportfolio.presentation.dto

import com.boki.kotlinthymeleafportfolio.domain.entity.Skill

data class SkillDTO(
    val name: String,
    val type: String
) {
    constructor(skill: Skill) : this(
        name = skill.name,
        type = skill.type.name
    )
}
