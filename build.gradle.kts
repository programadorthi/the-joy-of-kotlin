import com.adarshr.gradle.testlogger.TestLoggerExtension
import com.adarshr.gradle.testlogger.theme.ThemeType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.test.logger) apply false
}

group = "dev.programadorthi"
version = "0.0.1"

subprojects {
    apply {
        plugin("com.adarshr.test-logger")
    }

    configure<TestLoggerExtension> {
        theme = ThemeType.MOCHA
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

tasks.register<Delete>("clean") {
    delete("$rootDir/build")
}
