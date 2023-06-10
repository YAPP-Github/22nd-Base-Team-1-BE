import org.gradle.api.JavaVersion.VERSION_17

plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

tasks.test {
    println("asd")
    useJUnitPlatform()
}

dependencies {
    implementation(libs.kotlin.plugin)
    implementation(libs.kotlin.noarg)
    implementation(libs.kotlin.allopen)
    implementation(libs.kotlinter.plugin)

    implementation(libs.spring.boot.plugin)
    implementation(libs.spring.boot.dependencies)

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit5"))
}
