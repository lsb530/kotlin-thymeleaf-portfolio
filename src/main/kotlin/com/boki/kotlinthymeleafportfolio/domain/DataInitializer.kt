package com.boki.kotlinthymeleafportfolio.domain

import com.boki.kotlinthymeleafportfolio.domain.constant.SkillType
import com.boki.kotlinthymeleafportfolio.domain.entity.*
import com.boki.kotlinthymeleafportfolio.domain.repository.*
import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
@Profile(value = ["default"])
class DataInitializer(
    private val achievementRepository: AchievementRepository,
    private val experienceRepository: ExperienceRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val projectRepository: ProjectRepository,
    private val skillRepository: SkillRepository,
    private val accountRepository: AccountRepository
) {

    val log = LoggerFactory.getLogger(DataInitializer::class.java)

    @PostConstruct
    fun initializeData() {

        log.info("스프링이 실행되었습니다. 테스트 데이터를 초기화합니다.")

        // achievement 초기화
        val achievements = mutableListOf<Achievement>(
            Achievement(
                title = "2025 Dogiver 해커톤 최우수상",
                description = "강아지 쇼핑몰 검색 서비스의 아키텍처, 데이터 모델링, API 개발 역할 수행",
                host = "도기버",
                achievedDate = LocalDate.of(2025, 3, 1),
                isActive = true
            ),
            Achievement(
                title = "SQLD",
                description = "데이터 모델링, 쿼리 질의문, 조인, 쿼리 최적화",
                host = "데이터자격검정",
                achievedDate = LocalDate.of(2021, 4, 2),
                isActive = true
            ),
            Achievement(
                title = "정보처리기사",
                description = "자료구조, 운영체제, 알고리즘, 데이터베이스 등",
                host = "한국산업인력공단",
                achievedDate = LocalDate.of(2020, 6, 2),
                isActive = true
            )
        )
        achievementRepository.saveAll(achievements)

        // introduction 초기화
        val introductions = mutableListOf<Introduction>(
            Introduction(content = "주도적으로 문제를 찾고, 해결하는 꼬부기입니다.", isActive = true),
            Introduction(content = "기술을 위한 기술이 아닌, 비즈니스 문제를 풀기 위한 기술을 추구합니다.", isActive = true),
            Introduction(content = "혼자가 아닌 팀원들과 함께, 최고가 아닌 최선의 방법을 찾아 문제를 빠르게 해결합니다.", isActive = true)
        )
        introductionRepository.saveAll(introductions)

        // link 초기화
        val links = mutableListOf<Link>(
            Link(name = "Github", content = "https://github.com/lsb530", isActive = true),
            Link(name = "Linkedin", content = "https://www.linkedin.com/in/lsb530", isActive = true),
            Link(name = "Person-hearts", content = "https://code-boki.tistory.com", isActive = true),
        )
        linkRepository.saveAll(links)

        // experience / experience_detail 초기화
        val experience1 = Experience(
            title = "광운대학교(Kwangwoon Univ.)",
            description = "소프트웨어학과",
            startYear = 2017,
            startMonth = 3,
            endYear = 2020,
            endMonth = 2,
            isActive = true
        )
        experience1.addDetails(
            mutableListOf(
                ExperienceDetail(content = "GPA 4.3/4.5", isActive = true),
                ExperienceDetail(content = "소프트웨어 연구 학회 활동", isActive = true)
            )
        )
        val experience2 = Experience(
            title = "주식회사 도기버(Dogiver Corp.)",
            description = "광고/추천 서비스팀 백엔드 개발자",
            startYear = 2022,
            startMonth = 1,
            endYear = null,
            endMonth = null,
            isActive = true
        )
        experience2.addDetails(
            mutableListOf(
                ExperienceDetail(content = "유기견 위치 공유 서비스 개발", isActive = true),
                ExperienceDetail(content = "신입 교육 프로그램 우수상 수상", isActive = true)
            )
        )
        experienceRepository.saveAll(mutableListOf(experience1, experience2))

        // skill 초기화
        val java = Skill(name = "Java", type = SkillType.LANGUAGE.name, isActive = true)
        val kotlin = Skill(name = "Kotlin", type = SkillType.LANGUAGE.name, isActive = true)
        val javascript = Skill(name = "Javascript", type = SkillType.LANGUAGE.name, isActive = true)
        val python = Skill(name = "Python", type = SkillType.LANGUAGE.name, isActive = true)
        val spring = Skill(name = "Spring", type = SkillType.FRAMEWORK.name, isActive = true)
        val mysql = Skill(name = "MySQL", type = SkillType.DATABASE.name, isActive = true)
        val jdbc = Skill(name = "JDBC", type = SkillType.LIBRARY.name, isActive = true)
        val mybatis = Skill(name = "MyBatis", type = SkillType.LIBRARY.name, isActive = true)
        val jpa = Skill(name = "JPA", type = SkillType.LIBRARY.name, isActive = true)
        val vue = Skill(name = "Vue", type = SkillType.LIBRARY.name, isActive = true)
        val angular = Skill(name = "Angular", type = SkillType.LIBRARY.name, isActive = true)
        val react = Skill(name = "React", type = SkillType.LIBRARY.name, isActive = true)
        val redis = Skill(name = "Redis", type = SkillType.DATABASE.name, isActive = true)
        val rabbitMQ = Skill(name = "RabbitMQ", type = SkillType.TOOL.name, isActive = true)
        val kafka = Skill(name = "Kafka", type = SkillType.TOOL.name, isActive = true)
        val django = Skill(name = "Django", type = SkillType.FRAMEWORK.name, isActive = false)
        skillRepository.saveAll(mutableListOf(java, kotlin, javascript, python, spring, mysql, jdbc, mybatis, jpa, vue, angular, react, redis, rabbitMQ, kafka, django))

        // project / project_detail / project_skill 초기화

        val project1 = Project(
            name = "유기견 발견 정보 공유 서비스",
            description = "유기견 위치의 실시간 공유, 임시보호까지 연결해주는 서비스. 구글 맵스를 연동하여 유기묘 위치 정보를 직관적으로 파악할 수 있도록 하는 사용자 경험 개선 작업.",
            startYear = 2022,
            startMonth = 9,
            endYear = 2023,
            endMonth = 4,
            isActive = true
        )
        project1.addDetails(
            mutableListOf(
                ProjectDetail(content = "구글 맵스를 활용한 유기견 발견 지역 정보 제공 API 개발", url = null, isActive = true),
                ProjectDetail(content = "Redis 적용하여 인기 게시글의 조회 속도 1.7초 → 0.2초로 개선", url = null, isActive = true)
            )
        )
        project1.skills.addAll(
            mutableListOf(
                ProjectSkill(project = project1, skill = java),
                ProjectSkill(project = project1, skill = spring),
                ProjectSkill(project = project1, skill = mysql),
                ProjectSkill(project = project1, skill = redis)
            )
        )
        val project2 = Project(
            name = "반려동물 홈 카메라 움직임 감지 분석 모듈",
            description = "카메라에서 서버로 전달되는 신호를 분석하여 움직임이 감지될 경우 클라이언트에게 알림 발송 작업.",
            startYear = 2024,
            startMonth = 8,
            endYear = null,
            endMonth = null,
            isActive = true
        )
        project2.addDetails(
            mutableListOf(
                ProjectDetail(content = "PIL(Pillow) 활용하여 이미지 분석 기능 개발", url = null, isActive = true),
                ProjectDetail(content = "알림 발송을 비동기 처리하여 이미지 분석 - 알림 발송 기능간 의존도 감소", url = null, isActive = true),
            )
        )
        project2.skills.addAll(
            mutableListOf(
                ProjectSkill(project = project2, skill = python),
                ProjectSkill(project = project2, skill = kotlin),
                ProjectSkill(project = project2, skill = spring),
                ProjectSkill(project = project2, skill = rabbitMQ)
            )
        )
        projectRepository.saveAll(mutableListOf(project1, project2))

        val account = Account(
            loginId = "admin1",
            pw = "\$2a\$10\$BWi6SLqZRJyVvJyufjTtHeYXNNhpNY9rxaVl9fBOE.1t3QF98B.cO"
        )
        accountRepository.save(account)
    }
}
