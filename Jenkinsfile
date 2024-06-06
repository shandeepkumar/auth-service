pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"
        jdk "JAVA_HOME"
    }
    stages {
        stage('Welcome') {
            steps {
                echo 'Welcome to Java Build and deployment Sample implementation' 
            }
        }
        stage('Git Checkout') {
            steps {
                checkout changelog: false, poll: false, scm: scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '4d8314e0-b8db-4abd-ba64-6cefb5c534f7', url: 'https://github.com/shandeepkumar/auth-service.git']])
            }
        }
        stage('Code Build') {
            steps {
                sh 'mvn clean install -DskipTests=true'
            }
        }
        stage('Docker') {
            steps {
                sh 'docker build -t shandeepkumar/auth-service .'
            }
        }
        stage('Docker Login') {
            steps {
                withCredentials([string(credentialsId: 'DockerHubPwd', variable: 'DockerHub')]) {

                    sh 'docker login -u shandeepkumar -p ${DockerHub}'
                    sh 'docker push shandeepkumar/auth-service'
                    sh 'docker run -p 8742:8742 shandeepkumar/auth-service'
                }
            }
        }
    }
}