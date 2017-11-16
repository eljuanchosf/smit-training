# Day 4

## Part 1

* Create an Org and an Space (https://docs.cloudfoundry.org/concepts/roles.html)
* Create a User
* Assign Developer permissions to the user
* Create a Quota and assign it to an Space
* Switch to the recently created user
* Deploy an application that doesn’t require services (look into https://github.com/Altoros/cf-example-sinatra)
* https://docs.cloudfoundry.org/devguide/deploy-apps/manifest.html
* Create a service instance of a MySQL database
* Switch the branch application to “with-service”.
* Bind the service instance to your application
* Redeploy!

## Part 2

* Create an application manifest with:
  * Application name
  * 2 instances
  * 128M of memory
  * An environment variable that says “Hello!”
  * Specify the service binding here
* Deploy with that application manifest.
* Check the environment variables of that application (tip: use cf env)
* Write a BASH/BAT/PowerShell (choose your poison) script for a Blue/Green deployment of your application
* Install the “Firehose Plugin” to your CF CLI.
* Explore the uses of this plugin

## Part 3

* Download jq (https://stedolan.github.io/jq/)
* Create a BASH script that displays all the applications in this CF deployment by name.
  * Hint: use cf curl /v2/apps
* Modify the script to get the space_guid and for each application, retrieve the service instances that are in the space containing the application.
  * Hint: go to https://apidocs.cloudfoundry.org/ to figure out the API endpoints required for this task.
