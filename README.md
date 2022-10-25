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

`Student Entity`

![image](https://user-images.githubusercontent.com/67637654/197792376-9525ba9e-4937-482c-8548-88fa6ce9d5ff.png)

`@SequenceGenerator` --> Sequence Generator automatically assigns a value to the numeric identity fields/properties of an entity.

`sequenceName` --> sequenceName is the name of the sequence in the database. This is how we specify a sequence that already exists in the database.

`allocationSize`--> Increases the database sequence by 1. 

As far as I've understand, SequenceGenerator makes your primary key(in this case studentId) increment by one automatically. Whenever we add a student to the database,
we dont have to give that entity an id. Sequencegenerator will automatically generate this inceremented id for us .

`@Transient` --> Transient annotation is used to mark a field to be transient for the mapping framework, which means the field marked with @Transient is ignored by
mapping framework and `the field not mapped to any database column.`









 
