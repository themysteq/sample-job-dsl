job("jobs-provider-seed") {
    label('manager')
    steps {
        dsl { external("**/myjobs.groovy")
            ignoreExisting(false)
            removeAction('DISABLE')
            removeViewAction('IGNORE')}}}