
--  V1.0__Create_Schema_game.sql

--Schema: game

DROP SCHEMA game CASCADE;
COMMIT;

CREATE SCHEMA game AUTHORIZATION postgres;

--Table: game.game

--DROP TABLE game.game;

CREATE TABLE game.game (
  gameid     integer NOT NULL GENERATED BY DEFAULT AS IDENTITY,
  starttime  timestamp without time zone,
  /* Keys */
  CONSTRAINT game_pkey
    PRIMARY KEY (gameid)
) WITH (
    OIDS = TRUE
  );

--Table: game.player

--DROP TABLE game.player;

CREATE TABLE game.player (
  playerid  integer NOT NULL GENERATED BY DEFAULT AS IDENTITY,
  gameid    integer NOT NULL,
  playernm  varchar(30),
  score     integer,
  /* Keys */
  CONSTRAINT player_pkey
    PRIMARY KEY (playerid),
  /* Foreign keys */
  CONSTRAINT gameid
    FOREIGN KEY (gameid)
    REFERENCES game.game(gameid)
) WITH (
    OIDS = TRUE
  );
COMMIT;