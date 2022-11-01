pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/EAPashkovJ/SBDeploy.git'
                sh './mvn clean compile'
                // bat '.\mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvn test'
                // bat '.\mvn test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}