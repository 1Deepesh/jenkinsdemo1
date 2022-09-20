/*
   Instead of duplicating a lot of build related code in each repo include the common one from this file using the command below:

   Don't forget to put configure GITHUB_TOKEN inside Jenkins as it is a very bad idea to include it inside your code.
*/

node {
    // Load the file 'externalMethod.groovy' from the current directory, into a variable called "externalMethod".
    def externalMethod = load("externalMethod.groovy")

    // Call the method we defined in externalMethod.
    externalMethod.lookAtThis("Steve")

    // Now load 'externalCall.groovy'.
    def externalCall = load("externalCall.groovy")

    // We can just run it with "externalCall(...)" since it has a call method.
    externalCall("Steve")
}
