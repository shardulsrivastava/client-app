# Client App

This is a React based frontend and spring boot based backend.


## Build the application

To build application locally :

```
./auto/build
```

## Running the application

To run application locally :

```
./auto/run
```


## Running Frontend locally

To run front-end locally:

```
yarn
yarn start
```

This will start the application on `http://localhost:3000`

Note: This requires `yarn` to be installed.

## Running Backend locally

To run backend locally :

```
mvn clean package
java -jar app-1.0.SNAPSHOT.jar
```

This will start api on `http;//localhost:8080/clients`


Note: This requires `java 8` and `maven` to be installed.