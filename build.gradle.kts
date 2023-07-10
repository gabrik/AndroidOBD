plugins {
    `kotlin-dsl`
    alias(libs.plugins.android).apply(false)
    alias(libs.plugins.kotlin.android).apply(false)
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.gradle.cachefix).apply(false)
}

tasks.wrapper {
    gradleVersion = "8.2.1"
    distributionType = Wrapper.DistributionType.BIN
}