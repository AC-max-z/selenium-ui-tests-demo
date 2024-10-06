rootProject.name = "selenium-ui-tests-demo"
pluginManagement {
    val lombokPluginVersion: String by settings
    plugins {
        id("io.freefair.lombok") version lombokPluginVersion
    }
}
include("ui-tests")
