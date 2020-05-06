-- For testing purposes only!
DROP TABLE IF EXISTS members;

CREATE TABLE members (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  phone_number VARCHAR(250) DEFAULT NULL
);

INSERT INTO Member (id, name, email, phone_number) values (0, 'John Smith', 'john.smith@mailinator.com', '2125551212')