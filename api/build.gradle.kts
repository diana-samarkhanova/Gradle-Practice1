plugins {
    id("java")
}

group = "com.dianasmkh"

repositories {
    mavenCentral()
}

dependencies {
    implementation project(":db")
    implementation project(":service")
}
