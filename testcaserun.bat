set projectLocation=F:\Workspace_sel\Maven_Project
cd %projectLocation%
set classpath=%projectLocation%\src\main\java\tests;
java org.testng.TestNG %projectLocation%\testng.xml
