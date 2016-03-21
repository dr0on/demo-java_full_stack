# demo-java_full_stack

Bootstrap + Java 8 + Spring 4.2.4 + Hibernate Entity Manager 5.1.0 + MySQL

Programmatic Spring Configuration (No XML)

```
Very simple example showing a Bootstrap frontend.  
Submitting Login form makes an AJAX get to Spring Controller.  
It will then display the returned and alert specifying whether user authenticates.
Nothing Fancy.
```
ID, Email, Name, Password:

(0,'marsha@hotmail.com','marsha','password')

(1,'adam.gerard@gmail.com','adam','password')

(2,'bob.joe@gmail.com','jim','password')

```
Deploy to Tomcat

hit localhost:8080/javafullstack
```

```
To run set up MySQL and import the .sql script.
Change settings in persistence.xml
```

-----------------------------------------------------------------------

Key stuff for Spring and Hibernate!!!

```
Spring/Hibernate

Domain
@Entity - specifies domain entity
@Table - table matched with
@Id - specifies primary key
@Column - matches field with table column
@Join - joins in domain automatically

DAO
@Repository
@Autowired persistence context

Controller
@Controller
@RequestMapping - what url
@ReponseBody
@Autowired Service

Service
@Service
@Autowired Dao

Config
@EnableWrbMVC
@Configuration
@ComponentScan - where to look
@Bean
```

