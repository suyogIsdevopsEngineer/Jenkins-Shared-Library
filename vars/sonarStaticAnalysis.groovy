def call(credentialsId) {
    withSonarQubeEnv(credentialsId: credentialsId){
        sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://100.26.183.216:9000'
    }
    
}