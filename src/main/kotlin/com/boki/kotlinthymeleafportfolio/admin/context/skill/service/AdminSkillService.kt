package com.boki.kotlinthymeleafportfolio.admin.context.skill.service

import com.boki.kotlinthymeleafportfolio.admin.data.TableDTO
import com.boki.kotlinthymeleafportfolio.domain.entity.Skill
import com.boki.kotlinthymeleafportfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Service

@Service
class AdminSkillService(
    private val skillRepository: SkillRepository
) {

    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}
