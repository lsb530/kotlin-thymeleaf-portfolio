package com.boki.kotlinthymeleafportfolio.admin.context.link.service

import com.boki.kotlinthymeleafportfolio.admin.context.link.form.LinkForm
import com.boki.kotlinthymeleafportfolio.admin.data.TableDTO
import com.boki.kotlinthymeleafportfolio.domain.entity.Link
import com.boki.kotlinthymeleafportfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {

    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

    @Transactional
    fun save(form: LinkForm) {
        val link = form.toEntity()

        linkRepository.save(link)
    }

    @Transactional
    fun update(id: Long, form: LinkForm) {
        val link = form.toEntity(id)

        linkRepository.save(link)
    }
}
