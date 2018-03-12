package KotlinConfig2.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object KotlinConfig2_Kotlin : GitVcsRoot({
    uuid = "2f0d357b-57e5-41ef-a84f-7b45590650ef"
    id = "KotlinConfig2_Kotlin"
    name = "Kotlin"
    url = "git@github.com:agross/teamcity-kotlin-config.git"
    branchSpec = "+:refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "id_rsa"
        passphrase = "credentialsJSON:5cb58044-5600-4b9a-8253-ab01af52fe50"
    }
})
