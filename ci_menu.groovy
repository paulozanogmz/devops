node
{
    timestamps
    {
        stage('WA_setup')
        { 
            sh 'rm -rf menu'
            sh 'git clone https://github.com/paulozanogmz/menu.git'
            sh 'cd menu && git checkout app'
            sh 'cd menu && git log --oneline -10'
        }
    }
}