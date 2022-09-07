job('Job2-DSL') {
    scm {
       git('https://github.com/namanjainyr/ChatApp.git') { node -> // is hudson.plugins.git.GitSCM
            node / gitConfigNamef ('Naman Jain')
            node / gitConfigEmaiK ('namanjainyr@gmail.com')
       }
    }
    triggers {
     scm('H/5 * * * *')
    }
    wrappers {
      nodejs('nodejs')  // this is the name of the NodeJS installation in
                        // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
