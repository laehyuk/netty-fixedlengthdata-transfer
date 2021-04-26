# netty-fixedlengthdata-transfer

### docker-compose.yml
```
version: '3.3'
services:
  mongo:
    image: mongo
    restart: always
    ports:                
      - 27017:27017
    container_name: fld-mongo

volumes:
  db-data:
```

### docker-compose command
```
docker-compose up -d
```

### set up mongo user

- Run a bash command in a running Mongo container

```
> docker exec -it fld-mongo bash
``` 

- Connect & Create User in MongoDB
```
> mongo
> use admin
> db.createUser({ user: "leo", pwd: "1234",
            roles: [ "userAdminAnyDatabase",
                     "dbAdminAnyDatabase",
                     "readWriteAnyDatabase"
  ]})
```
