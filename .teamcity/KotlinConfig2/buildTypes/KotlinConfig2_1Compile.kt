package KotlinConfig2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildFeatures.swabra
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.exec

object KotlinConfig2_1Compile : BuildType({
    uuid = "808bea02-330f-46ac-86ac-35b983a1758f"
    id = "KotlinConfig2_1Compile"
    name = "1 | Compile"

    artifactRules = "artifact.txt"

    params {
        param("env.ARTIFACT", "42")
    }

    vcs {
        root(KotlinConfig2.vcsRoots.KotlinConfig2_Kotlin)
    }

    steps {
        exec {
            path = "build"
            arguments = "Something"
        }
    }

    features {
        swabra {
            forceCleanCheckout = true
            verbose = true
        }
    }
})
