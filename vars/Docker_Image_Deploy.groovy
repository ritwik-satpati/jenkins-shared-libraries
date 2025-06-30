def call(String OldPort, String NewPort, String ProjectName, String ImageTag){
  echo "--- This is Deploying the Image Code using Docker : Start ---"
  sh "docker run -d -p ${OldPort}:${NewPort} ${ProjectName}:${ImageTag}"
  echo "--- This is Deploying the Image Code using Docker : Complete ---"
}
