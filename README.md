# Multiplatform Kotlin Project

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
