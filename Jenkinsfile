node{
    stage('SCM Checkout'){
        git 'https://github.com/ghazianibros/JUnitProject.git'
    }
    stage('Compile-Package'){
        sh 'mvn test'
    }
}