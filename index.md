# REST-Builder

## In this example we will show you how to use REST-Builder in the liferay 7.3.2.

## So here we go....

### First of all please clone this project Open it in eclipse.

Do BuildREST in the Student-details-impl

Then build and deploy the Student-details-api

Then build and deploy the Student-details-impl

Check the liferay logs both project should be started successfully

Open liferay control panel  >>  Configuration  >>  OAuth 2 Administration  >>  Add OAuth 2 Administration

Give Application name, Callback URIs

Select Headless server from the Client profile and save it.

Once you save it, it will show you other section in same page with the name "Scope"

Select the name of the rest builder (Which you have mentioned in the rest-config file)

again save it.

Now you can test your rest api using postman application.
