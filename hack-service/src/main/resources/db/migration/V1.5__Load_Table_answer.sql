
--  V1.5__Load_Table_answer.sql

DELETE FROM question.answer;
COMMIT;

INSERT INTO question.answer (questionid, answertext, correctflag) VALUES
  (1, '8', false),
  (1, '12', true),
  (1, '15', false),
  (1, '10', false),
  (2, '3', false),
  (2, '0', false),
  (2, '1', false),
  (2, '2', true),
  (3, '8', true),
  (3, '12', false),
  (3, '5', false),
  (3, '10', false),
  (4, '4', true),
  (4, '3', false),
  (4, '2', false),
  (4, '1', false),
  (5, 'Monthly', false),
  (5, 'Eight times a year', true),
  (5, 'Semi-Annually', false),
  (5, 'Quarterly', false),
  (6, 'Christopher J. Waller', false),
  (6, 'Janet Yellen', false),
  (6, 'Jerome H. Powell', false),
  (6, 'James Bullard', true);

COMMIT;
