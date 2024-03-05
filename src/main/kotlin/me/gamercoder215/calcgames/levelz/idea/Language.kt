package me.gamercoder215.calcgames.levelz.idea

import com.intellij.DynamicBundle
import org.jetbrains.annotations.PropertyKey

object Language : DynamicBundle("lang.levelz") {

    @JvmStatic
    fun message(@PropertyKey(resourceBundle = "lang.levelz") key: String, vararg params: Any) = getMessage(key, *params)

    @JvmStatic
    fun messagePointer(@PropertyKey(resourceBundle = "lang.levelz") key: String, vararg params: Any) = getLazyMessage(key, *params)

}