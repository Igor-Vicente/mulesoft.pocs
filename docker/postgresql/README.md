# Creating Postgresql (SGBD) and connecting with Pgadmin (UI)

## Run the containers

```bash
    docker compose up -d
```

## Connecting with pgadmin :

- browser to: localhost:15432
- login:
  - email: admin@gmail.com
  - password: Teste@123
- Register a server:
  - General tab:
    - name: <db_name> (you can choose)
  - Connection tab:
    - host: some-postgres (make sure the containers are both in the same network (with the bridge driver))
    - port: 5432
    - maintenance database: postgres
    - username: postgres
    - password: Teste@123

## Using terminal to interact with the SGBD

- Access the bash of the container:

```bash
    docker exec -it some-postgres bash
```

now you can interact with the PostgreSQL database, using the command-line interface tool for PostgreSQL (psql) )
     
- connect with a user: 

```bash
    psql -U postgres
```
### Some Commands
- \l : list databases
- CREATE DATABASE <db_name>: create database
- DROP DATABASE <db_name: drop database
- \c <db_name> : connect to the database
- CREATE TABLE <table_name> (columnName* columnType* constrant): create table in the connected database
- \d : list tables of the connected database
- \d <table_name>  : table details
- CREATE TABLE person (id BIGSERIAL NOT NULL PRIMARY KEY, first_name VARCHAR(50) NOT NULL, last_name VARCHAR(50) NOT NULL, gender VARCHAR(7) NOT NULL, birth_date DATE NOT NULL, email VARCHAR(150));
- INSERT INTO person (first_name, last_name, gender, birth_date, email) VALUES ('Ellen', 'Gadot', 'female', '1986-05-23', 'ellen@gmail.com');




