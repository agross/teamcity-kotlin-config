package KotlinConfig2

import KotlinConfig2.buildTypes.*
import KotlinConfig2.vcsRoots.*
import KotlinConfig2.vcsRoots.KotlinConfig2_Kotlin
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "7f9dd3a5-de16-42d5-b021-04f7a442a2db"
    id = "KotlinConfig2"
    parentId = "_Root"
    name = "Kotlin Config 2"
    archived = true

    vcsRoot(KotlinConfig2_Kotlin)

    buildType(KotlinConfig2_1Compile)
    buildType(KotlinConfig2_2Test)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = KotlinConfig2_Kotlin.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
