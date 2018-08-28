package tech

job('first-simple-job'){
 	label('cloud-worker')
        steps {
            shell('echo "Hello world!"')
        }
    }
