package me.gamercoder215.calcgames.levelz.idea

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object LevelZType : LanguageFileType(LevelZ) {

    override fun getName(): String = Language.message("project.name")

    override fun getDescription(): String = Language.message("project.description")

    override fun getDefaultExtension(): String = "lvlz"

    override fun getIcon(): Icon = LevelZ.ICON

}