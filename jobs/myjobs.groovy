


job("my-first-job-dsl") {

    label('manager')
    logRotator {
        numToKeep 5
    }
    steps {
       shell('echo "Hello world"')
    }
}