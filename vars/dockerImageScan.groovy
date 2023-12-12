def call(String project,String hubUser,String ImageTag){
    sh """trivy image ${hubUser}/${project}:latest > scan.txt
    cat scan.txt"""
}