/*
 * SwaggerPetstoreLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.swagger.petstore.ApiHelper;
import io.swagger.petstore.Server;
import io.swagger.petstore.exceptions.ApiException;
import io.swagger.petstore.http.request.HttpMethod;
import io.swagger.petstore.models.User;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class UserController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public UserController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This can only be done by the logged in user.
     * @param  body  Required parameter: Created user object
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void createUser(
            final User body) throws ApiException, IOException {
        prepareCreateUserRequest(body).execute();
    }

    /**
     * This can only be done by the logged in user.
     * @param  body  Required parameter: Created user object
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> createUserAsync(
            final User body) {
        try { 
            return prepareCreateUserRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createUser.
     */
    private ApiCall<Void, ApiException> prepareCreateUserRequest(
            final User body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("successful operation",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates list of users with given input array.
     * @param  body  Required parameter: List of user object
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void createUsersWithListInput(
            final List<User> body) throws ApiException, IOException {
        prepareCreateUsersWithListInputRequest(body).execute();
    }

    /**
     * Creates list of users with given input array.
     * @param  body  Required parameter: List of user object
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> createUsersWithListInputAsync(
            final List<User> body) {
        try { 
            return prepareCreateUsersWithListInputRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createUsersWithListInput.
     */
    private ApiCall<Void, ApiException> prepareCreateUsersWithListInputRequest(
            final List<User> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/createWithList")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("successful operation",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates list of users with given input array.
     * @param  body  Required parameter: List of user object
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void createUsersWithArrayInput(
            final List<User> body) throws ApiException, IOException {
        prepareCreateUsersWithArrayInputRequest(body).execute();
    }

    /**
     * Creates list of users with given input array.
     * @param  body  Required parameter: List of user object
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> createUsersWithArrayInputAsync(
            final List<User> body) {
        try { 
            return prepareCreateUsersWithArrayInputRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createUsersWithArrayInput.
     */
    private ApiCall<Void, ApiException> prepareCreateUsersWithArrayInputRequest(
            final List<User> body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/createWithArray")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("successful operation",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Logs user into the system.
     * @param  username  Required parameter: The user name for login
     * @param  password  Required parameter: The password for login in clear text
     * @return    Returns the String response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public String loginUser(
            final String username,
            final String password) throws ApiException, IOException {
        return prepareLoginUserRequest(username, password).execute();
    }

    /**
     * Logs user into the system.
     * @param  username  Required parameter: The user name for login
     * @param  password  Required parameter: The password for login in clear text
     * @return    Returns the String response from the API call
     */
    public CompletableFuture<String> loginUserAsync(
            final String username,
            final String password) {
        try { 
            return prepareLoginUserRequest(username, password).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for loginUser.
     */
    private ApiCall<String, ApiException> prepareLoginUserRequest(
            final String username,
            final String password) throws IOException {
        return new ApiCall.Builder<String, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/login")
                        .queryParam(param -> param.key("username")
                                .value(username))
                        .queryParam(param -> param.key("password")
                                .value(password))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> new String(response))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Invalid username/password supplied",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Logs out current logged in user session.
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void logoutUser() throws ApiException, IOException {
        prepareLogoutUserRequest().execute();
    }

    /**
     * Logs out current logged in user session.
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> logoutUserAsync() {
        try { 
            return prepareLogoutUserRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for logoutUser.
     */
    private ApiCall<Void, ApiException> prepareLogoutUserRequest() throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/logout")
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("successful operation",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get user by user name.
     * @param  username  Required parameter: The name that needs to be fetched. Use user1 for
     *         testing.
     * @return    Returns the User response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public User getUserByName(
            final String username) throws ApiException, IOException {
        return prepareGetUserByNameRequest(username).execute();
    }

    /**
     * Get user by user name.
     * @param  username  Required parameter: The name that needs to be fetched. Use user1 for
     *         testing.
     * @return    Returns the User response from the API call
     */
    public CompletableFuture<User> getUserByNameAsync(
            final String username) {
        try { 
            return prepareGetUserByNameRequest(username).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getUserByName.
     */
    private ApiCall<User, ApiException> prepareGetUserByNameRequest(
            final String username) throws IOException {
        return new ApiCall.Builder<User, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/{username}")
                        .templateParam(param -> param.key("username").value(username)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, User.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Invalid username supplied",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("User not found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This can only be done by the logged in user.
     * @param  username  Required parameter: name that need to be updated
     * @param  body  Required parameter: Updated user object
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void updateUser(
            final String username,
            final User body) throws ApiException, IOException {
        prepareUpdateUserRequest(username, body).execute();
    }

    /**
     * This can only be done by the logged in user.
     * @param  username  Required parameter: name that need to be updated
     * @param  body  Required parameter: Updated user object
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> updateUserAsync(
            final String username,
            final User body) {
        try { 
            return prepareUpdateUserRequest(username, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateUser.
     */
    private ApiCall<Void, ApiException> prepareUpdateUserRequest(
            final String username,
            final User body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/{username}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("username").value(username)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Invalid user supplied",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("User not found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This can only be done by the logged in user.
     * @param  username  Required parameter: The name that needs to be deleted
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public void deleteUser(
            final String username) throws ApiException, IOException {
        prepareDeleteUserRequest(username).execute();
    }

    /**
     * This can only be done by the logged in user.
     * @param  username  Required parameter: The name that needs to be deleted
     * @return    Returns the void response from the API call
     */
    public CompletableFuture<Void> deleteUserAsync(
            final String username) {
        try { 
            return prepareDeleteUserRequest(username).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deleteUser.
     */
    private ApiCall<Void, ApiException> prepareDeleteUserRequest(
            final String username) throws IOException {
        return new ApiCall.Builder<Void, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SERVER1.value())
                        .path("/user/{username}")
                        .templateParam(param -> param.key("username").value(username)
                                .shouldEncode(true))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Invalid username supplied",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("User not found",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}