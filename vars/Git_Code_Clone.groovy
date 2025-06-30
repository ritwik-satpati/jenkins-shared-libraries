def call(String GitUrl, String GitBranch){
  echo "--- Cloning the Code from GitHub : Start ---"
  git url: GitUrl, branch: GitBranch
  echo "--- Cloning the Code from GitHub : Complete ---"
}
