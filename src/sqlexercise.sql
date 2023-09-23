Person(
taxCode VARCHAR(255) PRIMARY KEY,
firstName VARCHAR(64),
lastName VARCHAR(64),
age INTEGER,
)

INSERT INTO Person VALUES('abc','Alessandro','Venuti',26);
SELECT * FROM Person WHERE age<18;
SELECT * FROM Person WHERE firstName='Pippo';
SELECT COUNT(*) AS oldPerson FROM Person WHERE age>30;
SELECT age,COUNT(*) AS ageCount FROM Person GROUP BY age;