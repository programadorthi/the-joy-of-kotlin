import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    application
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

dependencies {
    testImplementation(libs.bundles.test)
}

application {
    mainClass.set("dev.programadorthi.MainKt")
}
