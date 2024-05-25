plugins {
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.intelliJPlatform) apply false
    alias(libs.plugins.changelog) apply false
    alias(libs.plugins.qodana) apply false
    alias(libs.plugins.kover)
}

kotlin {
    jvmToolchain(17)
}

kover {
    reports {
        total {
            xml {
                onCheck = true
            }
        }
    }
}
