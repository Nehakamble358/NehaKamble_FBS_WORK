#####                                       **ASSIGNMENT** **-2**



Q1Task / Problems:

1\) Create the table Member, Books and Issue without any constraints as

mentioned in the schema description above.



Q2) View the structure of the tables.

 

answer :- mysql> create table member

    -> (Member\_id int,Member\_name varchar(20),

    -> Member\_address varchar(30), Acc\_Open\_Allowed date,

    -> membership\_type varchar(20),Fees\_paid int,

    -> Max\_Books\_Allowed int,Penalty\_Amount decimal(7,2));

Query OK, 0 rows affected (0.03 sec)



mysql> desc member;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_id         | int          | YES  |     | NULL    |       |

| Member\_name       | varchar(20)  | YES  |     | NULL    |       |

| Member\_address    | varchar(30)  | YES  |     | NULL    |       |

| Acc\_Open\_Allowed  | date         | YES  |     | NULL    |       |

| membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int          | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int          | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+



Answer :-

mysql> create table books

    -> (Book\_No int,Book\_Name varchar(30),Author\_name varchar(30),

    -> Cost Decimal(7,2),Category char(10));

Query OK, 0 rows affected (0.02 sec)



mysql> desc books;

+-------------+--------------+------+-----+---------+-------+

| Field       | Type         | Null | Key | Default | Extra |

+-------------+--------------+------+-----+---------+-------+

| Book\_No     | int          | YES  |     | NULL    |       |

| Book\_Name   | varchar(30)  | YES  |     | NULL    |       |

| Author\_name | varchar(30)  | YES  |     | NULL    |       |

| Cost        | decimal(7,2) | YES  |     | NULL    |       |

| Category    | char(10)     | YES  |     | NULL    |       |

+-------------+--------------+------+-----+---------+-------+



Answer:-

mysql> create table issue

    -> (Lib\_issue\_id int,Book\_No int,Member\_id int,issu\_date date,Return\_date date);

Query OK, 0 rows affected (0.03 sec)



mysql> desc issue;

+--------------+------+------+-----+---------+-------+

| Field        | Type | Null | Key | Default | Extra |

+--------------+------+------+-----+---------+-------+

| Lib\_issue\_id | int  | YES  |     | NULL    |       |

| Book\_No      | int  | YES  |     | NULL    |       |

| Member\_id    | int  | YES  |     | NULL    |       |

| issu\_date    | date | YES  |     | NULL    |       |

| Return\_date  | date | YES  |     | NULL    |       |

+--------------+------+------+-----+---------+-------+



Q3) Drop the Member table

Ans:-

 mysql> desc member;

+-----------------+--------------+------+-----+---------+-------+

| Field           | Type         | Null | Key | Default | Extra |

+-----------------+--------------+------+-----+---------+-------+

| member\_id       | int          | YES  |     | NULL    |       |

| member\_name     | varchar(30)  | YES  |     | NULL    |       |

| member\_address  | varchar(50)  | YES  |     | NULL    |       |

| Acc\_Open\_Date   | date         | YES  |     | NULL    |       |

| Membership\_type | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid       | int          | YES  |     | NULL    |       |

| Penalty\_Amount  | decimal(7,2) | YES  |     | NULL    |       |

+-----------------+--------------+------+-----+---------+-------+

7 rows in set (0.00 sec)



mysql> drop table member;

Query OK, 0 rows affected (0.03 sec)



mysql> desc member;

ERROR 1146 (42S02): Table 'firstbit\_sql.member' doesn't exist



Q4) Create the table Member again as per the schema description with the

following constraints.

a.

b.

Member\_Id – Primary Key

Membership\_type - ‘Lifetime’,’ Annual’, ‘Half Yearly’,’ Quarterly’



Ans:-

mysql> alter table member

    -> add primary key(member\_id);

Query OK, 0 rows affected (0.07 sec)

Records: 0  Duplicates: 0  Warnings: 0

mysql> desc member;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_id         | int          | NO   | PRI | NULL    |       |

| Member\_name       | varchar(20)  | YES  |     | NULL    |       |

| Member\_address    | varchar(30)  | YES  |     | NULL    |       |

| Acc\_Open\_Allowed  | date         | YES  |     | NULL    |       |

| membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int          | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int          | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+



Q5) Modify the table Member increase the width of the member name to 30

characters.

Ans:-mysql> alter table member

    -> modify column member\_name varchar(30);

Query OK, 0 rows affected (0.01 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> desc member;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_id         | int          | NO   | PRI | NULL    |       |

| member\_name       | varchar(30)  | YES  |     | NULL    |       |

| Member\_address    | varchar(30)  | YES  |     | NULL    |       |

| Acc\_Open\_Allowed  | date         | YES  |     | NULL    |       |

| membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int          | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int          | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+



Q6) Add a column named as Reference of Char(30) to Issue table.

Ans:-mysql> alter table issue

    -> add column Reference char(30);

Query OK, 0 rows affected (0.05 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> desc issue;

+--------------+----------+------+-----+---------+-------+

| Field        | Type     | Null | Key | Default | Extra |

+--------------+----------+------+-----+---------+-------+

| Lib\_issue\_id | int      | YES  |     | NULL    |       |

| Book\_No      | int      | YES  |     | NULL    |       |

| Member\_id    | int      | YES  |     | NULL    |       |

| issu\_date    | date     | YES  |     | NULL    |       |

| Return\_date  | date     | YES  |     | NULL    |       |

| Reference    | char(30) | YES  |     | NULL    |       |

+--------------+----------+------+-----+---------+-------+



Q7) Delete/Drop the column Reference from Issue.

Ans:-mysql> alter table issue

    -> drop column reference ;

Query OK, 0 rows affected (0.08 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> desc issue;

+--------------+------+------+-----+---------+-------+

| Field        | Type | Null | Key | Default | Extra |

+--------------+------+------+-----+---------+-------+

| Lib\_issue\_id | int  | YES  |     | NULL    |       |

| Book\_No      | int  | YES  |     | NULL    |       |

| Member\_id    | int  | YES  |     | NULL    |       |

| issu\_date    | date | YES  |     | NULL    |       |

| Return\_date  | date | YES  |     | NULL    |       |

+--------------+------+------+-----+---------+-------+



Q8) Rename the table Issue to Lib\_Issue.

Ans:-mysql> alter table issue

    -> rename to lib\_issue;

Query OK, 0 rows affected (0.03 sec)





mysql> desc lib\_issue;

+--------------+------+------+-----+---------+-------+

| Field        | Type | Null | Key | Default | Extra |

+--------------+------+------+-----+---------+-------+

| Lib\_issue\_id | int  | YES  |     | NULL    |       |

| Book\_No      | int  | YES  |     | NULL    |       |

| Member\_id    | int  | YES  |     | NULL    |       |

| issu\_date    | date | YES  |     | NULL    |       |

| Return\_date  | date | YES  |     | NULL    |       |

+--------------+------+------+-----+---------+-------+



Q9) Insert following data in table Member.

Ans:-mysql> insert into member

    -> (Member\_id,Member\_Name,Member\_address,Acc\_Open\_Allowed,membership\_type,Fees\_paid,Max\_Books\_Allowed,Penalty\_Amount)

    -> values(1,"Richa Sharma","pune","10-12-05","Lifetime",2500,5,50),

    -> (2,"Garima Sen","pune","25-09-27","Annual",1000,3,NULL);

Query OK, 2 rows affected (0.01 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> table member;

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

| Member\_id | member\_name  | Member\_address | Acc\_Open\_Allowed | membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | pune           | 2010-12-05       | Lifetime        |      2500 |                 5 |          50.00 |

|         2 | Garima Sen   | pune           | 2025-09-27       | Annual          |      1000 |                 3 |           NULL |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

2 rows in set (0.00 sec)



Q10) Insert at least 5 records with suitable data.

mysql> insert into member

    -> (member\_id,member\_name,member\_address,acc\_open\_allowed,membership\_type,fees\_paid,max\_books\_allowed,penalty\_amount)

    -> values(4,"Diksha pande","Washim","2023-12-6","lifetime",2300,5,70

    -> ),(5,"Punam kamble","Nashik","2022-5-6","lifetime",4300,2,40);

Query OK, 2 rows affected (0.01 sec)

Records: 2  Duplicates: 0  Warnings: 0



mysql> table member;

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

| Member\_id | member\_name  | Member\_address | Acc\_Open\_Allowed | membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | pune           | 2010-12-05       | Lifetime        |      2500 |                 5 |          50.00 |

|         2 | Garima Sen   | pune           | 2025-09-27       | Annual          |      1000 |                 3 |           NULL |

|         3 | Neha kamble  | Akola          | 2023-10-15       | lifetime        |      2000 |                 4 |          60.00 |

|         4 | Diksha pande | Washim         | 2023-12-06       | lifetime        |      2300 |                 5 |          70.00 |

|         5 | Punam kamble | Nashik         | 2022-05-06       | lifetime        |      4300 |                 2 |          40.00 |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+



Q11)  Modify the column Member\_name. Decrease the width of the member

name to 20 characters. (If it does not allow state the reason for that)

ans:-mysql> alter table member

    -> modify column member\_name varchar(20);

Query OK, 5 rows affected (0.13 sec)

Records: 5  Duplicates: 0  Warnings: 0



mysql> desc member;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_id         | int          | NO   | PRI | NULL    |       |

| member\_name       | varchar(20)  | YES  |     | NULL    |       |

| Member\_address    | varchar(30)  | YES  |     | NULL    |       |

| Acc\_Open\_Allowed  | date         | YES  |     | NULL    |       |

| membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int          | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int          | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+



Q12) Try to insert a record with Max\_Books\_Allowed = 110, Observe   the

error that comes.



Ans:-mysql> insert into member(member\_id,member\_name,max\_books\_allowed)

    -> values(6,"john deo",110);

Query OK, 1 row affected (0.02 sec)



mysql> table member;

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

| Member\_id | member\_name  | Member\_address | Acc\_Open\_Allowed | membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | pune           | 2010-12-05       | Lifetime        |      2500 |                 5 |          50.00 |

|         2 | Garima Sen   | pune           | 2025-09-27       | Annual          |      1000 |                 3 |           NULL |

|         3 | Neha kamble  | Akola          | 2023-10-15       | lifetime        |      2000 |                 4 |          60.00 |

|         4 | Diksha pande | Washim         | 2023-12-06       | lifetime        |      2300 |                 5 |          70.00 |

|         5 | Punam kamble | Nashik         | 2022-05-06       | lifetime        |      4300 |                 2 |          40.00 |

|         6 | john deo     | NULL           | NULL             | NULL            |      NULL |               110 |           NULL |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+



13\) Generate another table named Member101 using a Create command

along with a simple SQL query on member table.

Ans:-mysql> create table member101 as select\*from member;

Query OK, 6 rows affected (0.07 sec)

Records: 6  Duplicates: 0  Warnings: 0



mysql> desc member101;

+-------------------+--------------+------+-----+---------+-------+

| Field             | Type         | Null | Key | Default | Extra |

+-------------------+--------------+------+-----+---------+-------+

| Member\_id         | int          | NO   |     | NULL    |       |

| member\_name       | varchar(20)  | YES  |     | NULL    |       |

| Member\_address    | varchar(30)  | YES  |     | NULL    |       |

| Acc\_Open\_Allowed  | date         | YES  |     | NULL    |       |

| membership\_type   | varchar(20)  | YES  |     | NULL    |       |

| Fees\_paid         | int          | YES  |     | NULL    |       |

| Max\_Books\_Allowed | int          | YES  |     | NULL    |       |

| Penalty\_Amount    | decimal(7,2) | YES  |     | NULL    |       |

+-------------------+--------------+------+-----+---------+-------+

8 rows in set (0.01 sec)



mysql> table member101;

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

| Member\_id | member\_name  | Member\_address | Acc\_Open\_Allowed | membership\_type | Fees\_paid | Max\_Books\_Allowed | Penalty\_Amount |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+

|         1 | Richa Sharma | pune           | 2010-12-05       | Lifetime        |      2500 |                 5 |          50.00 |

|         2 | Garima Sen   | pune           | 2025-09-27       | Annual          |      1000 |                 3 |           NULL |

|         3 | Neha kamble  | Akola          | 2023-10-15       | lifetime        |      2000 |                 4 |          60.00 |

|         4 | Diksha pande | Washim         | 2023-12-06       | lifetime        |      2300 |                 5 |          70.00 |

|         5 | Punam kamble | Nashik         | 2022-05-06       | lifetime        |      4300 |                 2 |          40.00 |

|         6 | john deo     | NULL           | NULL             | NULL            |      NULL |               110 |           NULL |

+-----------+--------------+----------------+------------------+-----------------+-----------+-------------------+----------------+



Q14) Add the constraints on columns max\_books\_allowed  and penalty\_amt

as follows

a. max\_books\_allowed  < 100

b. penalty\_amt maximum 1000

Also give names to the constraints.

Ans:-





Q15) Drop the table books.

Ans :-mysql> desc books;

+-------------+--------------+------+-----+---------+-------+

| Field       | Type         | Null | Key | Default | Extra |

+-------------+--------------+------+-----+---------+-------+

| Book\_No     | int          | YES  |     | NULL    |       |

| Book\_Name   | varchar(30)  | YES  |     | NULL    |       |

| Author\_name | varchar(30)  | YES  |     | NULL    |       |

| Cost        | decimal(7,2) | YES  |     | NULL    |       |

| Category    | char(10)     | YES  |     | NULL    |       |

+-------------+--------------+------+-----+---------+-------+

5 rows in set (0.00 sec)



mysql> drop table books;

Query OK, 0 rows affected (0.04 sec)



mysql> desc books;

ERROR 1146 (42S02): Table 'firstbit\_sql.books' doesn't exist



Q16) Create table Books again as per the schema description with the

following constraints.

a. Book\_No – Primary Key

b. Book\_Name – Not Null

c. Category – System, Fiction, Database, RDBMS, Others.



ans:-mysql> alter table books

&nbsp;   -> add primary key(Book\_no);

Query OK, 0 rows affected (0.16 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> desc books;

+-----------+-------------+------+-----+---------+-------+

| Field     | Type        | Null | Key | Default | Extra |

+-----------+-------------+------+-----+---------+-------+

| Book\_no   | int         | NO   | PRI | NULL    |       |

| book\_name | varchar(60) | YES  |     | NULL    |       |

| Author    | varchar(20) | YES  |     | NULL    |       |

| Cost      | int         | YES  |     | NULL    |       |

| Category  | varchar(20) | YES  |     | NULL    |       |

+-----------+-------------+------+-----+---------+-------+



Q17) Insert data in Book table as follows:

Ans:- mysql> insert into books

    -> (Book\_no,Book\_name,Author,Cost,Category)

    -> values(101,"Let us C","Denis Ritchie",450,"System")

    -> ,(102,"Oracle\_Complete Ref","Loni",550,"Databases"),

    -> (103,"Mastering SQL","Loni",250,"Databases"),

    -> (104,"PL SQL-Ref","Scott Urman",750,"Databases");

Query OK, 4 rows affected (0.01 sec)

Records: 4  Duplicates: 0  Warnings: 0



mysql> select \* from books;

+---------+---------------------+---------------+------+-----------+

| Book\_no | Book\_name           | Author        | Cost | Category  |

+---------+---------------------+---------------+------+-----------+

|     101 | Let us C            | Denis Ritchie |  450 | System    |

|     102 | Oracle\_Complete Ref | Loni          |  550 | Databases |

|     103 | Mastering SQL       | Loni          |  250 | Databases |

|     104 | PL SQL-Ref          | Scott Urman   |  750 | Databases |

+---------+---------------------+---------------+------+-----------+



Q18) Insert more records in Book table.

Ans:-

mysql> insert into books

    -> values(105,"The Alchemist","Paulo Coelho",299,"Motivation"),

    -> (106,"Wings of Fire","A.P.J. Abdul kalam",350,"Biography"),

    -> (107,"Rich Dad Poor Dad","Robert kiyosaki",400,"Finance"),

    -> (108,"The Monk Who Sold His Ferrari","Robin sharma",250,"Self-help"),

    -> (109,"india 2020","Abdul kalam",280,"Education");

Query OK, 5 rows affected (0.01 sec)

Records: 5  Duplicates: 0  Warnings: 0



mysql> select\*from books;

+---------+-------------------------------+--------------------+------+------------+

| Book\_no | book\_name                     | Author             | Cost | Category   |

+---------+-------------------------------+--------------------+------+------------+

|     101 | Let us C                      | Denis Ritchie      |  450 | System     |

|     102 | Oracle\_Complete Ref           | Loni               |  550 | Databases  |

|     103 | Mastering SQL                 | Loni               |  250 | Databases  |

|     104 | PL SQL-Ref                    | Scott Urman        |  750 | Databases  |

|     105 | The Alchemist                 | Paulo Coelho       |  299 | Motivation |

|     106 | Wings of Fire                 | A.P.J. Abdul kalam |  350 | Biography  |

|     107 | Rich Dad Poor Dad             | Robert kiyosaki    |  400 | Finance    |

|     108 | The Monk Who Sold His Ferrari | Robin sharma       |  250 | Self-help  |

|     109 | india 2020                    | Abdul kalam        |  280 | Education  |

+---------+-------------------------------+--------------------+------+------------+



Q19) View the data in the tables using simple SQL query.

Ans:-



Q20) Insert into Book following data.

Ans:-mysql> insert into books

&nbsp;   -> values(105,"National Geographic","Adis Scott",1000,"Science");

ERROR 1062 (23000): Duplicate entry '105' for key 'books.PRIMARY'

mysql> insert into books

&nbsp;   -> values(1010,"National Geographic","Adis Scott",1000,"Science");

Query OK, 1 row affected (0.01 sec)



mysql> select\* from books;

+---------+-------------------------------+--------------------+------+------------+

| Book\_no | book\_name                     | Author             | Cost | Category   |

+---------+-------------------------------+--------------------+------+------------+

|     101 | Let us C                      | Denis Ritchie      |  450 | System     |

|     102 | Oracle\_Complete Ref           | Loni               |  550 | Databases  |

|     103 | Mastering SQL                 | Loni               |  250 | Databases  |

|     104 | PL SQL-Ref                    | Scott Urman        |  750 | Databases  |

|     105 | The Alchemist                 | Paulo Coelho       |  299 | Motivation |

|     106 | Wings of Fire                 | A.P.J. Abdul kalam |  350 | Biography  |

|     107 | Rich Dad Poor Dad             | Robert kiyosaki    |  400 | Finance    |

|     108 | The Monk Who Sold His Ferrari | Robin sharma       |  250 | Self-help  |

|     109 | india 2020                    | Abdul kalam        |  280 | Education  |

|    1010 | National Geographic           | Adis Scott         | 1000 | Science    |

+---------+-------------------------------+--------------------+------+------------+



Q21) Rename the table Lib\_Issue to Issue.

Ans:-  mysql> desc lib\_issue;

+--------------+------+------+-----+---------+-------+

| Field        | Type | Null | Key | Default | Extra |

+--------------+------+------+-----+---------+-------+

| Lib\_issue\_id | int  | YES  |     | NULL    |       |

| Book\_No      | int  | YES  |     | NULL    |       |

| Member\_id    | int  | YES  |     | NULL    |       |

| issu\_date    | date | YES  |     | NULL    |       |

| Return\_date  | date | YES  |     | NULL    |       |

+--------------+------+------+-----+---------+-------+

5 rows in set (0.00 sec)



mysql> alter table lib\_issue

&nbsp;   -> rename issue;

Query OK, 0 rows affected (0.07 sec)



mysql> desc issue;

+--------------+------+------+-----+---------+-------+

| Field        | Type | Null | Key | Default | Extra |

+--------------+------+------+-----+---------+-------+

| Lib\_issue\_id | int  | YES  |     | NULL    |       |

| Book\_No      | int  | YES  |     | NULL    |       |

| Member\_id    | int  | YES  |     | NULL    |       |

| issu\_date    | date | YES  |     | NULL    |       |

| Return\_date  | date | YES  |     | NULL    |       |

+--------------+------+------+-----+---------+-------+





Q22) Drop table Issue. 

Ans:-mysql> drop table issue;

Query OK, 0 rows affected (0.04 sec)



mysql> desc issue

&nbsp;   -> ;

ERROR 1146 (42S02): Table 'firstbit\_sql.issue' doesn't exist



Q23) As per the given structure Create table Issue again with following 

constraints. 

 Lib\_Issue\_Id-Primary key 

 Book\_No-  foreign key 

 Member\_id - foreign key 

 Issue\_date 

 

Return\_date 



Ans:-

