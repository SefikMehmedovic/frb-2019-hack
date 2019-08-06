
--  V1.2__Load_Table_game.sql

DELETE FROM game ;
COMMIT;

INSERT INTO game (gameid, starttime) VALUES
  (1, '2019-01-01 05:00:00'),
  (2, '2019-01-01 21:10:00');
  
COMMIT;  
