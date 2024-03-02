def call(){
    sh 'mvn test'
    sh 'mvn jacoco:report'
    sh 'mvn surefire-report:report'
}