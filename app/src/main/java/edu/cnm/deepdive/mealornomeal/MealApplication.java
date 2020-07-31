package edu.cnm.deepdive.mealornomeal;

import android.app.Application;
import edu.cnm.deepdive.mealornomeal.service.GoogleSignInService;

public class MealApplication extends Application {
    @Override
    public void onCreate() {
      super.onCreate();
      GoogleSignInService.setContext(this);
    }
}
