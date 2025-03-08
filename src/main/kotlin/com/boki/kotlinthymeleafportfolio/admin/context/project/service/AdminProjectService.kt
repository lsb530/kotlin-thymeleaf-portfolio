package com.boki.kotlinthymeleafportfolio.admin.context.project.service

import com.boki.kotlinthymeleafportfolio.admin.data.TableDTO
import com.boki.kotlinthymeleafportfolio.admin.exception.AdminBadReqeustException
import com.boki.kotlinthymeleafportfolio.domain.entity.Project
import com.boki.kotlinthymeleafportfolio.domain.entity.ProjectDetail
import com.boki.kotlinthymeleafportfolio.domain.repository.ProjectRepository
import org.springframework.stereotype.Service

@Service
class AdminProjectService(
    private val projectRepository: ProjectRepository
) {

    fun getProjectTable(): TableDTO {
        val classInfo = Project::class
        val entities = projectRepository.findAll()

        return TableDTO.from(classInfo, entities, "details", "skills")
    }

    fun getProjectDetailTable(id: Long?): TableDTO {
        val classInfo = ProjectDetail::class
        val entities = if (id != null) projectRepository.findById(id)
            .orElseThrow { throw AdminBadReqeustException("ID ${id}에 해당하는 데이터를 찾을 수 없습니다.") }
            .details else emptyList()

        return TableDTO.from(classInfo, entities)
    }
}
