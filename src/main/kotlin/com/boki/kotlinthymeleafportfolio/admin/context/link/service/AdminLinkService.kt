package com.boki.kotlinthymeleafportfolio.admin.context.link.service

import com.boki.kotlinthymeleafportfolio.admin.data.TableDTO
import com.boki.kotlinthymeleafportfolio.domain.entity.Link
import com.boki.kotlinthymeleafportfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {

    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}
