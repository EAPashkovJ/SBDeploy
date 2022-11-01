pipeline {
    agent any

         stages {
                stage('Initialize'){
                    steps{
                        echo "PATH = ${M2_HOME}/bin:${PATH}"
                        echo "M2_HOME = /opt/maven"
                    }
                }

       stage('Build Code'){
           steps{
            echo "Bulding Code"
            echo "M2_HOME = ${M2_HOME}"
           dir("OAuth2.0"){
            bat 'mvn clean package'
           }
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
//         stage('SBDeploy'){
//         stages{
//
//         }
//         }
    }
}