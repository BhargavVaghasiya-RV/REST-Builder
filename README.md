# REST-Builder

## In this example we will show you how to use REST-Builder of the liferay.

### Please clone this project

You can download following files only it you want to show how other files are created automativally.

From Student-details-api
1. https://github.com/BhargavVaghasiya-RV/REST-Builder/blob/master/rest-builder/modules/student-rest-builder/student-details-api/bnd.bnd
2. https://github.com/BhargavVaghasiya-RV/REST-Builder/blob/master/rest-builder/modules/student-rest-builder/student-details-api/build.gradle

From Student-details-impl
1. https://github.com/BhargavVaghasiya-RV/REST-Builder/blob/master/rest-builder/modules/student-rest-builder/student-details-impl/bnd.bnd
2. https://github.com/BhargavVaghasiya-RV/REST-Builder/blob/master/rest-builder/modules/student-rest-builder/student-details-impl/build.gradle
3. https://github.com/BhargavVaghasiya-RV/REST-Builder/blob/master/rest-builder/modules/student-rest-builder/student-details-impl/rest-config.yaml
4. https://github.com/BhargavVaghasiya-RV/REST-Builder/blob/master/rest-builder/modules/student-rest-builder/student-details-impl/rest-openapi.yaml

Download above files in spacific folder

Open this project in eclipse

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
