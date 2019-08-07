
--  V1.3__Load_Table_player.sql

DELETE FROM game.player;
COMMIT;

INSERT INTO game.player (gameid, playernm, score) VALUES
  (1, 'player01', 12),
  (1, 'player02', 15),
  (1, 'player03', 8),
  (1, 'player04', 11),
  (2, 'player05', NULL),
  (2, 'player06', NULL);
COMMIT;  
