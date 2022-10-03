def appName() {

        gitURL = "https://github.com/1Deepesh/jenkinsdemo1.git"
        appName = (((gitURL).split("/")[4]).split(".git")[0]).toString()
        println ("We have found the appname for you: " + appName)
        return appName
        
}

return this
