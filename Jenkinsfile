pipeline {
    agent any 
    stages {
        stage('clone the project and clean') { 
            steps {
              
            
                bat "mvn clean"
            }
        }
        stage('Test') { 
            steps {
                // 
                bat "mvn test"
            }
        }
        stage('Deploy') { 
            steps {
                // 
                bat "mvn package"
            }
        }
        stage('Run') { 
            steps {
                // 
                bat "mvn run"
            }
        }
    }
}
