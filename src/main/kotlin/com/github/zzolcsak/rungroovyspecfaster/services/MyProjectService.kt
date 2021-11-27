package com.github.zzolcsak.rungroovyspecfaster.services

import com.intellij.openapi.project.Project
import com.github.zzolcsak.rungroovyspecfaster.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
