def call(){
    sh 'mvn clean test allure:report'

}