@file:Suppress("UNUSED_VARIABLE")

dependencyResolutionManagement {
    versionCatalogs {
        val libs by creating {
            from(files("../libs.versions.toml"))
        }
    }
}