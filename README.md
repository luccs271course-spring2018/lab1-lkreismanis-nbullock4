[![Build Status](https://travis-ci.org/LoyolaChicagoCode/hello-java.svg?branch=master)](https://travis-ci.org/LoyolaChicagoCode/hello-java)


# CS271: Lab 1
## Markdown document 
##### Larisa Kreismanis, Nathan Bullock

#### Part 2
Discussion: What would be a really simple solution if n were not an argument, i.e., if it were always 17?
* No need for the if-else statement else if(i % 15 == 0)

#### Part 3
Discussion: How could you have automatically tested your initial solution from part 2?
* Put the if else loops in the main method so that the loops initally print to test the correct result.

#### Part 4
Discussion: What changes between parts 2, 3, and 4, and what stays the same? Does it matter what list implementation you choose? If so, in what way(s)?
* There are small changes between parts 2,3,4.  Part 2 enables systematic if else statements, while part 3 enables arrays.
* It does not matter what implementation you choose. What implementation you use depends on which method is most efficient in your program.

______

* Simple hello world example
* Experience with Git source code management
* Building with Gradle (using the Gradle wrapper)
* Automated unit testing with JUnit
* Continuous integration with Travis

# System requirements

* Java 6 SDK or later

# Running the Application

On Linux or Mac OS X:

    $ ./gradlew run
	
On Windows:
	
    > gradlew run

# Running the Tests

On Linux or Mac OS X:

    $ ./gradlew test
	
On Windows:
	
    > gradlew test

# Running the Application Outside Gradle

Unlike running the application using Gradle's `run` task,
this allows passing command-line arguments.

On Linux or Mac OS X:

    $ ./build/scripts/hello-java arg1 arg2 arg3

or

    $ java -jar build/lib/hello-java.jar arg1 arg2 arg3

On Windows:

    > .\build\scripts\hello-java arg1 arg2 arg3

or

    > java -jar build\lib\hello-java.jar arg1 arg2 arg3
# lab1-lkreismanis-nbullock4
