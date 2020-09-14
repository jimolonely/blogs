/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */

tasks.create<Copy>("copy") {
    description = "copy src to dest dir"
    group = "Custom"

    from("src")
    into("dest")
}

plugins {
    id("base")
}

tasks.create<Zip>("zip") {
    description = "archive source to a zip file"
    group = "Archive"

    from("src")
    archiveFileName.set("basic-demo.zip")
}
