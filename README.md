This is a beginner spring boot project with PostgreSql to learn the basics.There is just one entity called Student and I'm doing crud operations from an external database 
with postgreSql.

Notes:

`What is application.properties ? `

Application properties are configurable application parameters to change an application's behaivour. Only system administrators and application administrators can read
and write application properties.This project' s properties are like this : 

![image](https://user-images.githubusercontent.com/67637654/197783054-6a1d0ae7-be93-4e77-93b6-f2a6fd3c4aba.png)


`spring.datasource.url` --> Url address of the database

`spring.datasource.username`--> Username of postgresql database

`spring.datasource.password` --> Password of postgresql database

`spring.jpa.hibernate.ddl.auto = create-drop` --> Means that when the server is run, the database(table) instance is created. And whenever the server stops, the database
table is dropped.

`spring.jpa.show-sql = true` -->The simplest way to dump the queries to standard out 

`spring.jpa.properties.hibernate.dialect` --> Dialect is a class that acts as a bridge between Java JDBC types and SQL types, which contains the mapping between java 
language data type and database data type. Dialect allows Hibernate to generate SQL optimized for a particular relational database. Hibernate generates queries for the 
specific database based on the Dialect class. A hibernate dialect gives information to the framework of how to convert hibernate queries(HQL) into native SQL queries.

`spring.jpa.properties.hibernate.format_sql=` --> It is used to print the SQL in the log and console.

`server.error.include-message=always` --> Include exception message in JSON.




 
