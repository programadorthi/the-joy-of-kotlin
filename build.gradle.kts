plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

group = "dev.programadorthi"
version = "0.0.1"

subprojects {
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
