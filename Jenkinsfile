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
                script {
                loadConfigfiles()              
            }

            }
        }
    
    stage("sayHello") {
        steps {
            script {
                sayHello.sayHello("Deepesh Prasad")
                getAppName.appName()
             }
        }

    }
   stage('docker demo') {
	steps {
		script {
		  ddocker.deployContainer()
		}
	}
}
}
}

def loadConfigfiles() {
    sayHello = load "${CONFIG_DIR}/sayHello.groovy"
    getAppName = load "${CONFIG_DIR}/appName.groovy"
    ddocker = load "${CONFIG_DIR}/dockerDemo.groovy"
}
