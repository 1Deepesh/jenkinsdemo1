def appName() {
        gitURL = "https://github.com/1Deepesh/jenkinsdemo1.git"
        appName = ((git.URL).split("/")[1]).toString()
        println (appName)
        
}

return this
