plugins {
    kotlin("jvm")
    application
}

dependencies {
    testImplementation(libs.bundles.test)
}

application {
    mainClass.set("dev.programadorthi.MainKt")
}
