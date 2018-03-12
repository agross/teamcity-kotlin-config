package KotlinConfig2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object KotlinConfig2_3Additional : BuildType({
    uuid = "d412ff20-c172-45f8-b5ab-8929bb5ee9bb"
    id = "KotlinConfig2_3Additional"
    name = "3 | Additional"

    vcs {
        root(KotlinConfig2.vcsRoots.KotlinConfig2_Kotlin)

    }

    steps {
        exec {
            path = "build"
            arguments = "Additional"
        }
    }

    triggers {
        vcs {
        }
    }

    dependencies {
        dependency(KotlinConfig2.buildTypes.KotlinConfig2_1Compile) {
            snapshot {
            }

            artifacts {
                cleanDestination = true
                artifactRules = "artifact.txt => ./artifacts"
            }
        }
    }
})
