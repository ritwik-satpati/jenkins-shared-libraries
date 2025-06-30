def call(String DockerHubUser, String ProjectName, String ImageTag){
  echo "--- Building the Code as a Docker Image : Start ---"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "--- Building the Code as a Docker Image : Complete ---"
}
