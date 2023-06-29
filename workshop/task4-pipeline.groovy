pipeline {
    agent {label 'slave'}

    stages {
        stage('CheckOut') {
            steps {
                script {
                    echo 'CheckOut Steps'
                }
            }
        }
        stage('Compile') {
            steps {
                script {
                    echo 'Compile Steps'
                }
            }
        }
        stage('BuildImage') {
            steps {
                script {
                    echo 'BuildImage Steps'
                }
            }
        }
        stage('PushImage') {
            steps {
                script {
                    echo 'PushImage Steps'
                }
            }
        }
    }
}
