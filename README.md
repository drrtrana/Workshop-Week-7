###### CS-207-3: Programming II <br>
Spring 2021 <br>
Northeastern Illinois University <br>
Workshop Week 7 <br>
Object Oriented Programming Review & Tracing

**Getting Started**

**1.** Detailed instructions are located in the tutorial videos.<br>
**2.** Accept the assignment invitation on D2L.<br>
**3.** Clone the assignment to your computer.<br>
**4.** Go to File > Project Structure. Under Project Settings, click on Project and verify that the Project SDK is set
to JDK 11 or higher.  If it is not, select the correct SDK from the drop-down.<br>
**5.** Go to File > Settings (Mac: IntelliJ IDEA > Preferences). Under Build, Execution, Deployment and under Build
Tools, click Gradle. Make sure Build and run using: and Run tests using: are set to Gradle. Make sure Use Gradle from:
is set to 'gradle-wrapper.properties' file. And make sure Gradle JVM is set to JDK 11 or higher.<br>
**6.** Project SDK and Gradle JVM should be set to the same Java version.<br>
**7.** Create the `main/java` directory in the `src` directory. This is where you will be creating your Java classes for
your assignment. Right click `src` and go to New > Directory and select `main/java`.<br>

### Problem 1

**1.** In the main/java directory, create a class named `Address` that has the following:
- Six properly encapsulated instance variables: An integer named `houseNum`, a `String` named `street`,
  an integer named `aptNum`, a `String` named `city`, a `String` named `state`, and an integer named `zipcode`.
- A constructor that takes 5 parameters for `houseNum`, `street`, `city`, `state`, `zipcode` and sets the instance variables.
- A constructor that takes 6 parameters for `houseNum`, `street`, `aptNum`, `city`, `state`, `zipcode` and sets the instance variables.
- A method named `toString` that does not take any parameters and returns a `String`.
  The method should return a `String` that has the address with the street address on one  
  line and the city, state, and zip code on the next line.
    - Uncomment the test named `toString_shouldReturnFormattedAddressAsString` in the `AddressTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.
- A method named `comesBefore` that takes one parameter, an `Address` object, and  returns a `boolean`.
  The method should test whether the current `Address` object comes before the `Address` parameter when
  the addresses are compared by zip code. Remember to use the keyword `this` everywhere that you refer
  to an instance variable (with the exception of the declaration).
    - Uncomment the test named `comesBefore_shouldReturnTrueIfCallingAddressComesBeforeParameterAddress` in the `AddressTest` class
      (in the test/java directory). Run the code analyzers and commit your code now.

**2.** Create a demo class named `AddressDemo`.
Create three `Address` objects. Print out the result of  calling the `toString` method on each of the objects.
Then, compare the three `Address` objects  using the `comesBefore` method.
Practice debugging using the IntelliJ debugger.

### Tracing Practice #1

**1.** Debug the `MoodRing` class (in the test/java directory) to determine the exact output of the main method of the MoodTest class.

