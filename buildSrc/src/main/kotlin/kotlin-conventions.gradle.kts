import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("conventions")

    kotlin("jvm")
    kotlin("plugin.noarg")
    kotlin("plugin.allopen")

    id("org.jmailen.kotlinter")
}

the(JavaPluginExtension::class).apply {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType(KotlinCompile::class.java) {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

tasks.withType(Test::class.java) {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit5"))
}