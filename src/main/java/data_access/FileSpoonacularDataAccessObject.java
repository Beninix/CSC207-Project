package data_access;

import entity.Recipe;
import entity.User;
import okhttp3.*;
import org.json.JSONException;
import org.json.JSONObject;
import use_case.note.DataAccessException;
import use_case.note.NoteDataAccessInterface;
import use_case.spoonacular.SpoonacularDataAccessInterface;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * The DAO for accessing notes stored in the database.
 * <p>This class demonstrates how your group can use the password-protected user
 * endpoints of the API used in lab 5 to store persistent data in your program.
 * </p>
 * <p>You can also refer to the lab 5 code for signing up a new user and other use cases.
 * </p>
 * See
 * <a href=
 * "https://www.postman.com/cloudy-astronaut-813156/
 * csc207-grade-apis-demo/documentation/fg3zkjm/5-password-protected-user">
 *     the documentation</a>
 * of the API for more details.
 */
public class FileSpoonacularDataAccessObject implements SpoonacularDataAccessInterface {
    //https://api.spoonacular.com/recipes/complexSearch?apiKey=a78e64e2c9194022b1a3d7f6303c4062&number=100&instructionsRequired=true&addRecipeInformation=true
    private static final int SUCCESS_CODE = 200;
    private static final int CREDENTIAL_ERROR = 401;
    private static final String CONTENT_TYPE_LABEL = "Content-Type";
    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String STATUS_CODE_LABEL = "status_code";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String MESSAGE = "message";
    private static final String BASEURL = "https://api.spoonacular.com/recipes/complexSearch?";
    private static final String TOKEN = "token";
    private static final String NUMBER = "number=100";
    private static final String INSTRUCTIONSREQUIRED = "&instructionsRequired=true";
    private static final String ADDINFORMATION = "&addRecipeInformation=true";
    @Override
    public List<Recipe> loadRecipes(Map<String, Boolean> diets) throws DataAccessException {
        // Make an API call to get the user object.
        final String token = "apiKey=" + System.getenv(TOKEN);
        final OkHttpClient client = new OkHttpClient().newBuilder().build();
        final Request request = new Request.Builder()
                .url(BASEURL + TOKEN + NUMBER + INSTRUCTIONSREQUIRED + ADDINFORMATION)
                .addHeader("Content-Type", CONTENT_TYPE_JSON)
                .build();
        try {
            final Response response = client.newCall(request).execute();

            final JSONObject responseBody = new JSONObject(response.body().string());

            if (responseBody.getInt(STATUS_CODE_LABEL) == SUCCESS_CODE) {
                final JSONObject userJSONObject = responseBody.getJSONObject("result");
                final JSONObject data = userJSONObject.getJSONObject("info");
                return new ArrayList<Recipe>();
            }
            else {
                throw new DataAccessException(responseBody.getString(MESSAGE));
            }
        }
        catch (IOException | JSONException ex) {
            throw new RuntimeException(ex);
        }
    }
    @Override
    public List<Recipe> loadRecipes(int time){
        final String token = System.getenv(TOKEN);
        return null;
    }
}
