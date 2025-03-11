INSERT INTO achievement(title, description, host, achieved_date, is_active, created_date_time,
                        updated_date_time)
VALUES ('2022 Catkao 해커톤 최우수상',
        '고양이 쇼핑몰 검색 서비스의 아키텍처, 데이터 모델링, API 개발 역할 수행',
        '캣카오',
        '2022-08-01',
        TRUE,
        NOW(),
        NOW())
     , ('정보처리기사',
        '자료구조, 운영체제, 알고리즘, 데이터베이스 등',
        '한국산업인력공단',
        '2020-02-02',
        TRUE, NOW(),
        NOW())
;

INSERT INTO introduction(content, is_active, created_date_time, updated_date_time)
VALUES ('주도적으로 문제를 찾고, 해결하는 고양이입니다.', TRUE, NOW(), NOW())
     , ('기술을 위한 기술이 아닌, 비즈니스 문제를 풀기 위한 기술을 추구합니다.', TRUE, NOW(), NOW())
     , ('기존 소스를 리팩토링하여 더 좋은 구조로 개선하는 작업을 좋아합니다.', TRUE, NOW(), NOW())
;

INSERT INTO link(name, content, is_active, created_date_time, updated_date_time)
VALUES ('Github', 'https://github.com/infomuscle', TRUE, NOW(), NOW())
     , ('Linkedin', 'https://www.linkedin.com/in/bokeunjeong', TRUE, NOW(), NOW())
;

INSERT INTO skill(name, skill_type, is_active, created_date_time, updated_date_time)
VALUES ('Java', 'LANGUAGE', TRUE, NOW(), NOW())
     , ('Kotlin', 'LANGUAGE', TRUE, NOW(), NOW())
     , ('Python', 'LANGUAGE', TRUE, NOW(), NOW())
     , ('Spring', 'FRAMEWORK', TRUE, NOW(), NOW())
     , ('Django', 'FRAMEWORK', TRUE, NOW(), NOW())
     , ('MySQL', 'DATABASE', TRUE, NOW(), NOW())
     , ('Redis', 'DATABASE', TRUE, NOW(), NOW())
     , ('Kafka', 'TOOL', TRUE, NOW(), NOW())
;

INSERT INTO experience(title, description, start_year, start_month, end_year, end_month,
                       is_active, created_date_time, updated_date_time)
VALUES ('캣홀릭대학교(CatHolic Univ.)', '컴퓨터공학 전공', 2018, 9, 2022, 08, TRUE, NOW(), NOW())
     , ('주식회사 캣카오(Catkao Corp.)', '소셜서비스팀 백엔드 개발자', 2022, 9, NULL, NULL, TRUE, NOW(), NOW())
;

INSERT INTO experience_detail(experience_id, content, is_active, created_date_time,
                              updated_date_time)
VALUES (1, 'GPA 4.3/4.5', TRUE, NOW(), NOW())
     , (1, '소프트웨어 연구 학회 활동', TRUE, NOW(), NOW())
     , (2, '유기묘 위치 공유 서비스 개발', TRUE, NOW(), NOW())
     , (2, '신입 교육 프로그램 우수상 수상', TRUE, NOW(), NOW())
;

INSERT INTO project(name, description, start_year, start_month, end_year, end_month, is_active,
                    created_date_time, updated_date_time)
VALUES ('유기묘 발견 정보 공유 서비스',
        '유기묘 위치의 실시간 공유, 임시보호까지 연결해주는 서비스. 구글 맵스를 연동하여 유기묘 위치 정보를 직관적으로 파악할 수 있도록 하는 사용자 경험 개선 작업.',
        2022, 9, 2022, 12, TRUE, NOW(), NOW())
     , ('반려동물 홈 카메라 움직임 감지 분석 모듈',
        '카메라에서 서버로 전달되는 신호를 분석하여 움직임이 감지될 경우 클라이언트에게 알림 발송 작업.',
        2022, 12, NULL, NULL, TRUE, NOW(), NOW())
;

INSERT INTO project_detail(project_id, content, url, is_active, created_date_time,
                           updated_date_time)
VALUES (1, '구글 맵스를 활용한 유기묘 발견 지역 정보 제공 API 개발', NULL, TRUE, NOW(), NOW())
     , (1, 'Redis 적용하여 인기 게시글의 조회 속도 1.5초 → 0.5초로 개선', NULL, TRUE, NOW(), NOW())
     , (2, 'PIL(Pillow) 활용하여 이미지 분석 기능 개발', NULL, TRUE, NOW(), NOW())
     , (2, '알림 발송을 비동기 처리하여 이미지 분석 - 알림 발송 기능간 의존도 감소', NULL, TRUE, NOW(), NOW())
     , (2, 'Github Repository', 'https://github.com/infomuscle', TRUE, NOW(), NOW())
;

INSERT INTO project_skill(project_id, skill_id, created_date_time, updated_date_time)
VALUES (1, 1, NOW(), NOW())
     , (1, 4, NOW(), NOW())
     , (1, 6, NOW(), NOW())
     , (1, 7, NOW(), NOW())
     , (2, 3, NOW(), NOW())
     , (2, 5, NOW(), NOW())
     , (2, 8, NOW(), NOW())
;