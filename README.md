## Sample Job DSL scripts ##

### How to Use? ###
Just add this to your seed jobs to create "master" job for DSL jobs.
```groovy
   job("jobs-provider-seed") 
      {
        label('manager')

        scm { 
            github('themysteq/sample-job-dsl','master')
        }

        steps {
            dsl {
                external("**/*.groovy")
                ignoreExisting(false)
                removeAction('DISABLE')
                removeViewAction('IGNORE')
            }
        }
    }
```
### Warning! ###
If you add above code as seed job it will download all "jobs" from this repo and create them so please check if you really want to create all these jobs.
