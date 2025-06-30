def call(){
  echo "--- This is Deploying the Image Code using Docker Compose : Start ---"
  sh "docker compose up -d"
  echo "--- This is Deploying the Image Code using Docker Compose : Complete ---"
}
