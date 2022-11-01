pipeline {
    agent any

         stages {

 tools {
    maven 'M3'
  }
  stages {
   stage('init') {
      checkout scm
   }
  stage('build'){
        withMaven(maven: 'mvn') {
            sh "mvn clean package"
        }
    }


        stage('Test') {
            steps {
                sh './mvn test'

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