
--  V1.4__Load_Table_question.sql

DELETE FROM question.question;
COMMIT;

INSERT INTO question.question (questionid, questiontext) VALUES
  (1, 'How many Federal Reserve Districts are there? '), 
  (2, 'How many Federal Reserve Districts are in Missouri?'),
  (3, 'What is the district number for the St. Louis Fed?'),
  (4, 'How many branches does the St. Louis District have?'),
  (5, 'How often does the Federal Open Market Committee meet?'),
  (6, 'Who is the President of the St. Louis Federal Reserve Bank?'),
  (7, 'Something of value owned by a person or firm is called:'),
  (8, 'The part of a persons wealth that can be readily used to buy items is called:'),
  (9, 'The central banks goal for the average rate of inflation over the long run is called:'),
 (10, 'The buying or selling of bonds by the central bank is called:'),
 (11, 'The fraction of deposits that is required to be held at the Federal Reserve is called:'),
 (12, 'The interest rate on overnight loans between banks is called:'),
 (13, 'Something of value that a person or firm owes to someone else is called:'),
 (14, 'The measure of how frequently money is turned over in the economy is called:'),
 (15, 'Deposits that commercial banks hold at the Fecderal Reserve are called:')
;

COMMIT;