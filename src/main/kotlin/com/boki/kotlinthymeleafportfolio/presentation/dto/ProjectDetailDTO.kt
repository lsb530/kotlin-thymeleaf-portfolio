package com.boki.kotlinthymeleafportfolio.presentation.dto

import com.boki.kotlinthymeleafportfolio.domain.entity.ProjectDetail

data class ProjectDetailDTO(
    val content: String,
    val url: String?
) {
    constructor(projectDetail: ProjectDetail) : this(
        content = projectDetail.content,
        url = projectDetail.url
    )
}