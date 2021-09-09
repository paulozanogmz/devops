node
{
    timestamps
    {
        stage('WA_setup')
        { 
            sh 'rm -rf menu'
            sh 'git clone https://github.com/paulozanogmz/menu.git'
            sh 'cd menu'
            sh 'git checkout app'
            sh 'git log --oneline -10'
        }
    }
}