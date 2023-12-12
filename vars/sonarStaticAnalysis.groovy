def call(credentialsId) {
    withSonarQubeEnv(credentialsId: credentialsId){
        sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://3.88.162.20:9000'
    }
    
}