plugins {
    kotlin("jvm") version "1.9.22"
    id("org.jetbrains.intellij") version "1.17.2"
    id("org.jetbrains.grammarkit") version "2022.3.2.2"

    java
    idea
}

repositories {
    mavenCentral()
    mavenLocal()
}

group = "me.gamercoder215.calcgames.levelz.idea"
version = "0.1.0"

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

intellij {
    version = "2023.1.5"
}

sourceSets["main"].allSource.srcDir("src/main/grammars")
sourceSets["main"].java.srcDir("src/main/gen")

tasks {

    generateParser {
        sourceFile = file("src/main/grammars/LevelZ.bnf")
        pathToParser = "src/main/gen/me/gamercoder215/calcgames/levelz/idea/parser/LevelZParser.kt"
        pathToPsiRoot = "src/main/gen/me/gamercoder215/calcgames/levelz/idea/parser/psi/LevelZPsi.kt"
        targetRootOutputDir = file("src/main/gen")
    }
}