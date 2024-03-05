package me.gamercoder215.calcgames.levelz.idea

import com.intellij.lang.Language
import com.intellij.openapi.util.IconLoader
import java.io.Serial

object LevelZ : Language("LevelZ") {
    private fun readResolve(): Any = LevelZ

    @Serial
    private const val serialVersionUID: Long = 2L

    val ICON = IconLoader.getIcon("/levelz.png", LevelZ::class.java)


}