# Creating Postgresql (SGBD) and connecting with Pgadmin (UI)

## Run the containers

```bash
    docker compose up -d
```

## Connecting with Pgadmin :

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
