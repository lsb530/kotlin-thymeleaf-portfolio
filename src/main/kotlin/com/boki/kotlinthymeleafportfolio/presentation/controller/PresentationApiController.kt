package com.boki.kotlinthymeleafportfolio.presentation.controller

import com.boki.kotlinthymeleafportfolio.presentation.dto.IntroductionDTO
import com.boki.kotlinthymeleafportfolio.presentation.dto.LinkDTO
import com.boki.kotlinthymeleafportfolio.presentation.dto.ProjectDTO
import com.boki.kotlinthymeleafportfolio.presentation.dto.ResumeDTO
import com.boki.kotlinthymeleafportfolio.presentation.service.PresentationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PresentationApiController(
    private val presentationService: PresentationService
) {

    @GetMapping("/test")
    fun test(): String {
        return "OK"
    }

    @GetMapping("/v1/introductions")
    fun getIntroductions(): List<IntroductionDTO> {
        return presentationService.getIntroductions()
    }

    @GetMapping("/v1/links")
    fun getLinks(): List<LinkDTO> {
        return presentationService.getLinks()
    }

    @GetMapping("/v1/resume")
    fun getResume(): ResumeDTO {
        return presentationService.getResume()
    }

    @GetMapping("/v1/projects")
    fun getProjects(): List<ProjectDTO> {
        return presentationService.getProjects()
    }

}

