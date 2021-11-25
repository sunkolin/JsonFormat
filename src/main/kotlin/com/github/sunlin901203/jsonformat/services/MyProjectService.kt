package com.github.sunlin901203.jsonformat.services

import com.intellij.openapi.project.Project
import com.github.sunlin901203.jsonformat.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
