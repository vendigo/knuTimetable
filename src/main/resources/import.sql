--Importing some test data (Order is important)
-- 1 Faculties
INSERT INTO PUBLIC.FACULTIES (ID, DESCRIPTION, NAME) VALUES (1, '', 'Механіко-математичний факультет');
INSERT INTO PUBLIC.FACULTIES (ID, DESCRIPTION, NAME) VALUES (2, '', 'Радіо-фізичний факультет');
INSERT INTO PUBLIC.FACULTIES (ID, DESCRIPTION, NAME) VALUES (3, '', 'Фізичний факультет');
INSERT INTO PUBLIC.FACULTIES (ID, DESCRIPTION, NAME) VALUES (4, '', 'Факультет кібернетики');
-- 2 Groups
INSERT INTO PUBLIC.GROUPS (ID, FACULTY_ID, COURSE_NUMBER, NAME, DEPARTMENT, DESCRIPTION) VALUES (1, 1, 1, '1 група математики', null, null);
-- 10 Pairs
INSERT INTO PUBLIC.PAIRS (ID, GROUP_ID, WEEK_STATUS, DAY_OF_WEEK, NUMBER_OF_PAIR, SUBJECT, PAIR_TYPE, EXAM_TYPE, TEACHER, CABINET) VALUES (1, 1, 'ALWAYS', 'MONDAY', 1, 'Математичний аналіз', 'LECTURE', 'EXAM', 'Назаренко М. О.', 42);
