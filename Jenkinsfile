pipeline {
    agent any 
    environment {
        CONFIG_DIR = "src/main/groovy/com/pipeline/stages"
        RESOURCE_DIR = "src/main/resources"
    }
    //params 
    parameters {
        string(name: 'appname', defaultValue: "", description: "name of the app")
        string(name: 'groupname', defaultValue: "", description: "name of the group")
//         boolean(name: 'skipSonarScan', defaultValue: true, description: "if true, this will skip sonar scanning.")
    }
    stages {
        stage('loadConfigFiles') {
            steps {
                loadConfigfiles()
                sayHello.sayHello('Deepesh Prasad')

            }
        }
    }
}



def loadConfigfiles() {
    def sayHello = load "${CONFIG_DIR}/sayHello.groovy"
}
