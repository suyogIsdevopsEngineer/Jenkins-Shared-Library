def call(credentialsId) {
    withSonarQubeEnv(credentialsId: credentialsId){
        sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://44.201.227.71:9000'
    }
    
}