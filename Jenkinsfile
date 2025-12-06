pipeline{
    agent any

    tools {
        maven 'Maven3' // MUST match the name in Jenkins Global Tool Configuration
    }

    stages{
        stage(' Checkout'){
            steps{
                git branch: 'main',
                    url: 'https://github.com/JAAM-Projects/Jenkins-Task.git'
            }
        }
        stage('Vuild'){
            steps{
                sh 'mvn clean compile'
            }
        }
        stage('Run Tests'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Test Report'){
            steps{
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}