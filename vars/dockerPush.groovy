def call(String project,String hubUser,String ImageTag){
    withCredentials([usernamePassword(
        credentialsId: 'docker', 
        passwordVariable: 'PASS', 
        usernameVariable: 'USER'
        )]) {
        sh "docker login -u '$USER' -p '$PASS'" 
}
    sh "docker image push ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project} ${hubUser}/${project}:latest"
}