package helloplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "this is lzy  first gradle plugins"
    }
}