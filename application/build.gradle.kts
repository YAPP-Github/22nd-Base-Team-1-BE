plugins {
    `spring-conventions`
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.spring.boot.web)
}