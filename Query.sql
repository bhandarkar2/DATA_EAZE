DROP PROCEDURE if exists sp_helloworld

DELIMITER $$

CREATE PROCEDURE sp_helloworld()
BEGIN
    INSERT INTO result VALUES (1, 'Hello World!');
END;
$$

DELIMITER ;

