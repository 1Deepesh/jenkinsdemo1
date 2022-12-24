def deployContainer() {
    sh "docker ps -aq"   
}

return this;
