package KotlinConfig2.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '808bea02-330f-46ac-86ac-35b983a1758f' (id = 'KotlinConfig2_1Compile')
accordingly and delete the patch script.
*/
changeBuildType("808bea02-330f-46ac-86ac-35b983a1758f") {
    check(paused == false) {
        "Unexpected paused: '$paused'"
    }
    paused = true
}