
--  V1.1__Create_Schema_question.sql

--Schema: question

DROP SCHEMA question CASCADE ;
COMMIT;

CREATE SCHEMA question AUTHORIZATION postgres;

--Table: question.question

--DROP TABLE question.question;

CREATE TABLE question.question (
  questionid    integer NOT NULL,
  questiontext  varchar(300) NOT NULL,
  /* Keys */
  CONSTRAINT question_pkey
    PRIMARY KEY (questionid)
) WITH (
    OIDS = TRUE
  );

ALTER TABLE question.question
  OWNER TO postgres;

--Table: question.answer

--DROP TABLE question.answer;

CREATE TABLE question.answer (

  answerid     integer NOT NULL GENERATED BY DEFAULT AS IDENTITY,
  questionid   integer NOT NULL,
  answertext   varchar(300) NOT NULL,
  correctflag  boolean,
  /* Keys */
  CONSTRAINT answer_pkey
    PRIMARY KEY (answerid),
  /* Foreign keys */
  CONSTRAINT questionid
    FOREIGN KEY (questionid)
    REFERENCES question.question(questionid)
) WITH (
    OIDS = TRUE
  );

ALTER TABLE question.answer
  OWNER TO postgres;

COMMIT;