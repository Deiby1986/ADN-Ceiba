pipeline { 
  agent {
    label 'Slave_Induccion'
  }

  options {
    	buildDiscarder(logRotator(numToKeepStr: '3'))
 	disableConcurrentBuilds()
  }

 
  tools {
    jdk 'JDK8_Centos' 
    gradle 'Gradle5.6_Centos' 
  }


  stages{
    stage('Checkout') {
      steps{
        echo "------------>Checkout<------------"
        checkout([
            $class: 'GitSCM', 
            branches: [[name: '*/master']], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            gitTool: 'Git_Centos', 
            submoduleCfg: [], 
            userRemoteConfigs: [[
            credentialsId: 'GitHub_Deiby1986', 
            url:'https://github.com/Deiby1986/ADN-Ceiba'
            ]]
        ])

      }
    }
    
    stage('Compile & Unit Tests') {
      steps{
        echo "------------>Cleaning previous compilations<------------"
         sh 'gradle --b ./backend/build.gradle clean'

           echo "------------>Unit Tests<------------"
           sh 'gradle --b ./backend/build.gradle test'
      }
    }

    stage('Static Code Analysis') {
      steps{
        echo '------------>Analisis de codigo estatico<------------'
        withSonarQubeEnv('Sonar') {
            sh "${tool name: 'SonarScanner', type:'hudson.plugins.sonar.SonarRunnerInstallation'}/bin/sonar-scanner -Dproject.settings=sonar-project.properties"
        }
      }
    }

    stage('Build') {
      steps {
        echo "------------>Build<------------"
        sh 'gradle --b ./backend/build.gradle build -x test'
      }
    }  
  }
post {
    always {
      echo 'This will always run'
    }
    success {
      echo 'This will run only if successful'
    }
    failure {
      echo 'This will run only if failed'
     // mail (to: 'deiby.manzo@ceiba.com.co',subject: "Pipeline falló :${currentBuild.fullDisplayName}",body: "Algo falló ${env.BUILD_URL}")
    }
    unstable {
      echo 'This will run only if the run was marked as unstable'
    }
    changed {
      echo 'This will run only if the state of the Pipeline has changed'
      echo 'For example, if the Pipeline was previously failing but is now successful'
    }
  }
}
  