plugins {
    alias(libs.plugins.android.library)
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
}

android {
    namespace = "com.v7878.sun.unsafe"
    compileSdk = 36

    defaultConfig {
        minSdk = 26
    }
}

dependencies {
}
