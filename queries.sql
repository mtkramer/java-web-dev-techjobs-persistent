## Part 1: Test it with SQL
id int PK
employer varchar(255)
name varchar(255)
skills varchar(255)

## Part 2: Test it with SQL
SELECT name FROM techjobs.employer WHERE employer.location = 'St. Louis City';

## Part 3: Test it with SQL
DROP TABLE techjobs.employer;

## Part 4: Test it with SQL
SELECT * FROM techjobs.skill WHERE techjobs.skill.id
IN (SELECT techjobs.job_skills.skills_id FROM techjobs.job_skills)
ORDER BY techjobs.skill.name ASC;