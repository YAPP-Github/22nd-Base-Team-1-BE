@file:Suppress("ObjectPropertyName")

repositories {
    mavenCentral()
    gradlePluginPortal()
}

inline val PluginDependenciesSpec.`conventions`: PluginDependencySpec
    get() = id("conventions")

inline val PluginDependenciesSpec.`kotlin-conventions`: PluginDependencySpec
    get() = id("kotlin-conventions")

inline val PluginDependenciesSpec.`spring-conventions`: PluginDependencySpec
    get() = id("spring-conventions")
