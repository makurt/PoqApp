# Poq.Android.TemplateClient

### Create an app for a new client :

1. Edit the file `renameTemplateScript` in your local copy renaming the fields
`NEW_NAME-*` for the name of your app with the correct format in each field

2. Execute the script `./renameTemplateScript` (`chmod +x` if execution permissions are missing)

3. Create a new git repository and a new git tag for your current branch. Template client comes
preconfigured to create the app release name using the closest git tag.
Add the needed teams to the repo

4. Before opening your new project on android studio, you will need to add a user name and password to be able to download the Poq platform as a Gradle dependency. To do so, visit the `development section` in the android playbook and go to `Gradle - Nexus User`

5. Open your new project with Android Studio choosing the folder `Poq.Android.TemplateClient-dev/Poq.Android.{ClientName}`. You can rename the enclosing folder from Poq.Android.TemplateClient-dev to your need

6. Add your app icon as you would do for a regular app
