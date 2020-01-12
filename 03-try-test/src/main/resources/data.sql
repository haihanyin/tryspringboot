DROP TABLE IF EXISTS book;

CREATE TABLE book
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

INSERT INTO book (name)
VALUES ('Ulysses'),
       ('Don Quixote'),
       ('All Passion Spent');