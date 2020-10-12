DROP SCHEMA IF EXISTS f17pwd CASCADE;
CREATE SCHEMA f17pwd;
SET search_path = f17pwd;

CREATE TABLE bruker 
(
   brukernavn CHARACTER VARYING (20),
   pwd_hash CHARACTER (64),
   pwd_salt CHARACTER (32),
   PRIMARY KEY (brukernavn)
);

INSERT INTO bruker VALUES 
	('per', 'per sin pwd_hash', 'per sitt salt'),
	('pål', 'pål sin pwd_hash', 'pål sitt salt'),
	('espen', 'espen sin pwd_hash', 'espen sitt salt');