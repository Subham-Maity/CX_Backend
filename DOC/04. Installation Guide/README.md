# ⚡ Installation Guide – CodeXam
Java Installation[](#java-installation)
---------------------------------------

Installation Guide

Here is a step-by-step guide for installing Java on a Windows machine:

1.  Download the Java SE Development Kit (JDK) from the Oracle website: [https://www.oracle.com/java/technologies/javase-downloads.html (opens in a new tab)](https://www.oracle.com/java/technologies/javase-downloads.html)
    
2.  Click on the "Download" button for the latest JDK release.
    
3.  Accept the Oracle Binary Code License Agreement for Java SE, then select the appropriate installer for your system. Make sure to select the correct version (e.g., Windows x64 if you are running a 64-bit version of Windows).
    
4.  Once the download is complete, double-click on the installer file to begin the installation process.
    
5.  Follow the prompts to complete the installation. You will be asked to specify a destination folder for the JDK files. It is recommended to use the default location, unless you have a specific reason to install it elsewhere.
    
6.  Once the installation is complete, you will need to set the JAVA\_HOME environment variable to the location of the JDK installation. To do this, follow these steps:
    

*   Right-click on "This PC" and select "Properties"
*   Click on the "Advanced system settings" link on the left side
*   Click on the "Environment Variables" button
*   Under "System Variables", scroll down and find the "JAVA\_HOME" variable
*   Click "Edit" and enter the path to the JDK installation (e.g., C:\\Program Files\\Java\\jdk1.8.0\_241)
*   Click "OK" to close the Environment Variables window, then "OK" again to close the System Properties window

If Java is correctly installed, you should see output similar to this:

```
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
```


IDE Installation Guide[](#ide-installation-guide)
-------------------------------------------------

Installation Guide

There are several Integrated Development Environments (IDEs) that are well-suited for developing applications with the Spring Boot framework. Some popular options include:

1.  Eclipse: Eclipse is a popular open-source IDE that is widely used for Java development. It has excellent support for Spring Boot, including features such as code completion, debugging, and integration with the Spring Initializer tool for creating new Spring Boot projects.
    
2.  IntelliJ IDEA: IntelliJ IDEA is a commercial IDE developed by JetBrains. It is widely regarded as one of the best IDEs for Java development and has excellent support for Spring Boot, including features such as code completion, debugging, and integration with the Spring Initializer.
    
3.  NetBeans: NetBeans is an open-source IDE that is particularly well-suited for developing Java EE applications, including those built with Spring Boot. It has a number of features that are useful for Spring Boot development, such as code completion, debugging, and integration with the Spring Initializer.
    
4.  Visual Studio Code: Visual Studio Code is a popular open-source IDE that is widely used for developing applications with a wide variety of programming languages, including Java. It has a number of features that are useful for Spring Boot development, such as code completion, debugging, and integration with the Spring Initializer.
    
5.  Spring Tool Suite: Spring Tool Suite is a popular open-source IDE that is specifically designed for developing applications with the Spring framework. It has excellent support for Spring Boot, including features such as code completion, debugging, and integration with the Spring Initializer tool for creating new Spring Boot projects.
    
6.  Atom: Atom is a popular open-source IDE that is widely used for developing applications with a wide variety of programming languages, including Java. It has a number of features that are useful for Spring Boot development, such as code completion, debugging, and integration with the Spring Initializer.
    

### IntelliJ IDEA Installation Guide :[](#intellij-idea-installation-guide-)

Installation Guide

1.  Download the latest version of IntelliJ IDEA from the official website ([https://www.jetbrains.com/idea/download/ (opens in a new tab)](https://www.jetbrains.com/idea/download/)). You can choose between the Community edition (free) and the Ultimate edition (paid).
    
2.  Run the downloaded installer file and follow the prompts to install IntelliJ IDEA.
    
3.  Once the installation is complete, launch IntelliJ IDEA.
    
4.  If you have purchased the Ultimate edition, you will need to register your license. To do this, go to "Help" > "Register" in the top menu and follow the prompts to enter your license information.
    
5.  To open a project in IntelliJ IDEA, go to "File" > "Open" in the top menu and select the root directory of your project. Alternatively, you can use the "Import Project" option to import a project from a different location or from a version control system.
    
6.  If you are creating a new Java project, you can do so by going to "File" > "New" > "Project" in the top menu and selecting "Java" in the project type list. Follow the prompts to set up your project.
    

Set up MySQL[](#set-up-mysql)
-----------------------------

Set up MySQL on a Windows machine, you can follow these steps:

1.  Download the MySQL installer from the MySQL website ([https://dev.mysql.com/downloads/installer/ (opens in a new tab)](https://dev.mysql.com/downloads/installer/)).
    
2.  Run the installer and follow the prompts to install MySQL. During the installation, you will be asked to choose a setup type. Select the "Server Only" option to install just the MySQL server.
    
3.  After the installation is complete, you will be asked to set the root password for the MySQL server. Choose a strong, secure password and make sure to remember it.
    
4.  Once the password is set, the MySQL server will be automatically started. You can check the status of the server by opening the MySQL Workbench, which is a graphical tool for managing MySQL servers and databases.
    
5.  To create a new database, open the MySQL Workbench and click on the "Create a New Schema in the Connected Server" button. Enter a name for the database and click "Apply" to create it.
    
6.  To connect to the database from a Java application, you will need to include the MySQL connector library in your project. You can download the connector from the MySQL website ([https://dev.mysql.com/downloads/connector/j/ (opens in a new tab)](https://dev.mysql.com/downloads/connector/j/)) and add it to your project's classpath.
    

### Step By Step Guide[](#step-by-step-guide)

Step 1:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/1.png?raw=true)

Step 2:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/2.png?raw=true)

Step 3:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/3.png?raw=true)

Step 4:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/4.png?raw=true)

Step 5:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/5.png?raw=true)

Step 6:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/6.png?raw=true)

Step 7:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/7.png?raw=true)

Step 8:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/8.png?raw=true)

Step 9:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/9.png?raw=true)

Step 10:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/10.png?raw=true)

Step 11:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/11.png?raw=true)

Step 12:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/12.png?raw=true)

Step 13:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/13.png?raw=true)

Step 14:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/14.png?raw=true)

Step 15:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/15.png?raw=true)

Step 16:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/16.png?raw=true)

Step 17:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/17.png?raw=true)

Step 18:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/18.png?raw=true)

Step 19:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/19.png?raw=true)

Step 20:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/20.png?raw=true)

Step 21:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/21.png?raw=true)

Step 22:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/22.png?raw=true)

Step 23:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/23.png?raw=true)

Step 24:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/24.png?raw=true)

Step 25:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/25.png?raw=true)

Step 26:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/26.png?raw=true)

Step 27:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/27.png?raw=true)

Step 28:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/28.png?raw=true)

Step 29:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/29.png?raw=true)

Step 30:

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/04.%20Installation%20Guide/30.png?raw=true)

Last updated on

December 29, 2022