
We are focusing on Spring Core Dependency Injection + Maven + Spring IOC

Dependency Injection: 
Dependency Injection is a design pattern irrespective of the coding language. (Its a concept)


What is dependency? 
In software development we build code/objects in OOPs. If we build a laptop. It has multiple parts - hard drive, ram etc.
These can be of other companies. All these other companies help build a laptop. 
In java we create class and then an object: 

Class Laptop{

	HitachiHD obj = new HitachiHD();

}

If we build using hitachi Hard drive and we want to change it in the future (achieve loose coupling : one obj is not totally 
dependent on another obj)

So we use the concept of Abstraction - for Hitachi class lets make a Harddrive interface. When we instantiate this:

HardDrive obj = new HitachiHD();

So in the future we can change above Hitachi to Samsung Hard drive.

The issue with above approach is we are hardcoding the values by using new keyword. ==> tight coupling.
We need someone else to provide this dependency - laptop object is dependent on the harddrive object.

We want to inject the hard drive object inside the Laptop class.We can do this by using an external service which would inject 
this dependency. -- > Dependency Inject Containers. They are responsible to create the object for you and inject the object in the class.

Where to mention? We need to do configuration. In java we can use spring framework n configure using XML. In XML we mention if someone wants
Hard drive give this obj. Since we can edit the xml in the future there is no tight coupling.
To avoid XML (as a developer we dont want to focus more on xml), we have spring boot. All we need to do is write @Component on top of the HitachiHD class:

@Component
class HitachiHD implements HardDrive{
}

The above makes it a component of Spring framework which will be generated as per requirement.

How will Laptop class mention that it wants Harddrive? 

We use the @Autowired annotation.

class Laptop {
	@Autowired
	HardDrive obj1;
}
 
HitachiHD is returned as thats the component available.

How to perform testing of the software. If we have taken a compnenet from another company ex: apple has taken the hard drive from Samsung, we dont need to 
test the hard drive again as samsung must have tested it. When we test a laptop we dont want to test the harddrive. - we need to have the software loosely coupled (Test it by mocking)

So the concept of Dependency inject is important to achive loose coupling and indirectly be able to test and maintain the application better.


------------------
MAVEN:

select maven-archetype-quickstart or maven-archtype-webapp (for web app)
Enter GroupID: package name - com.srishti
Artifact ID - SpringAnnot (project name)

Maven is a build tool under the license of apache.
Why we need maven? - when we create a application we need to work with third party libraries. If we want to connect to MySQL we need my-sql-connector library(jar).
For spring MVC we need 10-12 jar files. Similarly for hibernate. We need to download everything ourselves. Even if we download it ourselves and in future if we want to update versions 
ex: from Spring 4 to Spring 5. We again have to go and download those dependencies. Also we need to make sure that the Spring dependency we have downloaded matches with the hibernate dependency. 

Maven creates a .m2 repository locally when it downloads the first time from internet.

Dependencies to add: spring context, spring core, spring beans - main ones
Also  - spring-expression, aopalliance, spring-ao

To solve this we have a Maven repository. 
Steps:
1. Create a Maven Project. Project will have a pom.xml file- In that if we need to mention hibernate.
2. GroupId- to make it unique - com.srishti
3. ArtifactId - name of the project - demo
So to make it unique we combine the groupID and the artifactId - we can use the Package - jar(core) or war(web) name as - com.srishti.demo.
Can have multiple projects under the same groupId.

To get the dependency go to maven dependency webside to download - mvn repository.

We need to be connected to the internet to download the jar files from maven. For the first time it will get downloaded from the remote maven repository.
It also has a local repository. Now if we are for local repository and its not present it will download from the remote repository.


--------------------

Spring: 
Which ever bean is available - car or bike, will be returned.
We can get getBean from 2 interfaces BeanFactory or ApplicationContext - both belong to spring framework
Bean factory is good for small applications
Appl context for large enterprise level appln. Its a superset of bean factory.
ClassPathXmlApplicationContext - is the class that implement ApplicationContext methods

Advantage of xml is we don't need to change the source code -> no need to recomplie.

This is the basis idea of how to use spring core and how to achive dependency injection.



