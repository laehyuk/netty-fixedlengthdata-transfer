# netty-fixedlengthdata-transfer


### docker-compose.yml
```
version: '3.3'
services:

  mongo:
    image: mongo
    restart: always
    environment:
      MONGO_INITDB_ROOT_USERNAME: leo 
      MONGO_INITDB_ROOT_PASSWORD: 1234
    ports:                
      - "27017:27017"     

  mongo-express:
    image: mongo-express
    restart: always
    ports:
      - 8081:8081
    environment:
      ME_CONFIG_MONGODB_ADMINUSERNAME: leo
      ME_CONFIG_MONGODB_ADMINPASSWORD: 1234 

volumes:
  db-data:
```

### docker-compose command
```
docker-compose up -d
```
