package com.github.4boom04.textprocessingintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.4boom04.textprocessingintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
