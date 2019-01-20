pipeline {
    agent any
     tools {
        maven 'localMaven'
        jdk 'localJDK'
    }

    stages {
        stage('Clean WS') {
            steps {
                cleanWs()
            }
            }
        stage('Checkout code') {
            steps{
//        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/cucumber/cucumber-java-skeleton.git']]])
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/crozwise/cucumber-java-skeleton.git']]])

            }
        }
            
    
        stage ('Initialize') {
            steps {
                bat  '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }

        stage ('Build') {
            steps {
                bat  'mvn -Dmaven.test.failure.ignore=false -Djacoco.destFile=./coverage/jacoco.exec org.jacoco:jacoco-maven-plugin:prepare-agent org.jacoco:jacoco-maven-plugin:report test'
//                bat  'mvn -Dmaven.test.failure.ignore=false test'
            }
            post {
                success {
                    println "successss"
                    junit 'target/surefire-reports/**/*.xml' //bunu silince test results grafik gelmedi?
                    jacoco execPattern: 'coverage/jacoco.exec' //bunu silince coverage grafigi gelmedi
                }
            }
        }
         stage ('generate tests')
         {
   steps
   {
   step([$class: 'CucumberTestReportPublisher',
        reportsDirectory: './target',
        fileIncludePattern: '',
        fileExcludePattern: '',
        markAsUnstable: false,
        copyHTMLInWorkspace: true        
    ])
   }
         }
    
}}