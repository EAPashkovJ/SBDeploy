pipeline {
    agent any
tools {
    maven 'maven-3.6.3'

  }
      stages {
       stage('Initialize'){
                   steps{
         echo "PATH = ${M2_HOME}/bin:${PATH}"
           echo "M2_HOME = /opt/maven"
           }
                   }
                 stage('Build') {
                             steps {
                        dir("/var/lib/jenkins/workspace/demopipelinetask/SBDeploy") {
                                   sh 'mvn -B -DskipTests clean package'              }            }        }     }
                                   post {


      always {
       junit(        allowEmptyResults: true,
          testResults: '*/test-reports/.xml'      )
       }   } }