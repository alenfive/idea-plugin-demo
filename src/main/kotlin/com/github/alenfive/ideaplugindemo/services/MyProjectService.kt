package com.github.alenfive.ideaplugindemo.services

import com.github.alenfive.ideaplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
