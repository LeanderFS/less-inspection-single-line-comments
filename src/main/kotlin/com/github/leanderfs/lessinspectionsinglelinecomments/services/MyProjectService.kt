package com.github.leanderfs.lessinspectionsinglelinecomments.services

import com.intellij.openapi.project.Project
import com.github.leanderfs.lessinspectionsinglelinecomments.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
