# CREATE DATABASE portfolio;
USE portfolio;
CREATE TABLE account
(
    account_id        int NOT NULL AUTO_INCREMENT,
    login_id          varchar(20),
    password          varchar(255),
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (account_id)
);

CREATE TABLE http_interface
(
    http_interface_id int NOT NULL AUTO_INCREMENT,
    cookies           varchar(255),
    referer           varchar(255),
    local_addr        varchar(255),
    remote_addr       varchar(255),
    remote_host       varchar(255),
    request_uri       varchar(255),
    user_agent        varchar(255),
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (http_interface_id)
);

CREATE TABLE achievement
(
    achievement_id    int NOT NULL AUTO_INCREMENT,
    created_date_time datetime,
    title             varchar(255),
    description       varchar(255),
    achieved_date     date,
    host              varchar(255),
    is_active         bit,
    updated_date_time datetime,
    PRIMARY KEY (achievement_id)
);

CREATE TABLE introduction
(
    introduction_id   int NOT NULL AUTO_INCREMENT,
    content           varchar(255),
    is_active         bit,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (introduction_id)
);

CREATE TABLE link
(
    link_id           int NOT NULL AUTO_INCREMENT,
    name              varchar(255),
    content           varchar(255),
    is_active         bit,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (link_id)
);

CREATE TABLE skill
(
    skill_id          int NOT NULL AUTO_INCREMENT,
    name              varchar(255),
    skill_type        varchar(255),
    is_active         bit,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (skill_id)
);

CREATE TABLE experience
(
    experience_id     int NOT NULL AUTO_INCREMENT,
    title             varchar(255),
    description       varchar(255),
    start_year        smallint,
    start_month       tinyint,
    end_year          smallint,
    end_month         tinyint,
    is_active         bit,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (experience_id)
);

CREATE TABLE experience_detail
(
    experience_detail_id int NOT NULL AUTO_INCREMENT,
    experience_id        int,
    content              varchar(255),
    is_active            bit,
    created_date_time    datetime,
    updated_date_time    datetime,
    PRIMARY KEY (experience_detail_id),
    FOREIGN KEY (experience_id) REFERENCES experience (experience_id)
);

CREATE TABLE project
(
    project_id        int NOT NULL AUTO_INCREMENT,
    name              varchar(255),
    description       varchar(255),
    start_year        smallint,
    start_month       tinyint,
    end_year          smallint,
    end_month         tinyint,
    is_active         bit,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (project_id)
);

CREATE TABLE project_detail
(
    project_detail_id int NOT NULL AUTO_INCREMENT,
    project_id        int,
    content           varchar(255),
    url               varchar(255),
    is_active         bit,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (project_detail_id),
    FOREIGN KEY (project_id) REFERENCES project (project_id)
);

CREATE TABLE project_skill
(
    project_skill_id  int NOT NULL AUTO_INCREMENT,
    project_id        int,
    skill_id          int,
    created_date_time datetime,
    updated_date_time datetime,
    PRIMARY KEY (project_skill_id),
    FOREIGN KEY (project_id) REFERENCES project (project_id),
    FOREIGN KEY (skill_id) REFERENCES skill (skill_id)
);