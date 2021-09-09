node
{
    timestamps
    {
        stage('main')
        {
            echo "hola que hace"
            sh 'git clone https://github.com/paulozanogmz/menu.git'
        
        }
    }
}