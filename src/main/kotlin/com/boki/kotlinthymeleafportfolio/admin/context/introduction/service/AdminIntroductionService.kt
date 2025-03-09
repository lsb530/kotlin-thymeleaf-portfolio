package com.boki.kotlinthymeleafportfolio.admin.context.introduction.service

import com.boki.kotlinthymeleafportfolio.admin.context.introduction.form.IntroductionForm
import com.boki.kotlinthymeleafportfolio.admin.data.TableDTO
import com.boki.kotlinthymeleafportfolio.domain.entity.Introduction
import com.boki.kotlinthymeleafportfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }

    @Transactional
    fun save(form: IntroductionForm) {
        val introduction = form.toEntity()
        introductionRepository.save(introduction)
    }

    @Transactional
    fun update(id: Long, form: IntroductionForm) {
        val introduction = form.toEntity(id)
        introductionRepository.save(introduction)
    }
}
