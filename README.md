# Multiplatform Kotlin Project
This is intended to be a minimal example of how to test multiplatform project with a JavaScript and Java Virtual Machine module, that both depend on a common module.

## Current state
I am putting together a presentation to promote Kotlin, and want to use Kotlin's common module as the main selling point unique to Kotlin.
Unfortunately, being new to both gradle and multiplatform projects, I am having a really difficult time putting a sample together.
I have already tried looking at [KotlinAcademyApp](https://github.com/MarcinMoskala/KotlinAcademyApp) for reference, but that one is way more complex than I need and is in fact so complex I have been unable to even get it to work with IntelliJ IDEA.
[kotlin-fullstack-sample](https://github.com/Kotlin/kotlin-fullstack-sample) was not workable either because it does not demonstrate testing.
Any help getting this up and running with the minimal possible configuration would be appreciated, I think it would benefit the kotlin community to have a starting point like this.    

## How this project was created

Create new project in IntelliJ IDEA

    Create New Project
    Deselect Java
    Next
    GroupId com.seanshubin.learn.kotlin.prototype
    ArtifactId kotlin-prototype
    Next
    Next
    Finish

Create common module

    File | New | Module
    Deselect Java
    Select Kotlin (Multiplatform Common - Experimental)
    Next
    GroupId com.seanshubin.learn.kotlin.prototype
    ArtifactId kotlin-prototype-common
    Next
    Next
    Module name: common
    Finish

Create javascript module

    File | New | Module
    Deselect Java
    Select Kotlin (Multiplatform JS - Experimental)
    Next
    GroupId com.seanshubin.learn.kotlin.prototype
    ArtifactId kotlin-prototype-js
    Next
    Next
    Module name: js
    Finish

Create java module

    File | New | Module
    Deselect Java
    Select Kotlin (Multiplatform JVM - Experimental)
    Next
    GroupId com.seanshubin.learn.kotlin.prototype
    ArtifactId kotlin-prototype-jvm
    Next
    Next
    Module name: jvm
    Finish

Make root module aware of sub projects

    Add the following lines to the root "settings.gradle" file
        include 'common'
        include 'js'
        include 'jvm'
