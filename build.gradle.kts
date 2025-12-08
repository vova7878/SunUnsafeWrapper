import com.vanniktech.maven.publish.AndroidMultiVariantLibrary

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven.publish)
    alias(libs.plugins.raung)
}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(17)
}

android {
    namespace = "com.v7878.sun.unsafe"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        minSdk = 26
    }
}

dependencies {
    compileOnly(project(":stub"))

    implementation(libs.r8.annotations)
}

mavenPublishing {
    publishToMavenCentral(automaticRelease = false)
    signAllPublications()
    configure(
        AndroidMultiVariantLibrary(
            sourcesJar = true,
            publishJavadocJar = false,
        )
    )

    coordinates(
        groupId = "io.github.vova7878",
        artifactId = "SunUnsafeWrapper",
        version = project.version.toString()
    )

    pom {
        name.set("SunUnsafeWrapper")
        description.set("Wrapper over sun.misc.Unsafe for android")
        inceptionYear.set("2025")
        url.set("https://github.com/vova7878/SunUnsafeWrapper")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/license/mit")
                distribution.set("repository")
            }
        }

        developers {
            developer {
                id.set("vova7878")
                name.set("Vladimir Kozelkov")
                url.set("https://github.com/vova7878")
            }
        }

        scm {
            url.set("https://github.com/vova7878/SunUnsafeWrapper")
            connection.set("scm:git:git://github.com/vova7878/SunUnsafeWrapper.git")
            developerConnection.set("scm:git:ssh://git@github.com/vova7878/SunUnsafeWrapper.git")
        }
    }
}
