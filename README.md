# selenium_eobuwie_netguru
Tests for interview in Netguru

**1.Requirements to run tests:**
- Google Chrome v.88.0.4324.96
- Apache Maven v3.6.3

**2.Parameters is placed in file testng.xml in the main directory.**

You should edit testng.xml file to provide data for tests
- change value for each parameter, here is an example:

<!-- HERE ADD PARAMETERS TO TESTS -->
<parameter name="name" value="Adam"/>
<parameter name="lastname" value="Kowalski"/>
<parameter name="email" value="testowyy@wp.pl"/>
<parameter name="password" value="admin123"/>
<!-- END -->

**3.Choose test to run (testng.xml file).**

There are two tests to run:

a) registerAccountTest

To run this test testng.xml file (classes section) should looks like:
<classes>
    <!-- Registration account test -->
    <class name="tests.RegisterAccountTest"/>
    <!-- Login user test - uncomment below line to run test -->
    <!-- <class name="tests.LoginUserTest"/> -->
</classes>

b) loginUserTest

To run this test testng.xml file (classes section) should looks like:
<classes>
    <!-- Registration account test -->
    <!-- <class name="tests.RegisterAccountTest"/> -->
    <!-- Login user test - uncomment below line to run test -->
    <class name="tests.LoginUserTest"/>
</classes>

**4.Run in command line**

Linux:
- go to the main directory of the project "/selenium_eobuwie"
- run command: mvn test -DsuiteXmlFile=testng.xml

Windows:
- go to the bin directory of Apache Maven (if Apache Maven is not added to the PATH)
- run command: mvn test -DsuiteXmlFile=testng.xml
