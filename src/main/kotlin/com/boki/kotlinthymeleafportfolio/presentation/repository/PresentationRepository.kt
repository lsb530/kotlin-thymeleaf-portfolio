package com.boki.kotlinthymeleafportfolio.presentation.repository

import com.boki.kotlinthymeleafportfolio.domain.entity.Achievement
import com.boki.kotlinthymeleafportfolio.domain.entity.Experience
import com.boki.kotlinthymeleafportfolio.domain.entity.Introduction
import com.boki.kotlinthymeleafportfolio.domain.entity.Link
import com.boki.kotlinthymeleafportfolio.domain.entity.Project
import com.boki.kotlinthymeleafportfolio.domain.entity.Skill
import com.boki.kotlinthymeleafportfolio.domain.repository.AchievementRepository
import com.boki.kotlinthymeleafportfolio.domain.repository.ExperienceRepository
import com.boki.kotlinthymeleafportfolio.domain.repository.IntroductionRepository
import com.boki.kotlinthymeleafportfolio.domain.repository.LinkRepository
import com.boki.kotlinthymeleafportfolio.domain.repository.ProjectRepository
import com.boki.kotlinthymeleafportfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val experienceRepository: ExperienceRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val projectRepository: ProjectRepository,
    private val skillRepository: SkillRepository
) {

    fun getActiveAchievements(): List<Achievement> {
        return achievementRepository.findAllByIsActive(true)
    }

    fun getActiveExperiences(): List<Experience> {
        return experienceRepository.findAllByIsActive(true)
    }

    fun getActiveIntroductions(): List<Introduction> {
        return introductionRepository.findAllByIsActive(true)
    }

    fun getActiveLinks(): List<Link> {
        return linkRepository.findAllByIsActive(true)
    }

    fun getActiveProjects(): List<Project> {
        return projectRepository.findAllByIsActive(true)
    }

    fun getActiveSkills(): List<Skill> {
        return skillRepository.findAllByIsActive(true)
    }

}
