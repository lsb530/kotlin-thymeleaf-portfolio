package com.boki.kotlinthymeleafportfolio.presentation.dto

data class ExperienceDTO(
    val title: String,
    val description: String,
    val startYearMonth: String?,
    val endYearMonth: String?,
    val details: List<String>
)