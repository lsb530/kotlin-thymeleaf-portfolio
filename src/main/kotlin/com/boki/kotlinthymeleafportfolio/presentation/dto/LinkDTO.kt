package com.boki.kotlinthymeleafportfolio.presentation.dto

import com.boki.kotlinthymeleafportfolio.domain.entity.Link

data class LinkDTO(
    val name: String,
    val content: String
) {
    constructor(link: Link) : this(
        name = link.name.lowercase(),
        content = link.content
    )
}