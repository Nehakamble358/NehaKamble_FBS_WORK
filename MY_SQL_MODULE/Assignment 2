 

####                                **Assignment -1**

Q1. Login to MySQL and view all databases already present. You should get

following result :

Answer :-mysql> show databases;

+--------------------+

| Database           |

+--------------------+

| assign\_3           |

| department         |

| employee           |

| firstbit\_sql       |

| information\_schema |

| job                |

| library\_system     |

| mysql              |

| performance\_schema |

| project1           |

| roombooking        |

| sept25             |

| strudent           |

| student            |

| sys                |

+--------------------+ss



Q2. Login to MySQL and view all databases already present. You should get

following result :

Write an SQL statement to create a simple table countries including columns

country\_id,country\_name and region\_id. After this display the structure of

table as below :

Ans:-mysql> create table country

    -> (country\_id int(11),country\_name varchar(20),region\_id int(11));

Query OK,



mysql> desc country;

+--------------+-------------+------+-----+---------+-------+

| Field        | Type        | Null | Key | Default | Extra |

+--------------+-------------+------+-----+---------+-------+

| country\_id   | int         | YES  |     | NULL    |       |

| country\_name | varchar(20) | YES  |     | NULL    |       |

| region\_id    | int         | YES  |     | NULL    |       |

+--------------+-------------+------+-----+---------+-------+

3 rows in set (0.02 sec)



Q3. Write an SQL statement to create a table named jobs including columns

job\_id, job\_title, min\_salary, max\_salary and check whether the

max\_salary amount exceeding the upper limit 25000. Also set job\_id as

primary key and entering null values for job\_title is not allowed.



Ans:-

mysql> create table job

    -> (job\_id int,job\_title varchar(20),min\_salary int, max\_salary int);

Query OK, 0 rows affected (0.03 sec)

mysql> desc job;

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | YES  |     | NULL    |       |

| job\_title  | varchar(20) | YES  |     | NULL    |       |

| min\_salary | int         | YES  |     | NULL    |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+



mysql> alter table job

    -> modify column min\_salary int default '25000';

Query OK, 0 rows affected (0.03 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> desc job;

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | YES  |     | NULL    |       |

| job\_title  | varchar(20) | YES  |     | NULL    |       |

| min\_salary | int         | YES  |     | 25000   |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+



 alter table job

    -> add primary key(job\_id);

Query OK, 0 rows affected (0.08 sec)

Records: 0  Duplicates: 0  Warnings: 0

mysql> desc job;

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | NO   | PRI | NULL    |       |

| job\_title  | varchar(20) | YES  |     | NULL    |       |

| min\_salary | int         | YES  |     | 25000   |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------+



 alter table job

    -> modify column job\_title varchar(20) not null;

Query OK, 0 rows affected (0.07 sec)

Records: 0  Duplicates: 0  Warnings: 0



mysql> desc job;

+------------+-------------+------+-----+---------+-------+

| Field      | Type        | Null | Key | Default | Extra |

+------------+-------------+------+-----+---------+-------+

| job\_id     | int         | NO   | PRI | NULL    |       |

| job\_title  | varchar(20) | NO   |     | NULL    |       |

| min\_salary | int         | YES  |     | 25000   |       |

| max\_salary | int         | YES  |     | NULL    |       |

+------------+-------------+------+-----+---------+-------|



 

Q4.Write a SQL statement to create a table named job\_histry including columns

employee\_id, start\_date, end\_date, job\_id and department\_id



Ans:-

