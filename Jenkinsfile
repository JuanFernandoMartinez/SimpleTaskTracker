pipeline {
    agent any

    tools {
        maven 'maven 3.9' // Must match Global Tool Configuration
        jdk 'Java-17'     // Must match Global Tool Configuration
        dockerTool 'main-docker'
    }

    environment {
        // Define your Docker image name and tag
        IMAGE_NAME = 'my-springboot-app'
        IMAGE_TAG  = "${BUILD_NUMBER}" // Uses Jenkins build number as tag
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/JuanFernandoMartinez/SimpleTaskTracker'
            }
        }

        stage('Build & Test') {
            steps {
                // Compiles, runs tests, and creates the JAR file
                sh 'mvn clean package'
            }
        }

       /* stage('Docker Build') {
            steps {
                // Builds the Docker image using the Dockerfile in the root workspace
                sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
                sh "docker build -t ${IMAGE_NAME}:latest ."
                echo "Docker image ${IMAGE_NAME}:${IMAGE_TAG} created successfully."
            }
        }*/
    }

    post {
    success {

    archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
}
}
}