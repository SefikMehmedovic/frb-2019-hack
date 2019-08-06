
--  V1.4__Load_Table_question.sql

DELETE FROM question;
COMMIT;

INSERT INTO question (questionid, questiontext) VALUES
  (1, 'How many Federal Reserve Districts are there? '), 
  (2, 'How many Federal Reserve Districts are in Missouri?'),
  (3, 'What is the district number for the St. Louis Fed?'),
  (4, 'How many branches does the St. Louis District have?'),
  (5, 'How often does the Federal Open Market Committee meet?'),
  (6, 'Who is the President of the St. Louis Federal Reserve Bank?'),
  (11, 'How many Federal Reserve employees are there? '),
  (22, 'Hhhhhhow many Federal Reserve buildings are in Missouri?'),
  (33, 'What is the district number for the St. Louis Fed?'),
  (43, 'How manyYYYY branches does theKansas District have?'),
  (55, 'HowWWW often does the Federal Open Market Committee meet?'),
  (66, 'WhoOOOO is the President of the St. Louis Federal Reserve Bank?')
;

COMMIT;