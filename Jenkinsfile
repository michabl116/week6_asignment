pipeline {
    agent any
    tools {
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                git Branch : 'master ' , url: 'https://github.com/michabl116/week6_asignment.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'runing test'
                bat 'mvn test jacoco:report'
                bat 'dir target/s'


            }
        }

    }
}