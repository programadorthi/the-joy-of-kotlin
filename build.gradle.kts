import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}

group = "dev.programadorthi"
version = "0.0.1"

subprojects {
    tasks.withType<KotlinCompile>() {
        kotlinOptions.jvmTarget = "11"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
