SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status <> 'killed';
SELECT * FROM Jaegers WHERE (mark IN ('Mark-1', 'Mark-6'));
SELECT * FROM Jaegers ORDER BY mark;
SELECT * FROM Jaegers WHERE mark = (SELECT MIN(mark) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers;
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status <> 'killed';
DELETE FROM jaegers WHERE status = 'killed';