def call(credentialsId) {
    withSonarQubeEnv(credentialsId: credentialsId){
        sh 'mvn clean package sonar:sonar -Dsonar.host.url=http://44.210.136.133:9000'
    }
    
}