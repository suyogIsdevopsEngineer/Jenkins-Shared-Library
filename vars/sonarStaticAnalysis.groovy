def call(credentialsId) {
    withSonarQubeEnv(credentialsId: credentialsId){
        sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://3.91.195.245:9000'
    }
    
}