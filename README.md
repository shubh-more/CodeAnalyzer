# CodeAnalyzer
CodeAnalyzer is a Java-based maven application that takes a git URL from the user and performs a static analysis of the code for bugs and vulnerabilities.
The application uses Java 17, so, at minimum, Java 17 is required to run the application.
The CodeAnalyzer first takes a git repository URL from the user.
It uses a JGit library to clone the Git repository to the user-desired location on the local/virtual machine.
Next, it uses PMD to perform the static analysis of the code.
The result of the analysis is then stored as a CSV file in the same repository with the name “pmd-report”.
The report can then be opened with MS Excel or any open-source tool like Libre Office etc., for better visualisation. 





PMD
An open-source static source code analyser provides reports on errors discovered in application code. 
In addition to supporting the creation of unique rules, PMD comes with built-in rule sets. 
Due to its restriction to processing well-formed source files, PMD does not indicate compilation problems. 
The performance and maintainability of the programme can be impacted by issues identified by PMD, such as rather inefficient code or poor programming practices. 
It is capable of analysing documents created in Java, JavaScript, Apex and Visualforce, PLSQL, Apache Velocity, XML, and XSL.
JGit
The Git version control system, including repository access routines, network protocols, and fundamental version control algorithms, is implemented by JGit, a compact, pure Java library.
JGit, a Java implementation of Git with a fair amount of features, is very popular among Java programmers. The JGit project is housed under the Eclipse brand and is accessible at JGit.


Maven
Maven can control a project's build, reporting, and documentation from a single source of data using the idea of a project object model (POM). Any Java-based project may be created and managed with Maven.
What does it do?
1. It makes building a project simple.
2. It offers a consistent build procedure (all Maven projects can share a Maven project).
3. It offers project data (such as a log document, sources with cross references, a mailing list, a dependency list, reports from unit tests, etc.).
4. Moving to new Maven Apache features is simple. 

How to run the code?
1.	Run main class App.java.
2.	In console enter the valid git repository URL
3.	Enter a location to clone the Git repository.
4.	The excel will be generated in the location where the code is clone.


 
 
