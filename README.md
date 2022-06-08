# Keycloak Playground

Keycloak is an open source Identity and Access Management solution targeted towards modern applications and services.

Keycloak offers features such as Single-Sign-On (SSO), Identity Brokering and Social Login, User Federation, Client
Adapters, an Admin Console, and an Account Management Console.

## Setting Up a Keycloak Server

1. Downloading Keycloak
2. Creating a Realm: A `realm` in Keycloak is the equivalent of a `tenant`. It allows creating isolated groups of
   applications and users. By default, there is a single realm in Keycloak called `master`. This is dedicated to manage
   Keycloak and should not be used for your own applications.
3. Create a User and a Role: Initially there are no users in a new realm
4. Creating a Client: The `Valid Redirect URIs` field should contain the application URL(s) that will use this client
   for authentication

- Login with admin user to `http://localhost:8080`
- Keycloak provides a REST API for generating and refreshing access tokens. We can easily use this API to create our own
  login page. First, we need to acquire an access token from Keycloak by sending a POST request to this URL:
  `http://localhost:8080/auth/realms/SpringBootKeycloak/protocol/openid-connect/token`

### References

https://betterprogramming.pub/how-to-authenticate-your-spring-boot-application-with-keycloak-1e9ccb5f2478

https://medium.com/@bcarunmail/securing-rest-api-using-keycloak-and-spring-oauth2-6ddf3a1efcc2

https://www.baeldung.com/spring-boot-keycloak