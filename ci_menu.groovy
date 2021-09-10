node
{
    timestamps
    {
        stage('WA_setup')
        { 
            sh 'rm -rf menu'
            sh 'git clone https://github.com/paulozanogmz/menu.git'
            sh 'cd menu && git checkout app'
            sh 'cd menu && git log --oneline -15'
        }
        stage('Run_app')
        {
            sh 'cd menu && python3 welcome.py'
            sh 'cd menu && python3 welcome.py >> output.txt'
        }
        stage('Run_unit-test')
        {
            sh 'cd menu && git checkout unit-test'
        }
    }
} 