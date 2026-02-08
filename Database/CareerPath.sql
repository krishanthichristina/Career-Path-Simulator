CREATE TABLE career_paths (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    risk_level ENUM('LOW', 'MEDIUM', 'HIGH') NOT NULL,
    demand_score INT NOT NULL CHECK (demand_score BETWEEN 1 AND 5),
    base_salary DECIMAL(12,2) NOT NULL,
    annual_growth_rate DECIMAL(5,2) NOT NULL,
    description TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE skills (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    category VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE career_requirements (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    career_id BIGINT NOT NULL,
    skill_id BIGINT NOT NULL,
    required_level INT NOT NULL CHECK (required_level BETWEEN 1 AND 5),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_career
        FOREIGN KEY (career_id)
        REFERENCES career_paths(id)
        ON DELETE CASCADE,

    CONSTRAINT fk_skill
        FOREIGN KEY (skill_id)
        REFERENCES skills(id)
        ON DELETE CASCADE
);


INSERT INTO skills (name, category) VALUES
('Programming', 'Technical'),
('Mathematics', 'Technical'),
('Communication', 'Soft Skill'),
('Leadership', 'Soft Skill'),
('Analytical Thinking', 'Cognitive'),
('Creativity', 'Cognitive');


INSERT INTO career_paths 
(name, risk_level, demand_score, base_salary, annual_growth_rate, description)
VALUES
('Software Engineer', 'MEDIUM', 5, 70000, 8.0, 'Designs and builds software systems.'),
('Data Scientist', 'MEDIUM', 5, 80000, 9.0, 'Analyzes complex data for insights.'),
('Cybersecurity Specialist', 'LOW', 4, 75000, 7.5, 'Protects systems from cyber threats.'),
('Product Manager', 'HIGH', 4, 85000, 10.0, 'Leads product strategy and teams.'),
('Startup Founder', 'HIGH', 3, 50000, 20.0, 'Builds and scales new businesses.');


INSERT INTO career_requirements (career_id, skill_id, required_level)
VALUES
(1, 1, 4),  -- Programming level 4
(1, 2, 3),  -- Mathematics level 3
(1, 3, 3),  -- Communication level 3
(1, 5, 4);  -- Analytical Thinking level 4
