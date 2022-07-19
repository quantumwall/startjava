SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status != 'Destroyed';
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';
SELECT * FROM Jaegers ORDER BY mark DESC;
SELECT * FROM Jaegers ORDER BY launch LIMIT 1;
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers) OR kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);
SELECT AVG(weight) AS weight_average FROM Jaegers;
UPDATE Jaegers SET kaijukill = (kaijukill + 1) WHERE id IN (SELECT id FROM Jaegers WHERE status != 'Destroyed');
DELETE FROM Jaegers WHERE STATUS = 'Destroyed';
