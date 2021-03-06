pipeline {
	environment {
    registry = "saisriharsha333/my-calculator"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

		stage('DockerHub') {
      stages{
        stage('Build Image') {
          steps{
            script {
              dockerImage = docker.build registry + ":$BUILD_NUMBER"
            }
          }
        }
        stage('Push Image') {
          steps{
            script {
              docker.withRegistry( '', registryCredential ) {
                dockerImage.push()
								pushLatestBuild = "docker push " + registry
								sh pushLatestBuild
              }
            }
          }
        }
      }
    }
		stage('Deploy') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          jobId: "f20cbb80-98cd-493d-9415-d71f226c6a6b"])
        }
      }
    }
  }
}
