# Multiplatform Kotlin Project
This is intended to be a minimal example of how to test multiplatform project with a JavaScript and Java Virtual Machine module, that both depend on a common module.

## Requirements
- Given a target, compose a string saying hello to that target, for example, for target "world", compose the string "Hello, world!"
- There must be 3 separate modules, one for the Java Virtual Machine, one for Javascript, and one common module
- Composing the string must be done in a common module
- Composing the string must be tested from a regular module targeting the Java Virtual Machine platform
- Composing the string must be tested from a regular module targeting the JavaScript platform
- It must be possible to run both Java Virtual Machine and Javascript tests from a single command at the command line (for example, "gradle check")
- The code must be 100% Kotlin.
- (optional) Convert this to a kotlin-dsl project  

## License
Per the "UNLICENSE.txt file", feel free to modify and or incorporate any part of this document into your own documentation, I don't need credit, I need good documentation for this to exist.

## How to run the tests
gradle test

## Current state
I am putting together a presentation to promote Kotlin, and want to use Kotlin's common module as the main selling point unique to Kotlin.
Unfortunately, being new to both gradle and multiplatform projects, I am having a really difficult time putting a sample together.
I have already tried looking at [KotlinAcademyApp](https://github.com/MarcinMoskala/KotlinAcademyApp) for reference, but that one is way more complex than I need and is in fact so complex I have been unable to even get it to work with IntelliJ IDEA.
[kotlin-fullstack-sample](https://github.com/Kotlin/kotlin-fullstack-sample) is not workable either because it does not demonstrate testing.
Any help getting this up and running with the minimal possible configuration would be appreciated, I think it would benefit the kotlin community to have a starting point like this to demonstrate the usefulness of common modules.    

### Current Issue
Executing `gradle test` launches the JVM tests but not the JavaScript tests.


## How this project was created
- Create a Kotlin (Multiplatform - Experimental) project
- Set the root module name to "prototype"
- Leave remaining settings the same, keep clicking "Next" and finally "Finish".
