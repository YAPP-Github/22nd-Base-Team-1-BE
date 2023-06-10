import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("kotlin-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")

    kotlin("plugin.jpa")
    kotlin("plugin.spring")
}

tasks.withType(Jar::class) {
    enabled = true
}

tasks.withType(BootJar::class) {
    enabled = false
}