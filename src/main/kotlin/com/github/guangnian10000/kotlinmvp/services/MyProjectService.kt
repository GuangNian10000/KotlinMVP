package com.github.guangnian10000.kotlinmvp.services

import com.github.guangnian10000.kotlinmvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
