def call(String repoUrl, String branchName = 'main') {
    stage('Git Checkout') {
        steps {
            script {
                git branch: branchName, url: repoUrl
            }
        }
    }
}
