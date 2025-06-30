def call(String DockerHubCred, String ProjectName, String ImageTag ){
  echo "--- Pushing the Image to DockerHub : Start ---"
  withCredentials([usernamePassword(credentialsId:${DockerHubCred}, usernameVariable:"dockerHubUser", passwordVariable:"dockerHubPass")]){
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    // sh "docker image tag ${ProjectName}:${ImageTag} ${env.dockerHubUser}/${ProjectName}:${ImageTag}"
    sh "docker push ${env.dockerHubUser}/${ProjectName}:${ImageTag}"
  }
  echo "--- Pushing the Image to DockerHub : Complete ---"
}
