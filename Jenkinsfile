 pipeline {
        agent any
        tools {
            maven "maven"
            // jdk "jdk-8"
        }
        stages {
            stage('Initialize') {
                steps {
                    echo "PATH = ${M2_HOME}/bin:${PATH}"
                    echo "M2_HOME = /opt/maven"
                }
            }
            stage('Build') {
                steps {
                    dir("/var/lib/jenkins/workspace/SBDeploy") {
                        sh 'mvn -B -DskipTests clean package'
                    }
                }
            }
            stage('Test') {
                steps {
                    sh 'mvn test'
                }
            }
        }


        post {

            always {
                junit(allowEmptyResults:true,
                        testResults:'*/test-reports/.xml'      )
            }
        }
    }