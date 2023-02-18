package org.example;

public class Main {
    public static void main(String[] args) {
//        skypro=# SELECT first_name AS Имя,
//        skypro-# last_name AS Фамилия,
//                skypro-# gender AS Пол,
//                skypro-# age AS Возраст
//        skypro-# FROM employee
//        skypro-# GROUP BY Фамилия, Имя, Пол, Возраст;
//        Имя  |    Фамилия    |  Пол  | Возраст
//                -------+---------------+-------+---------
//                Oleg  | Ivanov        | man   |      35
//        Kate  | Petrova       | woman |      25
//        Vasya | Petrov        | man   |      55
//        Anna  | Petrova       | woman |      45
//        Roman | Pshenichnikov | man   |      21
//        (5 строк)
//        skypro=# SELECT * FROM employee
//        skypro-# WHERE age < 30 OR age > 50;
//        id | first_name |   last_name   | gender | age
//                ----+------------+---------------+--------+-----
//                1 | Roman      | Pshenichnikov | man    |  21
//        3 | Vasya      | Petrov        | man    |  55
//        5 | Kate       | Petrova       | woman  |  25
//        (3 строки)
//        skypro=# SELECT * FROM employee
//        skypro-# WHERE age > 30 OR age < 50;
//        id | first_name |   last_name   | gender | age
//                ----+------------+---------------+--------+-----
//                1 | Roman      | Pshenichnikov | man    |  21
//        2 | Oleg       | Ivanov        | man    |  35
//        3 | Vasya      | Petrov        | man    |  55
//        4 | Anna       | Petrova       | woman  |  45
//        5 | Kate       | Petrova       | woman  |  25
//        (5 строк)
//        skypro=# SELECT first_name, last_name, gender, age
//        skypro-# FROM employee
//        skypro-# ORDER BY last_name DESC, first_name, gender, age;
//        first_name |   last_name   | gender | age
//                ------------+---------------+--------+-----
//                Roman      | Pshenichnikov | man    |  21
//        Anna       | Petrova       | woman  |  45
//        Kate       | Petrova       | woman  |  25
//        Vasya      | Petrov        | man    |  55
//        Oleg       | Ivanov        | man    |  35
//        (5 строк)
//        Не пойму через какой оператор делать 6 задание
//  Задание 2
//        skypro=# UPDATE employee
//        skypro-# SET first_name = 'Anna'
//        skypro-# WHERE id = 4;
//        UPDATE 1
//        skypro=# UPDATE employee
//        skypro-# SET first_name = 'Anna'
//        skypro-# WHERE id = 5;
//        UPDATE 1
//        skypro=# SELECT * FROM employee;
//        id | first_name | last_name | gender | age
//                ----+------------+-----------+--------+-----
//                1 | Roman      | Ivanov    | man    |  21
//        2 | Roman      | Ivanov    | man    |  35
//        3 | Oleg       | Ivanov    | man    |  55
//        4 | Anna       | Ivanov    | woman  |  45
//        5 | Anna       | Ivanov    | woman  |  25
//        (5 строк)
//        skypro=# SELECT first_name,
//        skypro-# SUM(age)
//        skypro-# FROM employee
//        skypro-# GROUP BY first_name;
//        first_name | sum
//                ------------+-----
//                Anna       |  70
//                Roman      |  56
//                Oleg       |  55
//        (3 строки)
//        skypro=# SELECT first_name AS Имя, age
//        skypro-# FROM employee
//        skypro-# WHERE age < 22
//        skypro-# ORDER BY Имя;
//        Имя  | age
//        -------+-----
//        Roman |  21
//        skypro=# SELECT first_name, age
//        skypro-# FROM employee
//        skypro-# WHERE first_name = 'Oleg' AND age > 40 OR first_name = 'Anna' AND age > 25;
//        first_name | age
//                ------------+-----
//                Oleg       |  55
//        Anna       |  45
//        (2 строки)
    }
}