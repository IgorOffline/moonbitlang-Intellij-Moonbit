package com.github.moonbit

import com.intellij.lang.Language

object MoonLanguage : Language("moonbit") {
    private fun readResolve(): Any = MoonLanguage
    override fun getDisplayName(): String {
        return "Moonbit"
    }
}


