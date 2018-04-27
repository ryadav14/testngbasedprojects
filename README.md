Testngbasedproject

=== is basis learning project =============

Configuration
Maven

TestNG
SeleniumGrid 

1. Simple POM configuration so you can run via command line
2. TestNG configuration
3. Usage of Selenium Grid


1.Setup Grid and Hub
  run below from command line

1.1 java -jar selenium-server-standalone-3.11.0.jar -role hub 

1.2
java -jar selenium-server-standalone-3.11.0.jar -role node -hub http://localhost:4444/grid/register -port 5555 -browser "browserName=chrome,maxInstances=5,plat=MAC   -timeout  0-Dwebdriver.chrome.driver=/usr/local/Cellar/chromedriver.exe"


1.3 java -jar selenium-server-standalone-3.11.0.jar -role node -hub http://localhost:4444/grid/register -port 5556 -browser "browserName=chrome,maxInstances=5,plat=MAC   -timeout  0-Dwebdriver.chrome.driver=/usr/local/Cellar/chromedriver.exe"


2. Run project
mvn clean test

3. Results location
/target folder


Notes -
1. Change the platform as per your requirement
2. Change chrome.driver path where it is actually installed
3. Change selenium standalone server version
4. Change localhost IP address with actual machine IP where grid is running