@file:Suppress("UNUSED_VARIABLE")

include(
    "application",
    "domain",
    "infra"
)

dependencyResolutionManagement {
    versionCatalogs {
        val libs by creating {
            from(files("libs.versions.toml"))
        }
    }
}
