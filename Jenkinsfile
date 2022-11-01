pipeline {
    agent any
       tools {
            maven "MAVEN"
            jdk "JDK"
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
                git 'https://github.com/EAPashkovJ/SBDeploy.git'
           sh 'mvn -B -DskipTests clean package'
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
//         stage('SBDeploy'){
//         stages{
//
//         }
//         }
    }
}
}